import java.awt.*;
import java.sql.*;
import java.util.logging.*;

import javax.swing.JOptionPane;

public class signupForm extends javax.swing.JFrame {

    public signupForm() {
        setTitle("Sign-up Form");
        initComponents();
    }

    private void initComponents() {

        signupLbl = new javax.swing.JLabel();
        fnameLbl = new javax.swing.JLabel();
        miLbl = new javax.swing.JLabel();
        lnameLbl = new javax.swing.JLabel();
        ageLbl = new javax.swing.JLabel();
        emailLbl = new javax.swing.JLabel();
        contactnumLbl = new javax.swing.JLabel();
        usernameLbl = new javax.swing.JLabel();
        passLbl = new javax.swing.JLabel();
        fnameTextfield = new javax.swing.JTextField();
        miTextfield = new javax.swing.JTextField();
        lastnameTextfield = new javax.swing.JTextField();
        ageTextfield = new javax.swing.JTextField();
        emailTextfield = new javax.swing.JTextField();
        contactnumTextfield = new javax.swing.JTextField();
        usernameTextfield = new javax.swing.JTextField();
        passField = new javax.swing.JPasswordField();
        showPassCheckBox = new javax.swing.JCheckBox();
        signupBtn = new javax.swing.JButton();
        askLbl = new javax.swing.JLabel();
        loginLbl = new javax.swing.JLabel();

        Color Jframecolor = new Color(228, 216, 233, 255);
        getContentPane().setBackground(Jframecolor);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        signupLbl.setFont(new java.awt.Font("Segoe UI", 1, 48));
        signupLbl.setText("Sign Up");

        fnameLbl.setFont(new java.awt.Font("Segoe UI", 1, 14));
        fnameLbl.setText("First Name:");

        miLbl.setFont(new java.awt.Font("Segoe UI", 1, 14));
        miLbl.setText("Middle Initial:");

        lnameLbl.setFont(new java.awt.Font("Segoe UI", 1, 14));
        lnameLbl.setText("Last Name:");

        ageLbl.setFont(new java.awt.Font("Segoe UI", 1, 14));
        ageLbl.setText("Age:");

        emailLbl.setFont(new java.awt.Font("Segoe UI", 1, 14));
        emailLbl.setText("Email address:");

        contactnumLbl.setFont(new java.awt.Font("Segoe UI", 1, 14));
        contactnumLbl.setText("Contact No:");

        usernameLbl.setFont(new java.awt.Font("Segoe UI", 1, 14));
        usernameLbl.setText("Username:");

        passLbl.setFont(new java.awt.Font("Segoe UI", 1, 14));
        passLbl.setText("Password:");

        fnameTextfield.setFont(new java.awt.Font("Segoe UI", 1, 12));

        miTextfield.setFont(new java.awt.Font("Segoe UI", 1, 12));

        lastnameTextfield.setFont(new java.awt.Font("Segoe UI", 1, 12));

        ageTextfield.setFont(new java.awt.Font("Segoe UI", 1, 12));

        emailTextfield.setFont(new java.awt.Font("Segoe UI", 1, 12));

        contactnumTextfield.setFont(new java.awt.Font("Segoe UI", 1, 12));

        usernameTextfield.setFont(new java.awt.Font("Segoe UI", 1, 12));

        passField.setFont(new java.awt.Font("Segoe UI", 1, 12));

        showPassCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 12));
        showPassCheckBox.setText("Show Password");
        showPassCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPassCheckBoxActionPerformed(evt);
            }
        });

        signupBtn.setFont(new java.awt.Font("Segoe UI", 1, 14));
        signupBtn.setText("Sign Up");
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });

        askLbl.setFont(new java.awt.Font("Segoe UI", 1, 14));
        askLbl.setText("Already have an account? ");

        loginLbl.setFont(new java.awt.Font("Segoe UI", 0, 14));
        loginLbl.setText("<html><font color='blue'><u>Log-in</u></font color></html>");
        loginLbl.setCursor(new Cursor(Cursor.HAND_CURSOR));
        loginLbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginLblMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(114, 114, 114)
                                                .addComponent(signupLbl))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(fnameLbl)
                                                                        .addComponent(miLbl)
                                                                        .addComponent(lnameLbl)
                                                                        .addComponent(ageLbl)
                                                                        .addComponent(emailLbl)
                                                                        .addComponent(contactnumLbl)
                                                                        .addComponent(usernameLbl)
                                                                        .addComponent(passLbl))
                                                                .addGap(28, 28, 28)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(signupBtn)
                                                                        .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addComponent(usernameTextfield)
                                                                                .addComponent(contactnumTextfield)
                                                                                .addComponent(emailTextfield)
                                                                                .addComponent(ageTextfield)
                                                                                .addComponent(lastnameTextfield)
                                                                                .addComponent(miTextfield)
                                                                                .addComponent(fnameTextfield)
                                                                                .addComponent(passField,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        152,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(showPassCheckBox))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(42, 42, 42)
                                                                .addComponent(askLbl)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(loginLbl)))))
                                .addContainerGap(77, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(signupLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(fnameLbl)
                                        .addComponent(fnameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(miLbl)
                                        .addComponent(miTextfield, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(lnameLbl)
                                        .addComponent(lastnameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ageLbl)
                                        .addComponent(ageTextfield, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(emailLbl)
                                        .addComponent(emailTextfield, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(contactnumLbl)
                                        .addComponent(contactnumTextfield, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(usernameLbl)
                                        .addComponent(usernameTextfield, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(passLbl)
                                        .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showPassCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(signupBtn)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(askLbl)
                                        .addComponent(loginLbl))
                                .addContainerGap(61, Short.MAX_VALUE)));

        pack();
    }

    private void showPassCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {
        if (evt.getSource() == showPassCheckBox) {
            passField.setEchoChar(showPassCheckBox.isSelected() ? '\u0000' : '•');
        }
    }

    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {
        String fname = fnameTextfield.getText();
        String mi = miTextfield.getText();
        String lastname = lastnameTextfield.getText();
        String age = ageTextfield.getText();
        String email = emailTextfield.getText();
        String contact_no = contactnumTextfield.getText();
        String username = usernameTextfield.getText();
        String password = new String(passField.getPassword());

        if (fname.isEmpty() || mi.isEmpty() || lastname.isEmpty() || age.isEmpty() || email.isEmpty()
                || contact_no.isEmpty() || username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all the text fields.");
        } else {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental", "root",
                        "hansignacio");

                String uniqueEmail = "Select * from customers where email=?";
                String uniqueContactNo = "Select * from customers where contact_no=?";
                String uniqueUsername = "Select * from customers where username=?";

                PreparedStatement pstmtEmail = con.prepareStatement(uniqueEmail);
                PreparedStatement pstmtContactNo = con.prepareStatement(uniqueContactNo);
                PreparedStatement pstmtUsername = con.prepareStatement(uniqueUsername);

                pstmtEmail.setString(1, email);
                pstmtContactNo.setString(1, contact_no);
                pstmtUsername.setString(1, username);
                ResultSet rsemail = pstmtEmail.executeQuery();
                ResultSet rscontactno = pstmtContactNo.executeQuery();
                ResultSet rsusername = pstmtUsername.executeQuery();

                StringBuilder errorMessage = new StringBuilder();
                if (rsemail.next()) {
                    errorMessage.append("Email already exists, please login or use another email address.\n");
                }
                if (rscontactno.next()) {
                    errorMessage.append("Contact Number already exists.\n");
                }
                if (rsusername.next()) {
                    errorMessage.append("Username already exists, please use another username.\n");
                }

                if (errorMessage.length() > 0) {
                    JOptionPane.showMessageDialog(this, errorMessage.toString());
                }
                if (!(rsemail.next() && rscontactno.next() && rsusername.next())) {
                    String sql = "INSERT INTO customers(lname, fname, minitial, age, email, contact_no, username, pass, signup_date) VALUES(?, ?, ?, ?, ?, ?, ?, ?, NOW())";
                    PreparedStatement pstmt = con.prepareStatement(sql);

                    pstmt.setString(1, lastname);
                    pstmt.setString(2, fname);
                    pstmt.setString(3, mi);
                    pstmt.setString(4, age);
                    pstmt.setString(5, email);
                    pstmt.setString(6, contact_no);
                    pstmt.setString(7, username);
                    pstmt.setString(8, password);

                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Sign-up Successfully, You can now Log-in.");
                    fnameTextfield.setText("");
                    miTextfield.setText("");
                    lastnameTextfield.setText("");
                    ageTextfield.setText("");
                    emailTextfield.setText("");
                    contactnumTextfield.setText("");
                    usernameTextfield.setText("");
                    passField.setText("");
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

    private void loginLblMouseClicked(java.awt.event.MouseEvent evt) {
        dispose();
        loginForm login = new loginForm();
        login.setVisible(true);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    signupForm frame = new signupForm();
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
            java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
    }

    // Variables declaration
    private javax.swing.JLabel ageLbl;
    private javax.swing.JTextField ageTextfield;
    private javax.swing.JLabel askLbl;
    private javax.swing.JLabel contactnumLbl;
    private javax.swing.JTextField contactnumTextfield;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTextfield;
    private javax.swing.JLabel fnameLbl;
    private javax.swing.JTextField fnameTextfield;
    private javax.swing.JTextField lastnameTextfield;
    private javax.swing.JLabel lnameLbl;
    private javax.swing.JLabel loginLbl;
    private javax.swing.JLabel miLbl;
    private javax.swing.JTextField miTextfield;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passLbl;
    private javax.swing.JCheckBox showPassCheckBox;
    private javax.swing.JButton signupBtn;
    private javax.swing.JLabel signupLbl;
    private javax.swing.JLabel usernameLbl;
    private javax.swing.JTextField usernameTextfield;
    // End of variables declaration
}
