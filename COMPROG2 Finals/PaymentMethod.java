import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class PaymentMethod extends javax.swing.JFrame {

    public PaymentMethod(int transac_id, String totalValue, String usernameemail) {
        setTitle("Payment Method");
        initComponents(transac_id, totalValue, usernameemail);
    }

    public PaymentMethod() {
    }

    private void initComponents(int transac_id, String totalValue, String usernameemail) {

        popupMenu = new javax.swing.JPopupMenu();
        homePageMenuBtn = new javax.swing.JMenuItem();
        accountMenuBtn = new javax.swing.JMenuItem();
        transactionMenuBtn = new javax.swing.JMenuItem();
        logoutMenuBtn = new javax.swing.JMenuItem();
        topJpanel = new javax.swing.JPanel();
        menuBtn = new javax.swing.JButton();
        carRentalLbl = new javax.swing.JLabel();
        totalAmountLbl = new javax.swing.JLabel();
        totalAmountValueLbl = new javax.swing.JLabel();
        chooseYourPaymentMethodLbl = new javax.swing.JLabel();
        cashJpanel = new javax.swing.JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (isMouseInside) {
                    Graphics2D g2d = (Graphics2D) g.create();
                    g2d.setColor(new Color(204, 255, 204));
                    g2d.fillRect(0, 0, getWidth(), getHeight());
                    g2d.dispose();
                }
            }
        };
        cashLogoLbl = new javax.swing.JLabel();
        cashLbl = new javax.swing.JLabel();
        gcashJpanel = new javax.swing.JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (isMouseInside) {
                    Graphics2D g2d = (Graphics2D) g.create();
                    g2d.setColor(new Color(204, 255, 204));
                    g2d.fillRect(0, 0, getWidth(), getHeight());
                    g2d.dispose();
                }
            }
        };
        gcashLogoLbl = new javax.swing.JLabel();
        gcashLbl = new javax.swing.JLabel();
        creditCardJpanel = new javax.swing.JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (isMouseInside) {
                    Graphics2D g2d = (Graphics2D) g.create();
                    g2d.setColor(new Color(204, 255, 204));
                    g2d.fillRect(0, 0, getWidth(), getHeight());
                    g2d.dispose();
                }
            }
        };
        creditCardLogoLbl = new javax.swing.JLabel();
        creditCardLbl = new javax.swing.JLabel();

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
        setBackground(new java.awt.Color(204, 204, 255));

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

        totalAmountLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
        totalAmountLbl.setText("Total Amount:");

        totalAmountValueLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
        totalAmountValueLbl.setText(String.valueOf(totalValue));

        chooseYourPaymentMethodLbl.setFont(new java.awt.Font("Segoe UI", 1, 24));
        chooseYourPaymentMethodLbl.setText("Choose your payment method:");

        cashJpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cashJpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cashJpanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cashJpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cashJpanelMouseClicked(evt, totalValue, transac_id, usernameemail);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cashJpanelMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                cashJpanelMouseExited(evt);
            }
        });

        cashLogoLbl.setIcon(new javax.swing.ImageIcon("img/cash.png"));

        cashLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
        cashLbl.setText("Cash");

        javax.swing.GroupLayout cashJpanelLayout = new javax.swing.GroupLayout(cashJpanel);
        cashJpanel.setLayout(cashJpanelLayout);
        cashJpanelLayout.setHorizontalGroup(
                cashJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(cashJpanelLayout.createSequentialGroup()
                                .addGroup(cashJpanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(cashJpanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(cashLogoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 122,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(cashJpanelLayout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addComponent(cashLbl)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        cashJpanelLayout.setVerticalGroup(
                cashJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(cashJpanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(cashLogoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cashLbl)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        gcashJpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gcashJpanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        gcashJpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gcashJpanelMouseClicked(evt, totalValue, transac_id, usernameemail);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                gcashJpanelMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                gcashJpanelMouseExited(evt);
            }
        });

        gcashLogoLbl.setIcon(new javax.swing.ImageIcon("img/gcash.jpg"));

        gcashLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
        gcashLbl.setText("GCash");

        javax.swing.GroupLayout gcashJpanelLayout = new javax.swing.GroupLayout(gcashJpanel);
        gcashJpanel.setLayout(gcashJpanelLayout);
        gcashJpanelLayout.setHorizontalGroup(
                gcashJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(gcashJpanelLayout.createSequentialGroup()
                                .addGroup(gcashJpanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(gcashJpanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(gcashLogoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 122,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(gcashJpanelLayout.createSequentialGroup()
                                                .addGap(47, 47, 47)
                                                .addComponent(gcashLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        gcashJpanelLayout.setVerticalGroup(
                gcashJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(gcashJpanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(gcashLogoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gcashLbl)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        creditCardJpanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        creditCardJpanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        creditCardJpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creditCardJpanelMouseClicked(evt, totalValue, transac_id, usernameemail);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                creditCardJpanelMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                creditCardJpanelMouseExited(evt);
            }
        });

        creditCardLogoLbl
                .setIcon(new javax.swing.ImageIcon("img/credit card.png"));

        creditCardLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
        creditCardLbl.setText("Credit Card");

        javax.swing.GroupLayout creditCardJpanelLayout = new javax.swing.GroupLayout(creditCardJpanel);
        creditCardJpanel.setLayout(creditCardJpanelLayout);
        creditCardJpanelLayout.setHorizontalGroup(
                creditCardJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(creditCardJpanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(creditCardLogoLbl)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                creditCardJpanelLayout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(creditCardLbl)
                                        .addGap(36, 36, 36)));
        creditCardJpanelLayout.setVerticalGroup(
                creditCardJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(creditCardJpanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(creditCardLogoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 125,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(creditCardLbl)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(topJpanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(cashJpanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(gcashJpanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(31, Short.MAX_VALUE)
                                                .addComponent(chooseYourPaymentMethodLbl)))
                                .addContainerGap(32, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(totalAmountLbl)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(totalAmountValueLbl,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 95,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(136, 136, 136)
                                                .addComponent(creditCardJpanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(topJpanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(totalAmountLbl)
                                        .addComponent(totalAmountValueLbl))
                                .addGap(18, 18, 18)
                                .addComponent(chooseYourPaymentMethodLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(gcashJpanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cashJpanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(creditCardJpanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(23, Short.MAX_VALUE)));

        pack();
    }

    private void menuBtnActionPerformed(java.awt.event.ActionEvent evt) {
        popupMenu.show(menuBtn, 0, menuBtn.getHeight());
    }

    private void cashJpanelMouseClicked(java.awt.event.MouseEvent evt, String totalValue, int transac_id,
            String usernameemail) {
        dispose();
        CashPayment cash = new CashPayment(totalValue, transac_id, usernameemail);
        cash.setVisible(true);
    }

    private void cashJpanelMouseEntered(java.awt.event.MouseEvent evt) {
        isMouseInside = true;
        cashJpanel.repaint();
    }

    private void cashJpanelMouseExited(java.awt.event.MouseEvent evt) {
        isMouseInside = false;
        cashJpanel.repaint();
    }

    private void gcashJpanelMouseClicked(java.awt.event.MouseEvent evt, String totalValue, int transac_id,
            String usernameemail) {
        dispose();
        GcashPayment gcash = new GcashPayment(totalValue, transac_id, usernameemail);
        gcash.setVisible(true);
    }

    private void gcashJpanelMouseEntered(java.awt.event.MouseEvent evt) {
        isMouseInside = true;
        gcashJpanel.repaint();
    }

    private void gcashJpanelMouseExited(java.awt.event.MouseEvent evt) {
        isMouseInside = false;
        gcashJpanel.repaint();
    }

    private void creditCardJpanelMouseClicked(java.awt.event.MouseEvent evt, String totalValue, int transac_id,
            String usernameemail) {
        dispose();
        CreditCardPayment card = new CreditCardPayment(totalValue, transac_id, usernameemail);
        card.setVisible(true);
    }

    private void creditCardJpanelMouseEntered(java.awt.event.MouseEvent evt) {
        isMouseInside = true;
        creditCardJpanel.repaint();
    }

    private void creditCardJpanelMouseExited(java.awt.event.MouseEvent evt) {
        isMouseInside = false;
        creditCardJpanel.repaint();
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

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PaymentMethod.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentMethod.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentMethod.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentMethod.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    PaymentMethod frame = new PaymentMethod();
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
    private javax.swing.JPanel cashJpanel;
    private javax.swing.JLabel cashLbl;
    private javax.swing.JLabel cashLogoLbl;
    private javax.swing.JLabel chooseYourPaymentMethodLbl;
    private javax.swing.JPanel creditCardJpanel;
    private javax.swing.JLabel creditCardLbl;
    private javax.swing.JLabel creditCardLogoLbl;
    private javax.swing.JPanel gcashJpanel;
    private javax.swing.JLabel gcashLbl;
    private javax.swing.JLabel gcashLogoLbl;
    private javax.swing.JMenuItem homePageMenuBtn;
    private javax.swing.JMenuItem logoutMenuBtn;
    private javax.swing.JButton menuBtn;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JPanel topJpanel;
    private javax.swing.JLabel totalAmountLbl;
    private javax.swing.JLabel totalAmountValueLbl;
    private javax.swing.JMenuItem transactionMenuBtn;
    private boolean isMouseInside = false;
    // End of variables declaration
}
