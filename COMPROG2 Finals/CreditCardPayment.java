import java.awt.*;
import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import java.awt.event.*;

public class CreditCardPayment extends javax.swing.JFrame {

    public CreditCardPayment(String totalValue, int transac_id,
            String usernameemail) {
        setTitle("Credit Card Payment Method");
        initComponents(totalValue, transac_id, usernameemail);
    }

    public CreditCardPayment() {
    }

    private void initComponents(String totalValue, int transac_id,
            String usernameemail) {

        popupMenu = new javax.swing.JPopupMenu();
        homePageMenuBtn = new javax.swing.JMenuItem();
        accountMenuBtn = new javax.swing.JMenuItem();
        transactionMenuBtn = new javax.swing.JMenuItem();
        logoutMenuBtn = new javax.swing.JMenuItem();
        mainJpanel = new javax.swing.JPanel();
        topJpanel = new javax.swing.JPanel();
        menuBtn = new javax.swing.JButton();
        carRentalLbl = new javax.swing.JLabel();
        creditCardLbl = new javax.swing.JLabel();
        cardNoLbl = new javax.swing.JLabel();
        cardNoTextfield = new javax.swing.JTextField();
        payNowBtn = new javax.swing.JButton();
        orLbl = new javax.swing.JLabel();
        changePaymentMethodBtn = new javax.swing.JButton();

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

        transactionMenuBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
        transactionMenuBtn.setText("Transaction");
        transactionMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transactionMenuBtnActionPerformed(evt, usernameemail);
            }
        });
        popupMenu.add(transactionMenuBtn);

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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166,
                                        Short.MAX_VALUE)
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

        creditCardLbl.setFont(new java.awt.Font("Segoe UI", 1, 36));
        creditCardLbl.setText("Credit Card");

        cardNoLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
        cardNoLbl.setText("Type your card No.:");

        cardNoTextfield.setFont(new java.awt.Font("Segoe UI", 1, 12));

        payNowBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
        payNowBtn.setText("Pay Now");
        payNowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payNowBtnActionPerformed(evt, transac_id, usernameemail);
            }
        });

        orLbl.setText("Or");

        changePaymentMethodBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
        changePaymentMethodBtn.setText("CHANGE PAYMENT METHOD");
        changePaymentMethodBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePaymentMethodBtnActionPerformed(evt, transac_id, totalValue, usernameemail);
            }
        });

        javax.swing.GroupLayout mainJpanelLayout = new javax.swing.GroupLayout(mainJpanel);
        mainJpanel.setLayout(mainJpanelLayout);
        mainJpanelLayout.setHorizontalGroup(
                mainJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(topJpanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainJpanelLayout.createSequentialGroup()
                                .addGroup(mainJpanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainJpanelLayout.createSequentialGroup()
                                                .addGap(104, 104, 104)
                                                .addComponent(creditCardLbl))
                                        .addGroup(mainJpanelLayout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(cardNoLbl)
                                                .addGap(18, 18, 18)
                                                .addComponent(cardNoTextfield, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(mainJpanelLayout.createSequentialGroup()
                                                .addGap(146, 146, 146)
                                                .addComponent(payNowBtn))
                                        .addGroup(mainJpanelLayout.createSequentialGroup()
                                                .addGap(95, 95, 95)
                                                .addGroup(mainJpanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(mainJpanelLayout.createSequentialGroup()
                                                                .addComponent(orLbl)
                                                                .addGap(93, 93, 93))
                                                        .addComponent(changePaymentMethodBtn))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        mainJpanelLayout.setVerticalGroup(
                mainJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainJpanelLayout.createSequentialGroup()
                                .addComponent(topJpanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(creditCardLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(
                                        mainJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(cardNoLbl)
                                                .addComponent(cardNoTextfield, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(payNowBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(orLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(changePaymentMethodBtn)
                                .addGap(0, 25, Short.MAX_VALUE)));

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

    private void accountMenuBtnActionPerformed(ActionEvent evt, String usernameemail) {
        dispose();
        AccountPage accpage = new AccountPage(usernameemail);
        accpage.setVisible(true);
    }

    private void transactionMenuBtnActionPerformed(ActionEvent evt, String usernameemail) {
        dispose();
        TransactionPage transac = new TransactionPage(usernameemail);
        transac.setVisible(true);
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

    private void changePaymentMethodBtnActionPerformed(java.awt.event.ActionEvent evt, int transac_id,
            String totalValue, String usernameemail) {
        int response = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to change payment method?",
                "Change Payment Method Confirmation",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (response == JOptionPane.YES_OPTION) {
            dispose();
            PaymentMethod pay = new PaymentMethod(transac_id, totalValue, usernameemail);
            pay.setVisible(true);
        }
    }

    private void payNowBtnActionPerformed(java.awt.event.ActionEvent evt, int transac_id, String usernameemail) {
        if (cardNoTextfield.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Please type your card number first.");
        } else if (!cardNoTextfield.getText().isEmpty()) {
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

                    Pmpstmt.setString(1, "Credit Card");
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
            java.util.logging.Logger.getLogger(CreditCardPayment.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreditCardPayment.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreditCardPayment.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreditCardPayment.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CreditCardPayment frame = new CreditCardPayment();
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
    private javax.swing.JLabel cardNoLbl;
    private javax.swing.JTextField cardNoTextfield;
    private javax.swing.JButton changePaymentMethodBtn;
    private javax.swing.JLabel creditCardLbl;
    private javax.swing.JMenuItem homePageMenuBtn;
    private javax.swing.JMenuItem logoutMenuBtn;
    private javax.swing.JPanel mainJpanel;
    private javax.swing.JButton menuBtn;
    private javax.swing.JLabel orLbl;
    private javax.swing.JButton payNowBtn;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JPanel topJpanel;
    private javax.swing.JMenuItem transactionMenuBtn;
    // End of variables declaration
}
