import java.awt.*;
import java.util.logging.*;
import java.sql.*;
import javax.swing.*;
import java.time.*;
import java.time.format.*;
import java.awt.event.*;

public class TransactionAdditionalDetails extends javax.swing.JFrame {

    /**
     * Creates new form TransactionAdditionalDetails
     */
    public TransactionAdditionalDetails(String usernameemail, int carId) {
        setTitle("Transaction Additional Details");
        initComponents(usernameemail, carId);
    }

    public TransactionAdditionalDetails() {

    }

    private void initComponents(String usernameemail, int carId) {

        popupMenu = new javax.swing.JPopupMenu();
        homePageMenuBtn = new javax.swing.JMenuItem();
        accountMenuBtn = new javax.swing.JMenuItem();
        transactionMenuBtn = new javax.swing.JMenuItem();
        logoutMenuBtn = new javax.swing.JMenuItem();
        topJpanel = new javax.swing.JPanel();
        menuBtn = new javax.swing.JButton();
        carRentalLbl = new javax.swing.JLabel();
        pickUpReturnLocLbl = new javax.swing.JLabel();
        pickUpDateLbl = new javax.swing.JLabel();
        dateLbl = new javax.swing.JLabel();
        dateTextfield = new javax.swing.JTextField();
        pickUpRentLocCombobox = new javax.swing.JComboBox<>();
        pickUpReturnErrorLbl = new javax.swing.JLabel();
        daysOfRentingLbl = new javax.swing.JLabel();
        daysOfRentingTextfield = new javax.swing.JTextField();
        daysOfRentingErrorLbl = new javax.swing.JLabel();
        nextBtn = new javax.swing.JButton();
        dateErrorLbl = new javax.swing.JLabel();
        dateFormatLbl = new javax.swing.JLabel();
        chosenCarPhotoLbl = new javax.swing.JLabel();
        numberOfDaysRentingLbl = new javax.swing.JLabel();
        carNameLbl = new javax.swing.JLabel();

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental", "root",
                    "hansignacio");
            Statement stm = con.createStatement();
            String sql = "Select * FROM car_types WHERE car_id='" + carId + "'";
            ResultSet rs = stm.executeQuery(sql);
            if (rs.next()) {
                String carname = rs.getString("car_name");

                carNameAssign(carname);
            }
        } catch (SQLException ex) {
            Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        homePageMenuBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        homePageMenuBtn.setText("Home Page");
        homePageMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homePageMenuBtnActionPerformed(evt, usernameemail);
            }
        });
        popupMenu.add(homePageMenuBtn);

        accountMenuBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        accountMenuBtn.setText("Account");
        accountMenuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountMenuBtnActionPerformed(evt, usernameemail);
            }
        });
        popupMenu.add(accountMenuBtn);

        transactionMenuBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
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

        menuBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        menuBtn.setText("Menu");
        menuBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBtnActionPerformed(evt);
            }
        });

        carRentalLbl.setFont(new java.awt.Font("Segoe Script", 1, 18)); // NOI18N
        carRentalLbl.setForeground(new java.awt.Color(144, 224, 192));
        carRentalLbl.setText("CAR RENTAL");

        daysOfRentingTextfield.setFont(new java.awt.Font("Segoe UI", 1, 12));

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

        pickUpReturnLocLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pickUpReturnLocLbl.setText("Pick-up & Return Location:");

        pickUpDateLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pickUpDateLbl.setText("Pick-up Date:");

        dateLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dateLbl.setText("Date:");

        dateTextfield.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        pickUpRentLocCombobox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pickUpRentLocCombobox
                .setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Bagac", "Balanga", "Limay" }));
        pickUpRentLocCombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickUpRentLocComboboxActionPerformed(evt);
            }
        });

        pickUpReturnErrorLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pickUpReturnErrorLbl.setForeground(new java.awt.Color(255, 0, 0));
        pickUpReturnErrorLbl.setText("Please choose pick-up and return location");

        daysOfRentingLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        daysOfRentingLbl.setText("Days of Renting:");

        daysOfRentingErrorLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        daysOfRentingErrorLbl.setForeground(new java.awt.Color(255, 0, 0));

        nextBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nextBtn.setText("NEXT");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt, usernameemail, carId);
            }
        });

        dateErrorLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dateErrorLbl.setForeground(new java.awt.Color(255, 0, 0));

        dateFormatLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dateFormatLbl.setText(" (yyyy-mm-dd)");

        switch (carId) {
            case 1:
                chosenCarPhotoLbl.setIcon(new javax.swing.ImageIcon("img/Toyota Yaris.jpg"));
                break;
            case 2:
                chosenCarPhotoLbl.setIcon(new javax.swing.ImageIcon("img/Hyundai Accent.jpg"));
                break;
            case 3:
                chosenCarPhotoLbl.setIcon(new javax.swing.ImageIcon("img/Chevrolet Impala.jpg"));
                break;
            case 4:
                chosenCarPhotoLbl.setIcon(new javax.swing.ImageIcon("img/Ford Taurus.jpg"));
                break;
            case 5:
                chosenCarPhotoLbl.setIcon(new javax.swing.ImageIcon("img/Honda Odyssey.jpg"));
                break;
            case 6:
                chosenCarPhotoLbl.setIcon(new javax.swing.ImageIcon("img/Ford Transit.jpg"));
                break;
        }

        numberOfDaysRentingLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        numberOfDaysRentingLbl.setText("Number of Days Renting:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(topJpanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(102, 102, 102)
                                                .addComponent(chosenCarPhotoLbl, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(142, 142, 142)
                                                .addComponent(carNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 121,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(pickUpDateLbl)
                                                        .addComponent(pickUpReturnErrorLbl)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(pickUpReturnLocLbl)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(pickUpRentLocCombobox,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 81,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(1, 1, 1)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(daysOfRentingLbl)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(daysOfRentingTextfield,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        71,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(daysOfRentingErrorLbl,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        153,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(numberOfDaysRentingLbl)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(dateLbl)
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(layout.createParallelGroup(
                                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                                        false)
                                                                                        .addComponent(dateFormatLbl,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                        .addComponent(dateTextfield,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                91,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(dateErrorLbl,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        153,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(155, 155, 155)
                                                .addComponent(nextBtn)))
                                .addContainerGap(34, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(topJpanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(chosenCarPhotoLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(carNameLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(pickUpReturnLocLbl)
                                        .addComponent(pickUpRentLocCombobox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pickUpReturnErrorLbl)
                                .addGap(18, 18, 18)
                                .addComponent(pickUpDateLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dateLbl)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(dateTextfield,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(dateErrorLbl))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(dateFormatLbl)))
                                .addGap(18, 18, 18)
                                .addComponent(numberOfDaysRentingLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(daysOfRentingLbl)
                                        .addComponent(daysOfRentingTextfield, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(daysOfRentingErrorLbl))
                                .addGap(18, 18, 18)
                                .addComponent(nextBtn)
                                .addContainerGap(32, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>

    public static void carNameAssign(String carname) {
        carNameLbl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        carNameLbl.setHorizontalAlignment(SwingConstants.CENTER);
        carNameLbl.setText(carname);
    }

    private void menuBtnActionPerformed(java.awt.event.ActionEvent evt) {
        popupMenu.show(menuBtn, 0, menuBtn.getHeight());
    }

    private void homePageMenuBtnActionPerformed(java.awt.event.ActionEvent evt, String usernameemail) {
        dispose();
        HomePage hpage = new HomePage(usernameemail);
        hpage.setVisible(true);
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
                "Are you sure you want to log out?",
                "Logout Confirmation",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        // Process the user's response
        if (response == JOptionPane.YES_OPTION) {
            dispose();
            loginForm login = new loginForm();
            login.setVisible(true);
        }
    }

    private void pickUpRentLocComboboxActionPerformed(java.awt.event.ActionEvent evt) {
        String selectedItem = (String) pickUpRentLocCombobox.getSelectedItem();
        if ("".equals(selectedItem)) {
            pickUpReturnErrorLbl.setText("Please choose pick-up and return location");
        } else {
            pickUpReturnErrorLbl.setText("");
        }
    }

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt, String usernameemail, int carId) {
        String dateString = dateTextfield.getText();
        String inputDays = daysOfRentingTextfield.getText();
        String selectedValue = (String) pickUpRentLocCombobox.getSelectedItem();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        int Days = Integer.parseInt(inputDays);

        LocalDate inputDate = LocalDate.parse(dateString, formatter);
        LocalDate today = LocalDate.now();
        LocalDate returnDate = inputDate.plusDays(Days);

        if (isValidDate(dateString, formatter)) {
            dateErrorLbl.setText("");
            if (!inputDate.isEqual(today) && !inputDate.isAfter(today)) {
                dateErrorLbl.setText("Pick a future date");
            } else {
                dateErrorLbl.setText("");
            }
        } else {
            dateErrorLbl.setText("Invalid date format!");
        }

        if (isInteger(inputDays)) {
            daysOfRentingErrorLbl.setText("");
        } else {
            daysOfRentingErrorLbl.setText("Please enter no. of days.");
        }
        if (pickUpReturnErrorLbl.getText() == "" && dateErrorLbl.getText() == ""
                && daysOfRentingErrorLbl.getText() == "") {
            dispose();
            TransactionConfirmation transactConfirm = new TransactionConfirmation(usernameemail, carId, selectedValue,
                    dateString, returnDate, inputDays);
            transactConfirm.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Please fill all the necessary infos.");
        }
    }

    private static boolean isValidDate(String dateStr, DateTimeFormatter formatter) {
        try {
            LocalDate.parse(dateStr, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    private static boolean isInteger(String userInput) {
        try {
            Integer.parseInt(userInput);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TransactionAdditionalDetails.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransactionAdditionalDetails.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransactionAdditionalDetails.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransactionAdditionalDetails.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TransactionAdditionalDetails frame = new TransactionAdditionalDetails();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JMenuItem accountMenuBtn;
    private static javax.swing.JLabel carNameLbl;
    private javax.swing.JLabel carRentalLbl;
    private javax.swing.JLabel chosenCarPhotoLbl;
    private javax.swing.JLabel dateErrorLbl;
    private javax.swing.JLabel dateFormatLbl;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JTextField dateTextfield;
    private javax.swing.JLabel daysOfRentingErrorLbl;
    private javax.swing.JLabel daysOfRentingLbl;
    private javax.swing.JTextField daysOfRentingTextfield;
    private javax.swing.JMenuItem homePageMenuBtn;
    private javax.swing.JMenuItem logoutMenuBtn;
    private javax.swing.JButton menuBtn;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel numberOfDaysRentingLbl;
    private javax.swing.JLabel pickUpDateLbl;
    private javax.swing.JComboBox<String> pickUpRentLocCombobox;
    private javax.swing.JLabel pickUpReturnErrorLbl;
    private javax.swing.JLabel pickUpReturnLocLbl;
    private javax.swing.JPopupMenu popupMenu;
    private javax.swing.JPanel topJpanel;
    private javax.swing.JMenuItem transactionMenuBtn;
    // End of variables declaration
}
