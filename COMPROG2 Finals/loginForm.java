import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.logging.*;

public class loginForm extends javax.swing.JFrame {

    public loginForm() {
        setTitle("Login Page");
        initComponents();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logoLbl = new javax.swing.JLabel();
        loginLbl = new javax.swing.JLabel();
        usernameOrEmailLbl = new javax.swing.JLabel();
        usernameOrEmailTextfield = new javax.swing.JTextField();
        passLbl = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();
        showPassCheckBox = new javax.swing.JCheckBox();
        loginBtn = new javax.swing.JButton();
        signupLbl = new javax.swing.JLabel();
        askLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Color Jpanelcolor = new Color(56, 91, 156, 255);
        Color Jframecolor = new Color(228, 216, 233, 255);
        jPanel1.setBackground(Jpanelcolor);
        getContentPane().setBackground(Jframecolor);
        logoLbl.setIcon(new javax.swing.ImageIcon("img/guilogo.png"));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(logoLbl)
                                .addContainerGap(60, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(logoLbl)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        loginLbl.setFont(new java.awt.Font("Segoe UI", 1, 48));
        loginLbl.setText("Log-in");

        usernameOrEmailLbl.setFont(new java.awt.Font("Segoe UI", 1, 14));
        usernameOrEmailLbl.setText("Username/Email:");

        usernameOrEmailTextfield.setFont(new java.awt.Font("Segoe UI", 1, 12));

        passLbl.setFont(new java.awt.Font("Segoe UI", 1, 14));
        passLbl.setText("Password:");

        passField.setFont(new java.awt.Font("Segoe UI", 1, 12));

        showPassCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 12));
        showPassCheckBox.setText("Show Password");
        showPassCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassCheckBoxActionPerformed(evt);
            }
        });

        loginBtn.setFont(new java.awt.Font("Segoe UI", 1, 14));
        loginBtn.setText("Log-in");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        signupLbl.setFont(new java.awt.Font("Segoe UI", 0, 14));
        signupLbl.setText("Sign-up");
        signupLbl.setFont(new java.awt.Font("Segoe UI", 0, 14));
        signupLbl.setText("<html><font color='blue'><u>Sign-up</u></font color></html>");
        signupLbl.setCursor(new Cursor(Cursor.HAND_CURSOR));
        signupLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signupLblMouseClicked(evt);
            }
        });

        askLbl.setFont(new java.awt.Font("Segoe UI", 1, 14));
        askLbl.setText("Don't have an account yet? ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(loginLbl)
                                                .addGap(108, 108, 108))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(199, 199, 199)
                                                                .addComponent(loginBtn))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(53, 53, 53)
                                                                .addComponent(askLbl)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(signupLbl))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(26, 26, 26)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        false)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(
                                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(passLbl,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                74,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(
                                                                                                usernameOrEmailLbl))
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(usernameOrEmailTextfield,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        151,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(showPassCheckBox)
                                                                                .addComponent(passField,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        151,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addContainerGap(56, Short.MAX_VALUE)))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(loginLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(usernameOrEmailLbl)
                                        .addComponent(usernameOrEmailTextfield, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(passLbl)
                                        .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showPassCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(loginBtn)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(askLbl)
                                        .addComponent(signupLbl))
                                .addContainerGap(74, Short.MAX_VALUE)));

        pack();
    }

    private void signupLblMouseClicked(java.awt.event.MouseEvent evt) {
        dispose();
        signupForm signup = new signupForm();
        signup.setVisible(true);
    }

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {
        String usernameemail = usernameOrEmailTextfield.getText();
        String password = new String(passField.getPassword());
        if (usernameemail.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in the username and password field.");
        } else {
            try {
                String uname;
                String em;
                String pass;
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental", "root",
                        "hansignacio");

                Statement stm = con.createStatement();

                String sql = "select * from customers where (username='" + usernameemail + "' OR email='"
                        + usernameemail
                        + "') AND pass='" + password + "'";
                ResultSet rs = stm.executeQuery(sql);
                if (rs.next()) {
                    uname = rs.getString("username");
                    em = rs.getString("email");
                    pass = rs.getString("pass");
                    if (uname.equals(usernameemail) || em.equals(usernameemail) && pass.equals(password)) {
                        JOptionPane.showMessageDialog(this, "Login Successful.");
                        dispose();
                        HomePage hpage = new HomePage(usernameemail);
                        hpage.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(this, "Incorrect Username/Email and/or Password");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Incorrect Username/Email and/or Password.");
                }
                con.close();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void showPassCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == showPassCheckBox) {
            passField.setEchoChar(showPassCheckBox.isSelected() ? '\u0000' : '•');
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    loginForm frame = new loginForm();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    // Variables declaration
    private javax.swing.JLabel askLbl;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginLbl;
    private javax.swing.JLabel logoLbl;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passLbl;
    private javax.swing.JCheckBox showPassCheckBox;
    private javax.swing.JLabel signupLbl;
    private javax.swing.JLabel usernameOrEmailLbl;
    private javax.swing.JTextField usernameOrEmailTextfield;
    // End of variables declaration
}
