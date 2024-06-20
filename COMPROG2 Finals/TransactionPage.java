import java.awt.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;

public class TransactionPage extends javax.swing.JFrame {

    public TransactionPage(String usernameemail) {
        setTitle("Transaction Page");
        initComponents(usernameemail);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental", "root",
                    "hansignacio");

            String sql = "select * from customers where username='" + usernameemail + "' OR email='"
                    + usernameemail
                    + "'";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery(sql);
            DefaultTableModel model = (DefaultTableModel) transacTbl.getModel();
            model.setRowCount(0);
            if (rs.next()) {
                String customer_id = rs.getString("customer_id");

                String transacSql = "Select transactions.transac_id, customers.lname, customers.fname, customers.minitial, car_types.car_name, transactions.loc, transactions.rent_date, transactions.return_date, transactions.total_amount, transactions.payment_method, transactions.transac_status, transactions.transac_date FROM transactions JOIN customers ON transactions.customer_id = customers.customer_id JOIN car_types ON transactions.car_id = car_types.car_id WHERE transactions.customer_id='"
                        + customer_id + "' ORDER BY transactions.transac_date DESC";
                PreparedStatement transacPst = con.prepareStatement(transacSql);
                ResultSet transacRs = transacPst.executeQuery();
                while (transacRs.next()) {
                    String concatName = transacRs.getString("lname") + ", " + transacRs.getString("fname") + " "
                            + transacRs.getString("minitial") + ".";
                    String rentAndReturnDate = transacRs.getString("rent_date") + "-"
                            + transacRs.getString("return_date");
                    model.addRow(new String[] { transacRs.getString("transac_id"), concatName,
                            transacRs.getString("car_name"),
                            transacRs.getString("loc"),
                            rentAndReturnDate,
                            transacRs.getString("total_amount"), transacRs.getString("payment_method"),
                            transacRs.getString("transac_status"), transacRs.getString("transac_date") });
                }
            } else {
                JOptionPane.showMessageDialog(this, "No transaction yet");
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public TransactionPage() {

    }

    private void initComponents(String usernameemail) {

        popupMenu = new javax.swing.JPopupMenu();
        homePageMenuBtn = new javax.swing.JMenuItem();
        accountMenuBtn = new javax.swing.JMenuItem();
        logoutMenuBtn = new javax.swing.JMenuItem();
        mainJpanel = new javax.swing.JPanel();
        topJpanel = new javax.swing.JPanel();
        menuBtn = new javax.swing.JButton();
        carRentalLbl = new javax.swing.JLabel();
        transactHistoryLbl = new javax.swing.JLabel();
        transacTblJscrollpane = new javax.swing.JScrollPane();
        transacTbl = new javax.swing.JTable();

        homePageMenuBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
        homePageMenuBtn.setText("Home Page");
        homePageMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homePageMenuBtnActionPerformed(evt, usernameemail);
            }
        });
        popupMenu.add(homePageMenuBtn);

        accountMenuBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
        accountMenuBtn.setText("Account");
        accountMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountMenuBtnActionPerformed(evt, usernameemail);
            }
        });
        popupMenu.add(accountMenuBtn);

        logoutMenuBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
        popupMenu.add(logoutMenuBtn);
        logoutMenuBtn.setOpaque(true);
        logoutMenuBtn.setBackground(Color.RED);
        logoutMenuBtn.setText("Logout");
        logoutMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutMenuBtnActionPerformed(evt);
            }
        });
        popupMenu.add(logoutMenuBtn);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainJpanel.setBackground(new java.awt.Color(204, 255, 204));

        topJpanel.setBackground(new java.awt.Color(153, 0, 153));
        topJpanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        menuBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
        menuBtn.setText("Menu");
        menuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBtnActionPerformed(evt);
            }
        });

        carRentalLbl.setFont(new java.awt.Font("Segoe Script", 1, 18));
        carRentalLbl.setForeground(new java.awt.Color(144, 224, 192));
        carRentalLbl.setText("CAR RENTAL");

        javax.swing.GroupLayout topJpanelLayout = new javax.swing.GroupLayout(topJpanel);
        topJpanel.setLayout(topJpanelLayout);
        topJpanelLayout.setHorizontalGroup(
                topJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(topJpanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(carRentalLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(menuBtn)
                                .addContainerGap()));
        topJpanelLayout.setVerticalGroup(
                topJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(topJpanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(
                                        topJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(menuBtn)
                                                .addComponent(carRentalLbl))
                                .addContainerGap(7, Short.MAX_VALUE)));

        transactHistoryLbl.setFont(new java.awt.Font("Segoe UI", 1, 36));
        transactHistoryLbl.setText("Transaction History");

        transacTbl.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null },
                        { null, null, null, null, null, null, null, null, null }
                },
                new String[] {
                        "Transaction I.D.", "Name of Customer", "Car Name", "Location ", "Rent Date and Return Date",
                        "Total Amount", "Payment Method", "Transaction Status", "Transaction Date"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        transacTbl.getTableHeader().setReorderingAllowed(false);
        transacTblJscrollpane.setViewportView(transacTbl);
        if (transacTbl.getColumnModel().getColumnCount() > 0) {
            transacTbl.getColumnModel().getColumn(0).setResizable(false);
            transacTbl.getColumnModel().getColumn(1).setResizable(false);
            transacTbl.getColumnModel().getColumn(2).setResizable(false);
            transacTbl.getColumnModel().getColumn(3).setResizable(false);
            transacTbl.getColumnModel().getColumn(4).setResizable(false);
            transacTbl.getColumnModel().getColumn(5).setResizable(false);
            transacTbl.getColumnModel().getColumn(6).setResizable(false);
            transacTbl.getColumnModel().getColumn(7).setResizable(false);
            transacTbl.getColumnModel().getColumn(8).setResizable(false);
        }

        javax.swing.GroupLayout mainJpanelLayout = new javax.swing.GroupLayout(mainJpanel);
        mainJpanel.setLayout(mainJpanelLayout);
        mainJpanelLayout.setHorizontalGroup(
                mainJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(topJpanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainJpanelLayout.createSequentialGroup()
                                .addComponent(transacTblJscrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 1239,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(mainJpanelLayout.createSequentialGroup()
                                .addGap(454, 454, 454)
                                .addComponent(transactHistoryLbl)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        mainJpanelLayout.setVerticalGroup(
                mainJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainJpanelLayout.createSequentialGroup()
                                .addComponent(topJpanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(transactHistoryLbl)
                                .addGap(18, 18, 18)
                                .addComponent(transacTblJscrollpane, javax.swing.GroupLayout.PREFERRED_SIZE, 307,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 90, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainJpanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainJpanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }

    private void menuBtnActionPerformed(java.awt.event.ActionEvent evt) {
        popupMenu.show(menuBtn, 0, menuBtn.getHeight());
    }

    private void homePageMenuBtnActionPerformed(java.awt.event.ActionEvent evt, String usernameemail) {
        dispose();
        HomePage hpage = new HomePage(usernameemail);
        hpage.setVisible(true);
    }

    private void accountMenuBtnActionPerformed(java.awt.event.ActionEvent evt, String usernameemail) {
        dispose();
        AccountPage accpage = new AccountPage(usernameemail);
        accpage.setVisible(true);
    }

    private void logoutMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {
        int response = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to log out?",
                "Logout Confirmation",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            dispose();
            loginForm login = new loginForm();
            login.setVisible(true);
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TransactionPage.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransactionPage.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransactionPage.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransactionPage.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TransactionPage frame = new TransactionPage();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Variables declaration
    private javax.swing.JMenuItem accountMenuBtn;
    private javax.swing.JLabel carRentalLbl;
    private javax.swing.JMenuItem homePageMenuBtn;
    private javax.swing.JMenuItem logoutMenuBtn;
    private javax.swing.JPanel mainJpanel;
    private javax.swing.JButton menuBtn;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JPanel topJpanel;
    private javax.swing.JTable transacTbl;
    private javax.swing.JScrollPane transacTblJscrollpane;
    private javax.swing.JLabel transactHistoryLbl;
    // End of variables declaration
}
