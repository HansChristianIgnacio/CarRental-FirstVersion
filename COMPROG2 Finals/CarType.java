import java.awt.*;
import java.sql.*;
import java.util.logging.*;
import java.awt.event.*;
import javax.swing.*;

public class CarType extends javax.swing.JFrame {

    public CarType(String usernameemail, int carId1, int carId2) {
        setTitle("Rent Car");
        initComponents(usernameemail, carId1, carId2);
    }

    public CarType() {

    }

    private void initComponents(String usernameemail, int carId1, int carId2) {

        popupMenu = new javax.swing.JPopupMenu();
        homePageMenuBtn = new javax.swing.JMenuItem();
        accountMenuBtn = new javax.swing.JMenuItem();
        transactionMenuBtn = new javax.swing.JMenuItem();
        logoutMenuBtn = new javax.swing.JMenuItem();
        carTypeLbl = new javax.swing.JLabel();
        topJpanel = new javax.swing.JPanel();
        menuBtn = new javax.swing.JButton();
        carRentalLbl = new javax.swing.JLabel();
        car1JPanel = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (isMouseInside) {
                    Graphics2D g2d = (Graphics2D) g.create();
                    g2d.setColor(new Color(0, 255, 0, 128));
                    g2d.fillRect(0, 0, getWidth(), getHeight());
                    g2d.dispose();
                }
            }
        };
        car1PhotoLbl = new javax.swing.JLabel();
        totalPassLbl = new javax.swing.JLabel();
        totalBagsLbl = new javax.swing.JLabel();
        totalDoorsLbl = new javax.swing.JLabel();
        airConditionedLbl = new javax.swing.JLabel();
        car1priceLbl = new javax.swing.JLabel();
        priceOfCar = new javax.swing.JLabel();
        totalPass = new javax.swing.JLabel();
        largeBag = new javax.swing.JLabel();
        airConditioned = new javax.swing.JLabel();
        totalDoors = new javax.swing.JLabel();
        smallBag = new javax.swing.JLabel();
        carNameLbl = new javax.swing.JLabel();
        nameOfCar = new javax.swing.JLabel();
        car2JPanel = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (isMouseInside) {
                    Graphics2D g2d = (Graphics2D) g.create();
                    g2d.setColor(new Color(0, 255, 0, 128));
                    g2d.fillRect(0, 0, getWidth(), getHeight());
                    g2d.dispose();
                }
            }
        };
        car2PhotoLbl = new javax.swing.JLabel();
        totalPass2Lbl = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        totalDoors2lbl = new javax.swing.JLabel();
        airConditioned2Lbl = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        priceOfCar2 = new javax.swing.JLabel();
        totalPass2 = new javax.swing.JLabel();
        largeBag2 = new javax.swing.JLabel();
        airConditioned2 = new javax.swing.JLabel();
        totalDoors2 = new javax.swing.JLabel();
        smallBag2 = new javax.swing.JLabel();
        car2NameLbl = new javax.swing.JLabel();
        nameOfCar2 = new javax.swing.JLabel();

        homePageMenuBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
        popupMenu.add(homePageMenuBtn);
        homePageMenuBtn.setText("Home Page");
        homePageMenuBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                homePageMenuBtnActionPerformed(evt, usernameemail);
            }
        });

        accountMenuBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
        popupMenu.add(accountMenuBtn);
        accountMenuBtn.setText("Account");
        accountMenuBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                accountMenuBtnActionPerformed(evt, usernameemail);
            }
        });

        transactionMenuBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
        popupMenu.add(transactionMenuBtn);
        transactionMenuBtn.setText("Transaction");
        transactionMenuBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                transactionMenuBtnActionPerformed(evt, usernameemail);
            }
        });

        logoutMenuBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
        popupMenu.add(logoutMenuBtn);
        logoutMenuBtn.setOpaque(true);
        logoutMenuBtn.setBackground(Color.RED);
        logoutMenuBtn.setText("Logout");
        logoutMenuBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                logoutMenuBtnActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        topJpanel.setBackground(new java.awt.Color(153, 0, 153));
        topJpanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        menuBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
        menuBtn.setText("Menu");
        menuBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
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

        car1JPanel.setBackground(new java.awt.Color(204, 204, 255));
        car1JPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        car1JPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        car1JPanel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                car1JPanelMouseClicked(evt, usernameemail, carId1);
            }

            public void mouseEntered(MouseEvent evt) {
                car1JPanelMouseEntered(evt);
            }

            public void mouseExited(MouseEvent evt) {
                car1JPanelMouseExited(evt);
            }
        });
        if (carId1 == 1 && carId2 == 2) {
            car1PhotoLbl.setIcon(new javax.swing.ImageIcon("img/Toyota Yaris.jpg"));
            car2PhotoLbl.setIcon(new javax.swing.ImageIcon("img/Hyundai Accent.jpg"));
        } else if (carId1 == 3 && carId2 == 4) {
            car1PhotoLbl.setIcon(new javax.swing.ImageIcon("img/Chevrolet Impala.jpg"));
            car2PhotoLbl.setIcon(new javax.swing.ImageIcon("img/Ford Taurus.jpg"));
        } else if (carId1 == 5 && carId2 == 6) {
            car1PhotoLbl.setIcon(new javax.swing.ImageIcon("img/Honda Odyssey.jpg"));
            car2PhotoLbl.setIcon(new javax.swing.ImageIcon("img/Ford Transit.jpg"));
        }

        totalPassLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
        totalPassLbl.setText("Total Passengers: ");

        totalBagsLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
        totalBagsLbl.setText("Total Bags: ");

        totalDoorsLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
        totalDoorsLbl.setText("Total Doors:");

        airConditionedLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
        airConditionedLbl.setText("Air Conditioned:");

        car1priceLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
        car1priceLbl.setText("Price (Daily):");

        carNameLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
        carNameLbl.setText("Car Name:");

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental", "root",
                    "hansignacio");
            Statement car1stm = con.createStatement();
            Statement car2stm = con.createStatement();

            String car1sql = "Select * from car_types WHERE car_id='" + carId1 + "'";

            String car2sql = "Select * from car_types WHERE car_id='" + carId2
                    + "'";

            ResultSet car1rs = car1stm.executeQuery(car1sql);

            ResultSet car2rs = car2stm.executeQuery(car2sql);

            if (car1rs.next()) {
                String car1 = car1rs.getString("car_name");
                String pricecar1 = car1rs.getString("price");
                String totalpasscar1 = car1rs.getString("max_passengers");
                String largebag1 = car1rs.getString("maxlarge_bags");
                String smallbag1 = car1rs.getString("maxsmall_bags");
                String doorcount1 = car1rs.getString("doors");
                String aircon1 = car1rs.getString("air_conditioned");
                String cartype = car1rs.getString("car_type");

                car1namemethod(car1);
                priceOfCar1(pricecar1);
                totalPassCar1(totalpasscar1);
                largeBagCar1(largebag1);
                smallBagCar1(smallbag1);
                door1(doorcount1);
                ac(aircon1);
                ct1(cartype);
            }
            if (car2rs.next()) {
                String car2 = car2rs.getString("car_name");
                String priceCar2 = car2rs.getString("price");
                String totalpasscar2 = car2rs.getString("max_passengers");
                String largebag2 = car2rs.getString("maxlarge_bags");
                String smallbag2 = car2rs.getString("maxsmall_bags");
                String doorcount2 = car2rs.getString("doors");
                String aircon2 = car2rs.getString("air_conditioned");
                String cartype2 = car2rs.getString("car_type");

                car2namemethod(car2);
                car2Price(priceCar2);
                totalPassCar2(totalpasscar2);
                largeBagCar2(largebag2);
                smallBagCar2(smallbag2);
                door2(doorcount2);
                ac2(aircon2);
                ct2(cartype2);
            }

        } catch (SQLException ex) {
            Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        javax.swing.GroupLayout car1JPanelLayout = new javax.swing.GroupLayout(car1JPanel);
        car1JPanel.setLayout(car1JPanelLayout);
        car1JPanelLayout.setHorizontalGroup(
                car1JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(car1JPanelLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(car1JPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(car1JPanelLayout.createSequentialGroup()
                                                .addGroup(car1JPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(car1priceLbl)
                                                        .addComponent(carNameLbl))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(car1JPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(car1JPanelLayout.createSequentialGroup()
                                                                .addComponent(priceOfCar,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addGap(24, 24, 24))
                                                        .addGroup(car1JPanelLayout.createSequentialGroup()
                                                                .addComponent(nameOfCar,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 101,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE))))
                                        .addGroup(car1JPanelLayout.createSequentialGroup()
                                                .addGroup(car1JPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(car1JPanelLayout.createSequentialGroup()
                                                                .addGroup(car1JPanelLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(totalPassLbl)
                                                                        .addComponent(totalBagsLbl))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(car1JPanelLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                        .addComponent(totalPass,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                42,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(smallBag,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(largeBag,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                61,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(car1JPanelLayout.createSequentialGroup()
                                                                .addGroup(car1JPanelLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(totalDoorsLbl)
                                                                        .addComponent(airConditionedLbl))
                                                                .addGroup(car1JPanelLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(car1JPanelLayout
                                                                                .createSequentialGroup()
                                                                                .addGap(16, 16, 16)
                                                                                .addComponent(totalDoors,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        37,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(car1JPanelLayout
                                                                                .createSequentialGroup()
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(airConditioned,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        37,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                .addContainerGap())))
                        .addGroup(car1JPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(car1PhotoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 199,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        car1JPanelLayout.setVerticalGroup(
                car1JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(car1JPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(car1PhotoLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(
                                        car1JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(carNameLbl)
                                                .addComponent(nameOfCar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(
                                        car1JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(car1priceLbl)
                                                .addComponent(priceOfCar))
                                .addGap(18, 18, 18)
                                .addGroup(
                                        car1JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(totalPassLbl)
                                                .addComponent(totalPass))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(
                                        car1JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(totalBagsLbl)
                                                .addComponent(largeBag))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(smallBag)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(
                                        car1JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(totalDoorsLbl)
                                                .addComponent(totalDoors))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(
                                        car1JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(airConditioned)
                                                .addComponent(airConditionedLbl))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        car2JPanel.setBackground(new java.awt.Color(204, 204, 255));
        car2JPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        car2JPanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        car2JPanel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                car2JPanelMouseClicked(evt, usernameemail, carId2);
            }

            public void mouseEntered(MouseEvent evt) {
                car2JPanelMouseEntered(evt);
            }

            public void mouseExited(MouseEvent evt) {
                car2JPanelMouseExited(evt);
            }
        });

        totalPass2Lbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
        totalPass2Lbl.setText("Total Passengers: ");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel16.setText("Total Bags: ");

        totalDoors2lbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
        totalDoors2lbl.setText("Total Doors:");

        airConditioned2Lbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
        airConditioned2Lbl.setText("Air Conditioned:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 12));
        jLabel19.setText("Price (Daily):");

        car2NameLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
        car2NameLbl.setText("Car Name:");

        javax.swing.GroupLayout car2JPanelLayout = new javax.swing.GroupLayout(car2JPanel);
        car2JPanel.setLayout(car2JPanelLayout);
        car2JPanelLayout.setHorizontalGroup(
                car2JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(car2JPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(car2PhotoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 199,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(car2JPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(car2JPanelLayout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(car2JPanelLayout.createSequentialGroup()
                                                .addComponent(jLabel19)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(priceOfCar2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(5, 5, 5))
                                        .addGroup(car2JPanelLayout.createSequentialGroup()
                                                .addGroup(car2JPanelLayout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(car2JPanelLayout.createSequentialGroup()
                                                                .addGroup(car2JPanelLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(totalPass2Lbl)
                                                                        .addComponent(jLabel16)
                                                                        .addComponent(totalDoors2lbl)
                                                                        .addComponent(airConditioned2Lbl))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(car2JPanelLayout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                        .addComponent(totalDoors2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                37,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(totalPass2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                37,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(airConditioned2,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                37,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(largeBag2,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(smallBag2,
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                53,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(car2JPanelLayout.createSequentialGroup()
                                                                .addComponent(car2NameLbl)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(nameOfCar2,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 101,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        Short.MAX_VALUE)))));
        car2JPanelLayout.setVerticalGroup(
                car2JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(car2JPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(car2PhotoLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(
                                        car2JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(car2NameLbl)
                                                .addComponent(nameOfCar2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(
                                        car2JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel19)
                                                .addComponent(priceOfCar2))
                                .addGap(18, 18, 18)
                                .addGroup(
                                        car2JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(totalPass2Lbl)
                                                .addComponent(totalPass2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(
                                        car2JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jLabel16)
                                                .addComponent(largeBag2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(smallBag2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(
                                        car2JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(totalDoors2lbl)
                                                .addComponent(totalDoors2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(
                                        car2JPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(airConditioned2)
                                                .addComponent(airConditioned2Lbl))
                                .addGap(23, 23, 23)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(topJpanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(car1JPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 211,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(car2JPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(22, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(carTypeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 198,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(topJpanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(carTypeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(car1JPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(car2JPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(46, Short.MAX_VALUE)));

        pack();
    }

    private void menuBtnActionPerformed(ActionEvent evt) {
        popupMenu.show(menuBtn, 0, menuBtn.getHeight());
    }

    private void car1JPanelMouseClicked(MouseEvent evt, String usernameemail, int carId1) {
        dispose();
        TransactionAdditionalDetails tad = new TransactionAdditionalDetails(usernameemail, carId1);
        tad.setVisible(true);
    }

    private void car1JPanelMouseEntered(MouseEvent evt) {
        isMouseInside = true;
        car1JPanel.repaint();
    }

    private void car1JPanelMouseExited(MouseEvent evt) {
        isMouseInside = false;
        car1JPanel.repaint();
    }

    private void car2JPanelMouseClicked(MouseEvent evt, String usernameemail, int carId2) {
        dispose();
        TransactionAdditionalDetails tad = new TransactionAdditionalDetails(usernameemail, carId2);
        tad.setVisible(true);
    }

    private void car2JPanelMouseEntered(MouseEvent evt) {
        isMouseInside = true;
        car2JPanel.repaint();
    }

    private void car2JPanelMouseExited(MouseEvent evt) {
        isMouseInside = false;
        car2JPanel.repaint();
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

    private void logoutMenuBtnActionPerformed(ActionEvent evt) {
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

    public static void car1namemethod(String car1name) {
        nameOfCar.setFont(new java.awt.Font("Segoe UI", 1, 12));
        nameOfCar.setText(car1name);
    }

    public static void priceOfCar1(String priceCar1) {
        priceOfCar.setFont(new java.awt.Font("Segoe UI", 1, 18));
        priceOfCar.setForeground(new java.awt.Color(255, 0, 51));
        priceOfCar.setText("PHP " + priceCar1);
    }

    public static void totalPassCar1(String totalpasscar1) {
        totalPass.setFont(new java.awt.Font("Segoe UI", 1, 12));
        totalPass.setText(totalpasscar1);
    }

    public static void largeBagCar1(String largebag1) {
        largeBag.setFont(new java.awt.Font("Segoe UI", 1, 12));
        largeBag.setText(largebag1 + " Large Or");
    }

    public static void smallBagCar1(String smallbag1) {
        smallBag.setFont(new java.awt.Font("Segoe UI", 1, 12));
        smallBag.setText(smallbag1 + " Small");
    }

    public static void door1(String doorcount1) {
        totalDoors.setFont(new java.awt.Font("Segoe UI", 1, 12));
        totalDoors.setText(doorcount1);
    }

    public static void ac(String aircon1) {
        airConditioned.setFont(new java.awt.Font("Segoe UI", 1, 12));
        airConditioned.setText(aircon1);
    }

    public static void car2namemethod(String car2name) {
        nameOfCar2.setFont(new java.awt.Font("Segoe UI", 1, 12));
        nameOfCar2.setText(car2name);
    }

    public static void car2Price(String priceCar2) {
        priceOfCar2.setFont(new java.awt.Font("Segoe UI", 1, 18));
        priceOfCar2.setForeground(new java.awt.Color(255, 0, 51));
        priceOfCar2.setText("PHP " + priceCar2);
    }

    public static void totalPassCar2(String totalpasscar2) {
        totalPass2.setFont(new java.awt.Font("Segoe UI", 1, 12));
        totalPass2.setText(totalpasscar2);
    }

    public static void largeBagCar2(String largebagcar2) {
        largeBag2.setFont(new java.awt.Font("Segoe UI", 1, 12));
        largeBag2.setText(largebagcar2 + " Large Or");
    }

    public static void smallBagCar2(String smallbagcar2) {
        smallBag2.setFont(new java.awt.Font("Segoe UI", 1, 12));
        smallBag2.setText(smallbagcar2 + " Small");
    }

    public static void door2(String doorscar2) {
        totalDoors2.setFont(new java.awt.Font("Segoe UI", 1, 12));
        totalDoors2.setText(doorscar2);
    }

    public static void ac2(String aircon2) {
        airConditioned2.setFont(new java.awt.Font("Segoe UI", 1, 12));
        airConditioned2.setText(aircon2);
    }

    public static void ct1(String carType) {
        carTypeLbl.setFont(new java.awt.Font("Segoe UI Black", 1, 24));
        carTypeLbl.setHorizontalAlignment(SwingConstants.CENTER);
        carTypeLbl.setText(carType);
    }

    public static void ct2(String carType2) {
        carTypeLbl.setFont(new java.awt.Font("Segoe UI Black", 1, 24));
        carTypeLbl.setHorizontalAlignment(SwingConstants.CENTER);
        carTypeLbl.setText(carType2);
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
            java.util.logging.Logger.getLogger(CarType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    CarType frame = new CarType();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // Variables declaration
    private javax.swing.JMenuItem accountMenuBtn;
    private static javax.swing.JLabel airConditioned;
    private static javax.swing.JLabel airConditioned2;
    private javax.swing.JLabel airConditioned2Lbl;
    private javax.swing.JLabel airConditionedLbl;
    private javax.swing.JPanel car1JPanel;
    private javax.swing.JLabel car1PhotoLbl;
    private javax.swing.JLabel car1priceLbl;
    private javax.swing.JPanel car2JPanel;
    private javax.swing.JLabel car2NameLbl;
    private javax.swing.JLabel car2PhotoLbl;
    private javax.swing.JLabel carNameLbl;
    private javax.swing.JLabel carRentalLbl;
    private static javax.swing.JLabel carTypeLbl;
    private javax.swing.JMenuItem homePageMenuBtn;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel19;
    private static javax.swing.JLabel largeBag;
    private static javax.swing.JLabel largeBag2;
    private javax.swing.JMenuItem logoutMenuBtn;
    private javax.swing.JButton menuBtn;
    private static javax.swing.JLabel nameOfCar;
    private static javax.swing.JLabel nameOfCar2;
    private javax.swing.JPopupMenu popupMenu;
    private static javax.swing.JLabel priceOfCar;
    private static javax.swing.JLabel priceOfCar2;
    private static javax.swing.JLabel smallBag;
    private static javax.swing.JLabel smallBag2;
    private javax.swing.JPanel topJpanel;
    private javax.swing.JLabel totalBagsLbl;
    private static javax.swing.JLabel totalDoors;
    private static javax.swing.JLabel totalDoors2;
    private javax.swing.JLabel totalDoors2lbl;
    private javax.swing.JLabel totalDoorsLbl;
    private static javax.swing.JLabel totalPass;
    private static javax.swing.JLabel totalPass2;
    private javax.swing.JLabel totalPass2Lbl;
    private javax.swing.JLabel totalPassLbl;
    private javax.swing.JMenuItem transactionMenuBtn;
    private boolean isMouseInside = false;
    // End of variables declaration
}
