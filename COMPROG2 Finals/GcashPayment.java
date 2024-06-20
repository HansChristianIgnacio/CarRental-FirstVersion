import java.awt.*;
import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;

public class GcashPayment extends javax.swing.JFrame {

    public GcashPayment(String totalValue, int transac_id, String usernameemail) {
        setTitle("Gcash Payment Method");
        initComponents(totalValue, transac_id, usernameemail);
    }

    public GcashPayment() {
    }

    private void initComponents(String totalValue, int transac_id, String usernameemail) {

        popupMenu = new javax.swing.JPopupMenu();
        homePageMenuBtn = new javax.swing.JMenuItem();
        accountMenuBtn = new javax.swing.JMenuItem();
        transactionMenuBtn = new javax.swing.JMenuItem();
        logoutMenuBtn = new javax.swing.JMenuItem();
        mainJpanel = new javax.swing.JPanel();
        topJpanel = new javax.swing.JPanel();
        menuBtn = new javax.swing.JButton();
        carRentalLbl = new javax.swing.JLabel();
        gcashLbl = new javax.swing.JLabel();
        totalAmountLbl = new javax.swing.JLabel();
        totalAmountValueLbl = new javax.swing.JLabel();
        connectGcashLbl = new javax.swing.JLabel();
        gcashBtn = new javax.swing.JButton();
        tapToPayLbl = new javax.swing.JLabel();
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

        gcashLbl.setFont(new java.awt.Font("Segoe UI", 1, 36));
        gcashLbl.setText("GCASH");

        totalAmountLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
        totalAmountLbl.setText("Total Amount:");

        totalAmountValueLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
        totalAmountValueLbl.setText(totalValue);

        connectGcashLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
        connectGcashLbl.setText("Tap to connect your GCASH Account:");

        gcashBtn.setBackground(new java.awt.Color(51, 51, 255));
        gcashBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
        gcashBtn.setText("GCASH");
        gcashBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gcashBtnActionPerformed(evt);
            }
        });

        tapToPayLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
        tapToPayLbl.setText("Tap to pay:");

        payNowBtn.setBackground(new java.awt.Color(0, 204, 102));
        payNowBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
        payNowBtn.setText("PAY NOW");
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
        mainJpanel.setBackground(new java.awt.Color(204, 255, 204));
        mainJpanelLayout.setHorizontalGroup(
                mainJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(topJpanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainJpanelLayout.createSequentialGroup()
                                .addGroup(mainJpanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainJpanelLayout.createSequentialGroup()
                                                .addGap(136, 136, 136)
                                                .addComponent(gcashLbl))
                                        .addGroup(mainJpanelLayout.createSequentialGroup()
                                                .addGap(71, 71, 71)
                                                .addComponent(totalAmountLbl)
                                                .addGap(18, 18, 18)
                                                .addComponent(totalAmountValueLbl,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 154,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(mainJpanelLayout.createSequentialGroup()
                                                .addGap(173, 173, 173)
                                                .addGroup(mainJpanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(gcashBtn)
                                                        .addGroup(mainJpanelLayout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(tapToPayLbl)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainJpanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(mainJpanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                mainJpanelLayout.createSequentialGroup()
                                                        .addComponent(payNowBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(144, 144, 144))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainJpanelLayout
                                                .createSequentialGroup()
                                                .addGroup(mainJpanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(mainJpanelLayout.createSequentialGroup()
                                                                .addComponent(orLbl)
                                                                .addGap(93, 93, 93))
                                                        .addComponent(changePaymentMethodBtn)
                                                        .addComponent(connectGcashLbl))
                                                .addGap(94, 94, 94)))));
        mainJpanelLayout.setVerticalGroup(
                mainJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainJpanelLayout.createSequentialGroup()
                                .addComponent(topJpanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(gcashLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(
                                        mainJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(totalAmountLbl)
                                                .addComponent(totalAmountValueLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(connectGcashLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(gcashBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tapToPayLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(payNowBtn)
                                .addGap(18, 18, 18)
                                .addComponent(orLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(changePaymentMethodBtn)
                                .addGap(0, 30, Short.MAX_VALUE)));

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

    private void payNowBtnActionPerformed(java.awt.event.ActionEvent evt, int transac_id, String usernameemail) {
        if (gcashConnected == true) {
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

                    Pmpstmt.setString(1, "Gcash");
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
        } else if (gcashConnected == false) {
            JOptionPane.showMessageDialog(this,
                    "Please connect your Gcash Account first!");
        }
    }

    private void gcashBtnActionPerformed(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(this,
                "GCASH Account Connected!");
        gcashConnected = true;
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

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GcashPayment.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GcashPayment.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GcashPayment.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GcashPayment.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GcashPayment frame = new GcashPayment();
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
    private javax.swing.JButton changePaymentMethodBtn;
    private javax.swing.JLabel connectGcashLbl;
    private javax.swing.JButton gcashBtn;
    private javax.swing.JMenuItem homePageMenuBtn;
    private javax.swing.JLabel gcashLbl;
    private javax.swing.JMenuItem logoutMenuBtn;
    private javax.swing.JPanel mainJpanel;
    private javax.swing.JButton menuBtn;
    private javax.swing.JLabel orLbl;
    private javax.swing.JButton payNowBtn;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JLabel tapToPayLbl;
    private javax.swing.JPanel topJpanel;
    private javax.swing.JLabel totalAmountLbl;
    private javax.swing.JLabel totalAmountValueLbl;
    private javax.swing.JMenuItem transactionMenuBtn;
    private boolean gcashConnected = false;
    // End of variables declaration
}
