import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.*;
import java.sql.*;
import java.util.logging.*;

public class CashPayment extends javax.swing.JFrame {

        public CashPayment(String totalValue, int transac_id, String usernameemail) {
                setTitle("Cash Payment Method");
                initComponents(totalValue, transac_id, usernameemail);
        }

        public CashPayment() {
        }

        private void initComponents(String totalValue, int transac_id, String usernameemail) {

                popupMenu = new javax.swing.JPopupMenu();
                homePageMenuBtn = new javax.swing.JMenuItem();
                accountMenuBtn = new javax.swing.JMenuItem();
                transactionMenuBtn = new javax.swing.JMenuItem();
                logoutMenuBtn = new javax.swing.JMenuItem();
                mainJpanel = new javax.swing.JPanel();
                totalAmountValueLbl = new javax.swing.JLabel();
                totalAmountLbl = new javax.swing.JLabel();
                changePaymentMethodBtn = new javax.swing.JButton();
                orLbl = new javax.swing.JLabel();
                confirmBtn = new javax.swing.JButton();
                transactionIdLbl = new javax.swing.JLabel();
                buttonInstructionLbl = new javax.swing.JLabel();
                payingInstruction2Lbl = new javax.swing.JLabel();
                payingInstructionLbl = new javax.swing.JLabel();
                cashLbl = new javax.swing.JLabel();
                topJpanel = new javax.swing.JPanel();
                menuBtn = new javax.swing.JButton();
                carRentalLbl = new javax.swing.JLabel();

                homePageMenuBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
                homePageMenuBtn.setText("Home Page");
                popupMenu.add(homePageMenuBtn);
                homePageMenuBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                homePageMenuBtnActionPerformed(evt, usernameemail);
                        }
                });

                accountMenuBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
                accountMenuBtn.setText("Account");
                popupMenu.add(accountMenuBtn);
                accountMenuBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                accountMenuBtnActionPerformed(evt, usernameemail);
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
                setBackground(new java.awt.Color(153, 153, 255));
                setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

                mainJpanel.setBackground(new java.awt.Color(204, 255, 204));

                totalAmountValueLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
                totalAmountValueLbl.setText(totalValue);

                totalAmountLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
                totalAmountLbl.setText("Total Amount:");

                changePaymentMethodBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
                changePaymentMethodBtn.setText("CHANGE PAYMENT METHOD");
                changePaymentMethodBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                changePaymentMethodBtnActionPerformed(evt, transac_id, totalValue, usernameemail);
                        }
                });

                orLbl.setText("Or");

                confirmBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
                confirmBtn.setText("CONFIRM PAYMENT");
                confirmBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                confirmBtnActionPerformed(evt, transac_id, usernameemail);
                        }
                });

                transactionIdLbl.setFont(new java.awt.Font("Segoe UI", 1, 18));
                transactionIdLbl.setText(String.valueOf(transac_id));
                transactionIdLbl.setHorizontalAlignment(SwingConstants.CENTER);
                transactionIdLbl.setVerticalAlignment(SwingConstants.CENTER);

                buttonInstructionLbl.setText("After making the payment, please click the button below.");

                payingInstruction2Lbl.setText("show your Transaction I.D.:");

                payingInstructionLbl.setText("To pay using cash, go to our cashier at any branch and");

                cashLbl.setFont(new java.awt.Font("Segoe UI", 1, 36));
                cashLbl.setText("Cash");

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
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(menuBtn)
                                                                .addContainerGap()));
                topJpanelLayout.setVerticalGroup(
                                topJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(topJpanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(
                                                                                topJpanelLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(menuBtn)
                                                                                                .addComponent(carRentalLbl))
                                                                .addContainerGap(7, Short.MAX_VALUE)));

                javax.swing.GroupLayout mainJpanelLayout = new javax.swing.GroupLayout(mainJpanel);
                mainJpanel.setLayout(mainJpanelLayout);
                mainJpanelLayout.setHorizontalGroup(
                                mainJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(mainJpanelLayout.createSequentialGroup()
                                                                .addGap(45, 45, 45)
                                                                .addGroup(mainJpanelLayout
                                                                                .createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(mainJpanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(96, 96, 96)
                                                                                                .addComponent(cashLbl)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                127,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                mainJpanelLayout.createSequentialGroup()
                                                                                                                .addComponent(totalAmountLbl)
                                                                                                                .addGap(18, 18, 18)
                                                                                                                .addComponent(totalAmountValueLbl,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                154,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                mainJpanelLayout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(mainJpanelLayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(76, 76, 76)
                                                                                                                                .addGroup(mainJpanelLayout
                                                                                                                                                .createParallelGroup(
                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                false)
                                                                                                                                                .addComponent(payingInstruction2Lbl,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                .addComponent(transactionIdLbl,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                140,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                                .addComponent(buttonInstructionLbl)
                                                                                                                .addComponent(payingInstructionLbl)
                                                                                                                .addGroup(mainJpanelLayout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addGap(72, 72, 72)
                                                                                                                                .addComponent(confirmBtn))
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                mainJpanelLayout
                                                                                                                                                .createSequentialGroup()
                                                                                                                                                .addGap(52, 52, 52)
                                                                                                                                                .addGroup(mainJpanelLayout
                                                                                                                                                                .createParallelGroup(
                                                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                                mainJpanelLayout.createSequentialGroup()
                                                                                                                                                                                                .addComponent(orLbl)
                                                                                                                                                                                                .addGap(148, 148,
                                                                                                                                                                                                                148))
                                                                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                                mainJpanelLayout.createSequentialGroup()
                                                                                                                                                                                                .addComponent(changePaymentMethodBtn)
                                                                                                                                                                                                .addGap(55, 55, 55))))))
                                                                .addContainerGap(29, Short.MAX_VALUE))
                                                .addComponent(topJpanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                mainJpanelLayout.setVerticalGroup(
                                mainJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainJpanelLayout
                                                                .createSequentialGroup()
                                                                .addComponent(topJpanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                19,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(cashLbl)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(
                                                                                mainJpanelLayout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(totalAmountLbl)
                                                                                                .addComponent(totalAmountValueLbl))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(payingInstructionLbl)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(payingInstruction2Lbl)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(transactionIdLbl)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(buttonInstructionLbl)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(confirmBtn)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(orLbl)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(changePaymentMethodBtn)
                                                                .addGap(23, 23, 23)));

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(mainJpanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(mainJpanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

                pack();
        }

        private void menuBtnActionPerformed(java.awt.event.ActionEvent evt) {
                popupMenu.show(menuBtn, 0, menuBtn.getHeight());
        }

        private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt, int transac_id, String usernameemail) {
                try {
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental", "root",
                                        "hansignacio");
                        Statement stm = con.createStatement();

                        String sql = "Select * FROM transactions WHERE transac_id='" + transac_id + "'";

                        ResultSet rs = stm.executeQuery(sql);
                        if (rs.next()) {
                                String updatePmSql = "UPDATE transactions SET payment_method = ? WHERE transac_id= ?";

                                String updateStatusSql = "UPDATE transactions SET transac_status = ? WHERE transac_id= ?";

                                PreparedStatement Pmpstmt = con.prepareStatement(updatePmSql);
                                PreparedStatement Statuspstmt = con.prepareStatement(updateStatusSql);

                                Pmpstmt.setString(1, "Cash");
                                Pmpstmt.setInt(2, transac_id);
                                Statuspstmt.setString(1, "Paid");
                                Statuspstmt.setInt(2, transac_id);

                                int PmrowsAffected = Pmpstmt.executeUpdate();
                                int StatusrowsAffected = Statuspstmt.executeUpdate();
                                if (PmrowsAffected > 0 && StatusrowsAffected > 0) {
                                        JOptionPane.showMessageDialog(this,
                                                        "Payment Successful. We will contact you for your rented car shortly.");
                                        dispose();
                                        HomePage hpage = new HomePage(usernameemail);
                                        hpage.setVisible(true);
                                } else {
                                        JOptionPane.showMessageDialog(this, "Something went wrong.");
                                }
                        }
                } catch (SQLException ex) {
                        Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception e) {
                        System.out.println(e.getMessage());
                }
        }

        private void changePaymentMethodBtnActionPerformed(java.awt.event.ActionEvent evt, int transact_id,
                        String totalValue, String usernameemail) {
                int response = JOptionPane.showConfirmDialog(this,
                                "Are you sure you want to change payment method?",
                                "Change Payment Method Confirmation",
                                JOptionPane.YES_NO_OPTION,
                                JOptionPane.QUESTION_MESSAGE);

                if (response == JOptionPane.YES_OPTION) {
                        dispose();
                        PaymentMethod pay = new PaymentMethod(transact_id, totalValue, usernameemail);
                        pay.setVisible(true);
                }
        }

        private void homePageMenuBtnActionPerformed(java.awt.event.ActionEvent evt, String usernameemail) {
                int response = JOptionPane.showConfirmDialog(this,
                                "Going back to Home Page will cancel the payment for this transaction. Are you sure you want go back to Home Page?",
                                "Logout Confirmation",
                                JOptionPane.YES_NO_OPTION,
                                JOptionPane.QUESTION_MESSAGE);

                if (response == JOptionPane.YES_OPTION) {
                        dispose();
                        HomePage hpage = new HomePage(usernameemail);
                        hpage.setVisible(true);
                }
        }

        private void accountMenuBtnActionPerformed(java.awt.event.ActionEvent evt, String usernameemail) {
                int response = JOptionPane.showConfirmDialog(this,
                                "Going back to Account Page will cancel the payment for this transaction. Are you sure you want go back to Home Page?",
                                "Logout Confirmation",
                                JOptionPane.YES_NO_OPTION,
                                JOptionPane.QUESTION_MESSAGE);

                if (response == JOptionPane.YES_OPTION) {
                        dispose();
                        AccountPage accpage = new AccountPage(usernameemail);
                        accpage.setVisible(true);
                }
        }

        private void transactionMenuBtnActionPerformed(java.awt.event.ActionEvent evt, String usernameemail) {
                int response = JOptionPane.showConfirmDialog(this,
                                "Going back to Transaction Page will cancel the payment for this transaction. Are you sure you want go back to Home Page?",
                                "Logout Confirmation",
                                JOptionPane.YES_NO_OPTION,
                                JOptionPane.QUESTION_MESSAGE);

                if (response == JOptionPane.YES_OPTION) {
                        dispose();
                        TransactionPage transac = new TransactionPage(usernameemail);
                        transac.setVisible(true);
                }
        }

        private void logoutMenuBtnActionPerformed(java.awt.event.ActionEvent evt) {
                int response = JOptionPane.showConfirmDialog(this,
                                "Logging out will cancel the payment for this transaction. Are you sure you want to log out?",
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
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(CashPayment.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(CashPayment.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(CashPayment.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(CashPayment.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                try {
                                        CashPayment frame = new CashPayment();
                                        frame.setVisible(true);
                                } catch (Exception e) {
                                        e.printStackTrace();
                                }
                        }
                });
        }

        // Variables declaration
        private javax.swing.JMenuItem accountMenuBtn;
        private javax.swing.JLabel buttonInstructionLbl;
        private javax.swing.JLabel carRentalLbl;
        private javax.swing.JLabel cashLbl;
        private javax.swing.JButton changePaymentMethodBtn;
        private javax.swing.JButton confirmBtn;
        private javax.swing.JMenuItem homePageMenuBtn;
        private javax.swing.JMenuItem logoutMenuBtn;
        private javax.swing.JPanel mainJpanel;
        private javax.swing.JButton menuBtn;
        private javax.swing.JLabel orLbl;
        private javax.swing.JLabel payingInstruction2Lbl;
        private javax.swing.JLabel payingInstructionLbl;
        private javax.swing.JPopupMenu popupMenu;
        private javax.swing.JPanel topJpanel;
        private javax.swing.JLabel totalAmountLbl;
        private javax.swing.JLabel totalAmountValueLbl;
        private javax.swing.JLabel transactionIdLbl;
        private javax.swing.JMenuItem transactionMenuBtn;
        // End of variables declaration
}
