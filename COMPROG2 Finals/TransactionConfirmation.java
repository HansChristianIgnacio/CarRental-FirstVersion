import java.sql.*;
import java.util.logging.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.time.*;
import java.awt.event.*;

public class TransactionConfirmation extends javax.swing.JFrame {

        public TransactionConfirmation(String usernameemail, int carId, String selectedValue, String dateString,
                        LocalDate returnDate, String inputDays) {
                setTitle("Transaction Confirmation");
                initComponents(usernameemail, carId, selectedValue, dateString, returnDate, inputDays);
        }

        public TransactionConfirmation() {
        }

        private void initComponents(String usernameemail, int carId, String selectedValue, String dateString,
                        LocalDate returnDate, String inputDays) {

                popupMenu = new javax.swing.JPopupMenu();
                homePageMenuBtn = new javax.swing.JMenuItem();
                accountMenuBtn = new javax.swing.JMenuItem();
                transactionMenuBtn = new javax.swing.JMenuItem();
                logoutMenuBtn = new javax.swing.JMenuItem();
                topJpanel = new javax.swing.JPanel();
                menuBtn = new javax.swing.JButton();
                carRentalLbl = new javax.swing.JLabel();
                rentDriverLbl = new javax.swing.JLabel();
                rentDriverCheckBox = new javax.swing.JCheckBox();
                DriverIdOrRentDriverDaysLbl = new javax.swing.JLabel();
                DriverIdOrRentDriverDaysTextfield = new javax.swing.JTextField();
                transactionDetailsLbl = new javax.swing.JLabel();
                fullNameLbl = new javax.swing.JLabel();
                fullNameValueLbl = new javax.swing.JLabel();
                contactLbl = new javax.swing.JLabel();
                contactValueLbl = new javax.swing.JLabel();
                emailValueLbl = new javax.swing.JLabel();
                pickUpLocLbl = new javax.swing.JLabel();
                carModelValueLbl = new javax.swing.JLabel();
                carModelLbl = new javax.swing.JLabel();
                pickUpLocValueLbl = new javax.swing.JLabel();
                rentDateLbl = new javax.swing.JLabel();
                rentDateValueLbl = new javax.swing.JLabel();
                rentedDriverLbl = new javax.swing.JLabel();
                rentedDriverValueLbl = new javax.swing.JLabel();
                carTotalPriceLbl = new javax.swing.JLabel();
                carTotalPriceValueLbl = new javax.swing.JLabel();
                driverFeeLbl = new javax.swing.JLabel();
                driverFeeValueLbl = new javax.swing.JLabel();
                totalLbl = new javax.swing.JLabel();
                totalValueLbl = new javax.swing.JLabel();
                paymentBtn = new javax.swing.JButton();
                cancelBtn = new javax.swing.JButton();
                DriverIdOrRentDriverDaysErrorLbl = new javax.swing.JLabel();

                try {
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental", "root",
                                        "hansignacio");
                        Statement userstm = con.createStatement();
                        Statement carstm = con.createStatement();

                        String usersql = "Select * FROM customers WHERE username='" + usernameemail + "' OR email='"
                                        + usernameemail
                                        + "'";
                        String carsql = "Select * FROM car_types WHERE car_id='" + carId + "'";

                        ResultSet userrs = userstm.executeQuery(usersql);
                        ResultSet carrs = carstm.executeQuery(carsql);

                        while (userrs.next()) {
                                String lname = userrs.getString("lname");
                                String fname = userrs.getString("fname");
                                String minitial = userrs.getString("minitial");
                                String contact_no = userrs.getString("contact_no");
                                String email = userrs.getString("email");

                                fullNameValueLbl.setText(fname + " " + minitial + ". " + lname);
                                contactValueLbl.setText(contact_no);
                                emailValueLbl.setText(email);
                        }

                        if (carrs.next()) {
                                String carname = carrs.getString("car_name");
                                int carprice = carrs.getInt("price");

                                int daysRented = Integer.parseInt(inputDays);
                                int carRentedTotalPrice = carprice * daysRented;

                                carModelValueLbl.setText(carname);
                                carTotalPriceValueLbl.setText(String.valueOf(carRentedTotalPrice));
                                totalValueLbl.setText(String.valueOf(carRentedTotalPrice));
                        }

                } catch (SQLException ex) {
                        Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception e) {
                        System.out.println(e.getMessage());
                }
                homePageMenuBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
                popupMenu.add(homePageMenuBtn);
                homePageMenuBtn.setText("Home Page");
                homePageMenuBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                homePageMenuBtnActionPerformed(evt, usernameemail);
                        }
                });

                accountMenuBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
                popupMenu.add(accountMenuBtn);
                accountMenuBtn.setText("Account");
                accountMenuBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                accountMenuBtnActionPerformed(evt, usernameemail);
                        }
                });

                transactionMenuBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
                popupMenu.add(transactionMenuBtn);
                transactionMenuBtn.setText("Transaction");
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

                rentDriverLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
                rentDriverLbl.setText("Rent a driver?");

                rentDriverCheckBox.setFont(new java.awt.Font("Segoe UI", 1, 12));
                rentDriverCheckBox.setText("PHP 500/day");
                rentDriverCheckBox.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                rentDriverCheckBoxActionPerformed(evt, carTotalPriceValueLbl.getText());
                        }
                });

                DriverIdOrRentDriverDaysLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
                DriverIdOrRentDriverDaysLbl.setText("Driver's I.D.:");

                DriverIdOrRentDriverDaysTextfield.setFont(new java.awt.Font("Segoe UI", 1, 12));
                DriverIdOrRentDriverDaysTextfield
                                .setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                DriverIdOrRentDriverDaysTextfield.setText("");
                DriverIdOrRentDriverDaysTextfield.getDocument().addDocumentListener(new DocumentListener() {
                        public void insertUpdate(DocumentEvent e) {
                                System.out.println("insert");
                                updateLabel(carTotalPriceValueLbl.getText());

                        }

                        public void removeUpdate(DocumentEvent e) {
                                System.out.println("remove");
                                driverFeeValueLbl.setText("0");
                                totalValueLbl.setText(carTotalPriceValueLbl.getText());
                        }

                        public void changedUpdate(DocumentEvent e) {
                                System.out.println("changed");
                                updateLabel(carTotalPriceValueLbl.getText());

                        }

                });

                transactionDetailsLbl.setFont(new java.awt.Font("Segoe UI", 1, 18));
                transactionDetailsLbl.setText("Transaction Details:");

                fullNameLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
                fullNameLbl.setText("Full Name:");

                contactLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
                contactLbl.setText("Contact Details:");

                pickUpLocLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
                pickUpLocLbl.setText("Pick-up Location:");

                carModelLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
                carModelLbl.setText("Car Model:");

                pickUpLocValueLbl.setText(selectedValue);

                rentDateLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
                rentDateLbl.setText("Rent date:");

                rentDateValueLbl.setText(dateString + " - " + returnDate);

                rentedDriverLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
                rentedDriverLbl.setText("Rented a driver:");

                rentedDriverValueLbl.setText("No");

                carTotalPriceLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
                carTotalPriceLbl.setText("Rented Car Total Price:");

                driverFeeLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
                driverFeeLbl.setText("Driver's Fee:");

                driverFeeValueLbl.setText("0");

                totalLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
                totalLbl.setText("Total:");

                totalValueLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));

                paymentBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
                paymentBtn.setText("Payment");
                paymentBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                paymentBtnActionPerformed(evt, usernameemail, carId, inputDays, dateString, returnDate);
                        }
                });

                cancelBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
                cancelBtn.setText("Cancel");
                cancelBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                cancelBtnActionPerformed(usernameemail);
                        }
                });
                DriverIdOrRentDriverDaysErrorLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
                DriverIdOrRentDriverDaysErrorLbl.setForeground(new java.awt.Color(255, 51, 51));
                DriverIdOrRentDriverDaysErrorLbl.setText("Input your Driver's I.D.");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(topJpanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(21, 21, 21)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                .addComponent(DriverIdOrRentDriverDaysLbl,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE)
                                                                                                                .addComponent(rentDriverLbl,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                Short.MAX_VALUE))
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(rentDriverCheckBox))
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                layout
                                                                                                                                                .createSequentialGroup()
                                                                                                                                                .addGap(10, 10, 10)
                                                                                                                                                .addComponent(DriverIdOrRentDriverDaysTextfield,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                140,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                .addGap(18, 18, 18)
                                                                                                .addComponent(DriverIdOrRentDriverDaysErrorLbl,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(29, 29, 29)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(fullNameLbl)
                                                                                                                .addComponent(contactLbl)
                                                                                                                .addComponent(pickUpLocLbl)
                                                                                                                .addComponent(carModelLbl)
                                                                                                                .addComponent(rentDateLbl)
                                                                                                                .addComponent(rentedDriverLbl)
                                                                                                                .addComponent(carTotalPriceLbl)
                                                                                                                .addComponent(driverFeeLbl)
                                                                                                                .addComponent(totalLbl))
                                                                                                .addGap(42, 42, 42)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(contactValueLbl,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                205,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(fullNameValueLbl,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                205,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(emailValueLbl,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                205,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(carModelValueLbl,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                205,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(pickUpLocValueLbl,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                205,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(rentDateValueLbl,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                205,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(rentedDriverValueLbl,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                205,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(carTotalPriceValueLbl,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                205,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(driverFeeValueLbl,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                205,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(totalValueLbl,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                205,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(0, 14, Short.MAX_VALUE)))
                                                                .addContainerGap())
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout.createSequentialGroup()
                                                                                                                .addComponent(transactionDetailsLbl)
                                                                                                                .addGap(120, 120,
                                                                                                                                120))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout.createSequentialGroup()
                                                                                                                .addComponent(cancelBtn)
                                                                                                                .addGap(77, 77, 77)
                                                                                                                .addComponent(paymentBtn)
                                                                                                                .addGap(98, 98, 98)))));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(topJpanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(rentDriverLbl)
                                                                                .addComponent(rentDriverCheckBox))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(DriverIdOrRentDriverDaysLbl)
                                                                                .addGroup(layout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                .addComponent(DriverIdOrRentDriverDaysTextfield,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addComponent(DriverIdOrRentDriverDaysErrorLbl)))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(transactionDetailsLbl)
                                                                .addGap(24, 24, 24)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(fullNameLbl)
                                                                                .addComponent(fullNameValueLbl))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(contactLbl)
                                                                                .addComponent(contactValueLbl))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(emailValueLbl)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(carModelValueLbl)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(pickUpLocValueLbl))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(carModelLbl)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(pickUpLocLbl)))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(rentDateLbl)
                                                                                .addComponent(rentDateValueLbl))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(rentedDriverLbl)
                                                                                .addComponent(rentedDriverValueLbl))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(carTotalPriceLbl)
                                                                                .addComponent(carTotalPriceValueLbl))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(driverFeeLbl)
                                                                                .addComponent(driverFeeValueLbl))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(totalLbl)
                                                                                .addComponent(totalValueLbl))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(paymentBtn)
                                                                                .addComponent(cancelBtn))
                                                                .addContainerGap(51, Short.MAX_VALUE)));

                pack();
        }

        private void menuBtnActionPerformed(java.awt.event.ActionEvent evt) {
                popupMenu.show(menuBtn, 0, menuBtn.getHeight());
        }

        private void rentDriverCheckBoxActionPerformed(java.awt.event.ActionEvent evt, String carTotalPriceValueLbl) {
                if (rentDriverCheckBox.isSelected()) {
                        DriverIdOrRentDriverDaysErrorLbl.setText("");
                        DriverIdOrRentDriverDaysLbl.setText("No. of Days");
                        rentedDriverValueLbl.setText("Yes");
                        DriverIdOrRentDriverDaysTextfield.setText("0");
                        updateLabel(carTotalPriceValueLbl);
                } else {
                        DriverIdOrRentDriverDaysLbl.setText("Driver's I.D.:");
                        rentedDriverValueLbl.setText("No");
                        DriverIdOrRentDriverDaysErrorLbl.setText("");
                        DriverIdOrRentDriverDaysTextfield.setText("");
                        updateLabel(carTotalPriceValueLbl);
                }
        }

        private void paymentBtnActionPerformed(java.awt.event.ActionEvent evt, String usernameemail, int carId,
                        String inputDays, String dateString, LocalDate returnDate) {
                String userinput = DriverIdOrRentDriverDaysTextfield.getText();
                int daysRenting = Integer.parseInt(inputDays);

                if (rentDriverCheckBox.isSelected()) {
                        if (isInteger(userinput)) {
                                DriverIdOrRentDriverDaysErrorLbl.setText("");
                        } else {
                                DriverIdOrRentDriverDaysErrorLbl.setText("Please input no. of days!");
                        }
                        if (!(Integer.parseInt(userinput) <= daysRenting)) {
                                DriverIdOrRentDriverDaysErrorLbl.setText("It should be < or = " + daysRenting +
                                                " days.");
                        } else if (Integer.parseInt(userinput) <= 0) {
                                DriverIdOrRentDriverDaysErrorLbl.setText("It should be > 0 days.");
                        } else {
                                DriverIdOrRentDriverDaysErrorLbl.setText("");
                        }
                } else if ((!rentDriverCheckBox.isSelected())) {
                        if (DriverIdOrRentDriverDaysTextfield.getText().isEmpty()) {
                                DriverIdOrRentDriverDaysErrorLbl.setText("Input your Driver's I.D.");
                        } else {
                                DriverIdOrRentDriverDaysErrorLbl.setText("");
                        }
                }
                if (DriverIdOrRentDriverDaysErrorLbl.getText().isEmpty()) {
                        Connection con = null;
                        try {
                                String loc = pickUpLocValueLbl.getText();
                                con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental",
                                                "root",
                                                "hansignacio");
                                con.setAutoCommit(false);
                                Statement userstm = con.createStatement();

                                String usersql = "Select * FROM customers WHERE username='" + usernameemail
                                                + "' OR email='"
                                                + usernameemail
                                                + "'";

                                ResultSet userrs = userstm.executeQuery(usersql);
                                if (userrs.next()) {
                                        String customerId = userrs.getString("customer_id");

                                        String insertTransactInfosSql = "INSERT INTO transactions(customer_id, car_id, loc, rent_date, return_date, total_amount, payment_method, transac_status, transac_date) VALUES(?, ?, ?, ?, ?, ?, ?, ?, NOW())";

                                        PreparedStatement preparedStatement = con
                                                        .prepareStatement(insertTransactInfosSql);
                                        preparedStatement = con.prepareStatement(insertTransactInfosSql,
                                                        Statement.RETURN_GENERATED_KEYS);
                                        preparedStatement.setString(1, customerId);
                                        preparedStatement.setString(2, String.valueOf(carId));
                                        preparedStatement.setString(3, loc);
                                        preparedStatement.setString(4, dateString);
                                        preparedStatement.setString(5, String.valueOf(returnDate));
                                        preparedStatement.setString(6, totalValueLbl.getText());
                                        preparedStatement.setString(7, "Unset");
                                        preparedStatement.setString(8, "Unpaid");

                                        int rowsAffected = preparedStatement.executeUpdate();

                                        if (rowsAffected > 0) {
                                                ResultSet rs = preparedStatement.getGeneratedKeys();
                                                if (rs.next()) {
                                                        int transact_id = rs.getInt(1);
                                                        dispose();
                                                        PaymentMethod pay = new PaymentMethod(transact_id,
                                                                        totalValueLbl.getText(), usernameemail);
                                                        pay.setVisible(true);
                                                }
                                        } else {
                                                System.out.println("Insert failed.");
                                        }
                                }
                                con.commit(); // Commit transaction
                        } catch (Exception e) {
                                if (con != null) {
                                        try {
                                                con.rollback(); // Rollback transaction on error
                                        } catch (Exception ex) {
                                                ex.printStackTrace();
                                        }
                                }
                                e.printStackTrace();
                        }

                }

        }

        private void updateLabel(String carTotalPriceValueLbl) {

                int carRentedValue = Integer.parseInt(carTotalPriceValueLbl);

                if (rentDriverCheckBox.isSelected()) {
                        String userInput = DriverIdOrRentDriverDaysTextfield.getText();
                        int userInputToInt = Integer.parseInt(userInput);
                        int driverTotalValue = userInputToInt * 500;
                        int totalAmountCalculate = driverTotalValue + carRentedValue;
                        driverFeeValueLbl.setText(String.valueOf(driverTotalValue));
                        try {
                                totalValueLbl.setText(String.valueOf(totalAmountCalculate));
                        } catch (NumberFormatException ex) {
                                driverFeeValueLbl.setText("0");
                        }
                } else {
                        driverFeeValueLbl.setText("0");
                        totalValueLbl.setText(String.valueOf(carRentedValue));
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

        private void homePageMenuBtnActionPerformed(ActionEvent evt, String usernameemail) {
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

                if (response == JOptionPane.YES_OPTION) {
                        dispose();
                        loginForm login = new loginForm();
                        login.setVisible(true);
                }
        }

        private void cancelBtnActionPerformed(String usernameemail) {
                int response = JOptionPane.showConfirmDialog(this,
                                "Are you sure you want to cancel this transaction?",
                                "Transaction Cancellation",
                                JOptionPane.YES_NO_OPTION,
                                JOptionPane.QUESTION_MESSAGE);

                if (response == JOptionPane.YES_OPTION) {
                        dispose();
                        HomePage hpage = new HomePage(usernameemail);
                        hpage.setVisible(true);
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
                        java.util.logging.Logger.getLogger(TransactionConfirmation.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(TransactionConfirmation.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(TransactionConfirmation.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(TransactionConfirmation.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                }
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                try {
                                        TransactionConfirmation frame = new TransactionConfirmation();
                                        frame.setVisible(true);
                                } catch (Exception e) {
                                        e.printStackTrace();
                                }
                        }
                });
        }

        // Variables declaration
        private javax.swing.JLabel DriverIdOrRentDriverDaysErrorLbl;
        private javax.swing.JLabel DriverIdOrRentDriverDaysLbl;
        private javax.swing.JTextField DriverIdOrRentDriverDaysTextfield;
        private javax.swing.JMenuItem accountMenuBtn;
        private javax.swing.JButton cancelBtn;
        private javax.swing.JLabel carModelLbl;
        private javax.swing.JLabel carModelValueLbl;
        private javax.swing.JLabel carRentalLbl;
        private javax.swing.JLabel carTotalPriceLbl;
        private javax.swing.JLabel carTotalPriceValueLbl;
        private javax.swing.JLabel contactLbl;
        private javax.swing.JLabel contactValueLbl;
        private javax.swing.JLabel driverFeeLbl;
        private javax.swing.JLabel driverFeeValueLbl;
        private javax.swing.JLabel emailValueLbl;
        private javax.swing.JLabel fullNameLbl;
        private javax.swing.JLabel fullNameValueLbl;
        private javax.swing.JMenuItem homePageMenuBtn;
        private javax.swing.JMenuItem logoutMenuBtn;
        private javax.swing.JButton menuBtn;
        private javax.swing.JButton paymentBtn;
        private javax.swing.JLabel pickUpLocLbl;
        private javax.swing.JLabel pickUpLocValueLbl;
        private javax.swing.JPopupMenu popupMenu;
        private javax.swing.JLabel rentDateLbl;
        private javax.swing.JLabel rentDateValueLbl;
        private javax.swing.JCheckBox rentDriverCheckBox;
        private javax.swing.JLabel rentDriverLbl;
        private javax.swing.JLabel rentedDriverLbl;
        private javax.swing.JLabel rentedDriverValueLbl;
        private javax.swing.JPanel topJpanel;
        private javax.swing.JLabel totalLbl;
        private javax.swing.JLabel totalValueLbl;
        private javax.swing.JLabel transactionDetailsLbl;
        private javax.swing.JMenuItem transactionMenuBtn;
        // End of variables declaration
}
