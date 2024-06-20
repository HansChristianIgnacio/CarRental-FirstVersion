import java.awt.*;
import java.sql.*;

import javax.swing.JOptionPane;

public class ChangePasswordOrUsernamePage extends javax.swing.JFrame {

    public ChangePasswordOrUsernamePage(String usernameemail, String unameOrPassChange) {
        if (unameOrPassChange == "username") {
            setTitle("Change Username");
        } else {
            setTitle("Change Password");
        }
        initComponents(usernameemail, unameOrPassChange);
    }

    public ChangePasswordOrUsernamePage() {

    }

    private void initComponents(String usernameemail, String unameOrPassChange) {

        popupMenu = new javax.swing.JPopupMenu();
        homePageMenuBtn = new javax.swing.JMenuItem();
        accountMenuBtn = new javax.swing.JMenuItem();
        transactionMenuBtn = new javax.swing.JMenuItem();
        logoutMenuBtn = new javax.swing.JMenuItem();
        mainJpanel = new javax.swing.JPanel();
        topJpanel = new javax.swing.JPanel();
        menuBtn = new javax.swing.JButton();
        carRentalLbl = new javax.swing.JLabel();
        changePassOrUsernameLbl = new javax.swing.JLabel();
        oldPassOrUsernameLbl = new javax.swing.JLabel();
        oldPassOrUsernameTextfield = new javax.swing.JTextField();
        newPassOrUsernamelbl = new javax.swing.JLabel();
        newPassOrUsernameTextfield = new javax.swing.JTextField();
        changeBtn = new javax.swing.JButton();

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

        mainJpanel.setBackground(new java.awt.Color(255, 204, 204));

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

        changePassOrUsernameLbl.setFont(new java.awt.Font("Segoe UI", 1, 36));
        if (unameOrPassChange == "username") {
            changePassOrUsernameLbl.setText("CHANGE USERNAME");
        } else {
            changePassOrUsernameLbl.setText("CHANGE PASSWORD");
        }

        oldPassOrUsernameLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
        if (unameOrPassChange == "username") {
            oldPassOrUsernameLbl.setText("OLD Username:");
        } else {
            oldPassOrUsernameLbl.setText("OLD Password:");
        }

        oldPassOrUsernameTextfield.setFont(new java.awt.Font("Segoe UI", 1, 12));

        newPassOrUsernamelbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
        if (unameOrPassChange == "username") {
            newPassOrUsernamelbl.setText("NEW Username:");
        } else {
            newPassOrUsernamelbl.setText("NEW Password:");
        }

        newPassOrUsernameTextfield.setFont(new java.awt.Font("Segoe UI", 1, 12));

        changeBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
        changeBtn.setText("Change");
        changeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeBtnActionPerformed(evt, usernameemail, unameOrPassChange);
            }
        });

        javax.swing.GroupLayout mainJpanelLayout = new javax.swing.GroupLayout(mainJpanel);
        mainJpanel.setLayout(mainJpanelLayout);
        mainJpanelLayout.setHorizontalGroup(
                mainJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(topJpanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainJpanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(mainJpanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(mainJpanelLayout.createSequentialGroup()
                                                .addComponent(changePassOrUsernameLbl)
                                                .addContainerGap(23, Short.MAX_VALUE))
                                        .addGroup(mainJpanelLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(mainJpanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(oldPassOrUsernameLbl)
                                                        .addComponent(newPassOrUsernamelbl))
                                                .addGap(18, 18, 18)
                                                .addGroup(mainJpanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(mainJpanelLayout.createSequentialGroup()
                                                                .addComponent(newPassOrUsernameTextfield,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 191,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE))
                                                        .addGroup(mainJpanelLayout.createSequentialGroup()
                                                                .addComponent(oldPassOrUsernameTextfield,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 191,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE))))))
                        .addGroup(mainJpanelLayout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addComponent(changeBtn)
                                .addGap(0, 0, Short.MAX_VALUE)));
        mainJpanelLayout.setVerticalGroup(
                mainJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainJpanelLayout.createSequentialGroup()
                                .addComponent(topJpanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(changePassOrUsernameLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(
                                        mainJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(oldPassOrUsernameLbl)
                                                .addComponent(oldPassOrUsernameTextfield,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(mainJpanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(newPassOrUsernamelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 22,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(newPassOrUsernameTextfield,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(changeBtn)
                                .addGap(0, 32, Short.MAX_VALUE)));

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

    private void changeBtnActionPerformed(java.awt.event.ActionEvent evt, String usernameemail,
            String unameOrPassChange) {
        String oldUnameOrPass = oldPassOrUsernameTextfield.getText();
        String newUnameOrPass = newPassOrUsernameTextfield.getText();

        if (unameOrPassChange == "username") {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental",
                        "root",
                        "hansignacio");

                Statement stm = con.createStatement();
                String sql = "Select * FROM customers WHERE username='" + usernameemail + "' OR email='" + usernameemail
                        + "'";
                ResultSet rs = stm.executeQuery(sql);
                if (rs.next()) {
                    String curUsername = rs.getString("username");
                    System.out.println(curUsername + oldUnameOrPass);
                    if (curUsername.equals(oldUnameOrPass)) {
                        String changeUnameSql = "Update customers SET username='" + newUnameOrPass
                                + "' WHERE username='"
                                + oldUnameOrPass + "'";
                        PreparedStatement pst = con.prepareStatement(changeUnameSql);
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(this,
                                "You have successfully changed your username.");
                        dispose();
                        HomePage hpage = new HomePage(newUnameOrPass);
                        hpage.setVisible(true);

                    } else if (oldUnameOrPass.isEmpty() && newUnameOrPass.isEmpty()) {
                        JOptionPane.showMessageDialog(this,
                                "Please fill in both old username and new username.");
                    } else if (curUsername != oldUnameOrPass) {
                        JOptionPane.showMessageDialog(this,
                                "Wrong old username!");
                    }
                } else {
                    JOptionPane.showMessageDialog(this,
                            "Error.");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else if (unameOrPassChange == "password") {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental",
                        "root",
                        "hansignacio");

                Statement stm = con.createStatement();
                String sql = "Select * FROM customers WHERE username='" + usernameemail + "' OR email='" + usernameemail
                        + "'";
                ResultSet rs = stm.executeQuery(sql);
                if (rs.next()) {
                    String curPass = rs.getString("pass");
                    if (curPass.equals(oldUnameOrPass)) {
                        String changeUnameSql = "Update customers SET pass='" + newUnameOrPass
                                + "' WHERE pass='"
                                + oldUnameOrPass + "'";
                        PreparedStatement pst = con.prepareStatement(changeUnameSql);
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(this,
                                "You have successfully changed your password.");
                        dispose();
                        HomePage hpage = new HomePage(newUnameOrPass);
                        hpage.setVisible(true);
                    } else if (oldUnameOrPass.isEmpty() && newUnameOrPass.isEmpty()) {
                        JOptionPane.showMessageDialog(this,
                                "Please fill in both old password and new password.");
                    } else {
                        JOptionPane.showMessageDialog(this,
                                "Wrong old password!");
                    }

                } else {
                    JOptionPane.showMessageDialog(this,
                            "Error.");
                }
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
            java.util.logging.Logger.getLogger(ChangePasswordOrUsernamePage.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordOrUsernamePage.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordOrUsernamePage.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePasswordOrUsernamePage.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ChangePasswordOrUsernamePage frame = new ChangePasswordOrUsernamePage();
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
    private javax.swing.JButton changeBtn;
    private javax.swing.JLabel changePassOrUsernameLbl;
    private javax.swing.JMenuItem homePageMenuBtn;
    private javax.swing.JMenuItem logoutMenuBtn;
    private javax.swing.JPanel mainJpanel;
    private javax.swing.JButton menuBtn;
    private javax.swing.JTextField newPassOrUsernameTextfield;
    private javax.swing.JLabel newPassOrUsernamelbl;
    private javax.swing.JLabel oldPassOrUsernameLbl;
    private javax.swing.JTextField oldPassOrUsernameTextfield;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JPanel topJpanel;
    private javax.swing.JMenuItem transactionMenuBtn;
    // End of variables declaration
}
