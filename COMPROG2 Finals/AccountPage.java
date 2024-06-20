import java.awt.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.logging.*;

public class AccountPage extends javax.swing.JFrame {

    public AccountPage(String usernameemail) {
        setTitle("Account Page");
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
            DefaultTableModel model = (DefaultTableModel) AccTbl.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                String concatName = rs.getString("lname") + ", " + rs.getString("fname") + " "
                        + rs.getString("minitial") + ".";
                model.addRow(new String[] { concatName, rs.getString("age"), rs.getString("email"),
                        rs.getString("contact_no"),
                        rs.getString("username"), rs.getString("signup_date") });
            }

        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    public AccountPage() {

    }

    private void initComponents(String usernameemail) {

        popupMenu = new javax.swing.JPopupMenu();
        homePageMenuBtn = new javax.swing.JMenuItem();
        transactionMenuBtn = new javax.swing.JMenuItem();
        logoutMenuBtn = new javax.swing.JMenuItem();
        mainJpanel = new javax.swing.JPanel();
        topJpanel = new javax.swing.JPanel();
        menuBtn = new javax.swing.JButton();
        carRentalLbl = new javax.swing.JLabel();
        changeUsernameBtn = new javax.swing.JButton();
        changePassBtn = new javax.swing.JButton();
        accountLbl = new javax.swing.JLabel();
        tblScrollPane = new javax.swing.JScrollPane();
        AccTbl = new javax.swing.JTable();

        homePageMenuBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
        homePageMenuBtn.setText("Home Page");
        popupMenu.add(homePageMenuBtn);
        homePageMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homePageMenuBtnActionPerformed(evt, usernameemail);
            }
        });

        transactionMenuBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
        transactionMenuBtn.setText("Transaction");
        popupMenu.add(transactionMenuBtn);
        transactionMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionMenuBtnActionPerformed(evt, usernameemail);
            }
        });

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

        changeUsernameBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
        changeUsernameBtn.setText("Change Username");
        changeUsernameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeUsernameBtnActionPerformed(evt, usernameemail);
            }
        });

        changePassBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
        changePassBtn.setText("Change Password");
        changePassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassBtnActionPerformed(evt, usernameemail);
            }
        });

        javax.swing.GroupLayout topJpanelLayout = new javax.swing.GroupLayout(topJpanel);
        topJpanel.setLayout(topJpanelLayout);
        topJpanelLayout.setHorizontalGroup(
                topJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(topJpanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(carRentalLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 184,
                                        Short.MAX_VALUE)
                                .addComponent(changeUsernameBtn)
                                .addGap(18, 18, 18)
                                .addComponent(changePassBtn)
                                .addGap(39, 39, 39)
                                .addComponent(menuBtn)
                                .addContainerGap()));
        topJpanelLayout.setVerticalGroup(
                topJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(topJpanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(
                                        topJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(menuBtn)
                                                .addComponent(carRentalLbl)
                                                .addComponent(changeUsernameBtn)
                                                .addComponent(changePassBtn))
                                .addContainerGap(7, Short.MAX_VALUE)));

        accountLbl.setFont(new java.awt.Font("Segoe UI", 1, 36));
        accountLbl.setText("Account");

        AccTbl.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null },
                        { null, null, null, null, null, null }
                },
                new String[] {
                        "Name", "Age", "Email", "Contact Number", "Username", "Sign up Date"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        AccTbl.getTableHeader().setReorderingAllowed(false);
        tblScrollPane.setViewportView(AccTbl);
        if (AccTbl.getColumnModel().getColumnCount() > 0) {
            AccTbl.getColumnModel().getColumn(0).setResizable(false);
            AccTbl.getColumnModel().getColumn(1).setResizable(false);
            AccTbl.getColumnModel().getColumn(2).setResizable(false);
            AccTbl.getColumnModel().getColumn(3).setResizable(false);
            AccTbl.getColumnModel().getColumn(4).setResizable(false);
            AccTbl.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout mainJpanelLayout = new javax.swing.GroupLayout(mainJpanel);
        mainJpanel.setLayout(mainJpanelLayout);
        mainJpanelLayout.setHorizontalGroup(
                mainJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(topJpanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainJpanelLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(accountLbl)
                                .addGap(294, 294, 294))
                        .addGroup(mainJpanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(tblScrollPane)));
        mainJpanelLayout.setVerticalGroup(
                mainJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainJpanelLayout.createSequentialGroup()
                                .addComponent(topJpanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(accountLbl)
                                .addGap(18, 18, 18)
                                .addComponent(tblScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 170,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 105, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainJpanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(mainJpanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));

        pack();
    }

    private void menuBtnActionPerformed(java.awt.event.ActionEvent evt) {
        popupMenu.show(menuBtn, 0, menuBtn.getHeight());
    }

    private void changeUsernameBtnActionPerformed(java.awt.event.ActionEvent evt, String usernameemail) {
        String unameChange = "username";
        dispose();
        ChangePasswordOrUsernamePage change = new ChangePasswordOrUsernamePage(usernameemail, unameChange);
        change.setVisible(true);
    }

    private void changePassBtnActionPerformed(java.awt.event.ActionEvent evt, String usernameemail) {
        String passChange = "password";
        dispose();
        ChangePasswordOrUsernamePage change = new ChangePasswordOrUsernamePage(usernameemail, passChange);
        change.setVisible(true);
    }

    private void homePageMenuBtnActionPerformed(java.awt.event.ActionEvent evt, String usernameemail) {
        dispose();
        HomePage hpage = new HomePage(usernameemail);
        hpage.setVisible(true);
    }

    private void transactionMenuBtnActionPerformed(java.awt.event.ActionEvent evt, String usernameemail) {
        dispose();
        TransactionPage transac = new TransactionPage(usernameemail);
        transac.setVisible(true);
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
            Logger.getLogger(AccountPage.class.getName()).log(Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(AccountPage.class.getName()).log(Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(AccountPage.class.getName()).log(Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(AccountPage.class.getName()).log(Level.SEVERE, null,
                    ex);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AccountPage frame = new AccountPage();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Variables declaration
    private javax.swing.JTable AccTbl;
    private javax.swing.JLabel accountLbl;
    private javax.swing.JLabel carRentalLbl;
    private javax.swing.JButton changePassBtn;
    private javax.swing.JButton changeUsernameBtn;
    private javax.swing.JMenuItem homePageMenuBtn;
    private javax.swing.JMenuItem logoutMenuBtn;
    private javax.swing.JPanel mainJpanel;
    private javax.swing.JButton menuBtn;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JScrollPane tblScrollPane;
    private javax.swing.JPanel topJpanel;
    private javax.swing.JMenuItem transactionMenuBtn;
    // End of variables declaration
}
