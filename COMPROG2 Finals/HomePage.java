import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.util.logging.*;
import java.awt.event.*;

public class HomePage extends javax.swing.JFrame {
        public HomePage(String usernameemail) {
                setTitle("Home Page");
                initComponents(usernameemail);
        }

        public HomePage() {
        }

        private void initComponents(String usernameemail) {
                popupMenu = new javax.swing.JPopupMenu();
                AccountMenuBtn = new javax.swing.JMenuItem();
                transacHistoryMenuBtn = new javax.swing.JMenuItem();
                logoutMenuBtn = new javax.swing.JMenuItem();
                jScrollPane = new javax.swing.JScrollPane();
                mainJpanel = new javax.swing.JPanel();
                topJpanel = new javax.swing.JPanel();
                menuBtn = new javax.swing.JButton();
                carRentalLbl = new javax.swing.JLabel();
                welcomeLbl = new javax.swing.JLabel();
                taglineLbl = new javax.swing.JLabel();
                homepagephotoLbl = new javax.swing.JLabel();
                rentNowLbl = new javax.swing.JLabel();
                economyJpanel = new javax.swing.JPanel() {
                        protected void paintComponent(Graphics g) {
                                super.paintComponent(g);
                                if (isMouseInside) {
                                        Graphics2D g2d = (Graphics2D) g.create();
                                        g2d.setColor(new Color(255, 255, 0, 128));
                                        g2d.fillRect(0, 0, getWidth(), getHeight());
                                        g2d.dispose();
                                }
                        }
                };
                economylogoLbl = new javax.swing.JLabel();
                economyLbl = new javax.swing.JLabel();
                fullsizeJpanel = new javax.swing.JPanel() {
                        protected void paintComponent(Graphics g) {
                                super.paintComponent(g);
                                if (isMouseInside) {
                                        Graphics2D g2d = (Graphics2D) g.create();
                                        g2d.setColor(new Color(255, 255, 0, 128));
                                        g2d.fillRect(0, 0, getWidth(), getHeight());
                                        g2d.dispose();
                                }
                        }
                };
                fullsizelbl = new javax.swing.JLabel();
                fullsizeLogoLbl = new javax.swing.JLabel();
                vanJpanel = new javax.swing.JPanel() {
                        @Override
                        protected void paintComponent(Graphics g) {
                                super.paintComponent(g);
                                if (isMouseInside) {
                                        Graphics2D g2d = (Graphics2D) g.create();
                                        g2d.setColor(new Color(255, 255, 0, 128));
                                        g2d.fillRect(0, 0, getWidth(), getHeight());
                                        g2d.dispose();
                                }
                        }
                };
                vanLbl = new javax.swing.JLabel();
                vanLogoLbl = new javax.swing.JLabel();
                contactUsJpanel = new javax.swing.JPanel();
                hansEmailLbl = new javax.swing.JLabel();
                ramnerEmailLbl = new javax.swing.JLabel();

                AccountMenuBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
                popupMenu.add(AccountMenuBtn);
                AccountMenuBtn.setText("Account");
                AccountMenuBtn.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent evt) {
                                AccountMenuBtnActionPerformed(evt, usernameemail);
                        }
                });

                transacHistoryMenuBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
                popupMenu.add(transacHistoryMenuBtn);
                transacHistoryMenuBtn.setText("Transaction");
                transacHistoryMenuBtn.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent evt) {
                                transacHistoryMenuBtnActionPerformed(evt, usernameemail);
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
                // Jscroll speed
                JScrollBar verticalScrollBar = jScrollPane.getVerticalScrollBar();
                verticalScrollBar.setUnitIncrement(16);
                verticalScrollBar.setBlockIncrement(50);

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setBackground(new java.awt.Color(204, 204, 255));

                jScrollPane.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
                jScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
                jScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

                mainJpanel.setBackground(new java.awt.Color(204, 204, 255));

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
                                                                .addGroup(topJpanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(menuBtn)
                                                                                .addComponent(carRentalLbl))
                                                                .addContainerGap(7, Short.MAX_VALUE)));

                try {
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/car_rental", "root",
                                        "hansignacio");
                        Statement stm = con.createStatement();
                        String sql = "Select * from customers WHERE username='" + usernameemail + "' OR email='"
                                        + usernameemail + "'";
                        ResultSet rs = stm.executeQuery(sql);

                        if (rs.next()) {
                                String firstname = String.valueOf(rs.getString("fname"));
                                welcomeLbl.setFont(new java.awt.Font("Segoe UI", 1, 24));
                                welcomeLbl.setForeground(new java.awt.Color(255, 51, 51));
                                welcomeLbl.setText("Welcome " + firstname + "!");
                        }
                } catch (SQLException ex) {
                        Logger.getLogger(loginForm.class.getName()).log(Level.SEVERE, null, ex);
                } catch (Exception e) {
                        System.out.println(e.getMessage());
                }

                taglineLbl.setFont(new java.awt.Font("Segoe Print", 1, 14));
                taglineLbl.setText("“Convenience Meets Savings on Every Ride.”");

                homepagephotoLbl.setIcon(new javax.swing.ImageIcon("img/homepage.png"));
                homepagephotoLbl.setText("jLabel2");

                rentNowLbl.setFont(new java.awt.Font("Segoe UI Black", 1, 24));
                rentNowLbl.setForeground(new java.awt.Color(255, 87, 229));
                rentNowLbl.setText("Rent Now:");

                economyJpanel.setBackground(new java.awt.Color(204, 204, 255));
                economyJpanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
                economyJpanel.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent evt) {
                                economyJpanelMouseClicked(evt, usernameemail);
                        }

                        public void mouseEntered(MouseEvent evt) {
                                economyJpanelMouseEntered(evt);
                        }

                        public void mouseExited(MouseEvent evt) {
                                economyJpanelMouseExited(evt);
                        }
                });

                economylogoLbl.setIcon(new javax.swing.ImageIcon("img/economycarlogo.jpg"));
                economylogoLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

                economyLbl.setFont(new java.awt.Font("Segoe UI", 1, 14));
                economyLbl.setText("Economy Cars");

                javax.swing.GroupLayout economyJpanelLayout = new javax.swing.GroupLayout(economyJpanel);
                economyJpanel.setLayout(economyJpanelLayout);
                economyJpanelLayout.setHorizontalGroup(
                                economyJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(economyJpanelLayout.createSequentialGroup()
                                                                .addGroup(economyJpanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(economyJpanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addComponent(economylogoLbl,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                140,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(economyJpanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(34, 34, 34)
                                                                                                .addComponent(economyLbl)))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                economyJpanelLayout.setVerticalGroup(
                                economyJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(economyJpanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(economylogoLbl,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                100,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(economyLbl)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                fullsizeJpanel.setBackground(new java.awt.Color(204, 204, 255));
                fullsizeJpanel.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent evt) {
                                fullsizeJpanelMouseClicked(evt, usernameemail);
                        }

                        public void mouseEntered(MouseEvent evt) {
                                fullsizeJpanelMouseEntered(evt);
                        }

                        public void mouseExited(MouseEvent evt) {
                                fullsizeJpanelMouseExited(evt);
                        }
                });

                fullsizelbl.setFont(new java.awt.Font("Segoe UI", 1, 14));
                fullsizelbl.setText("Full-size Cars");

                fullsizeLogoLbl.setIcon(new javax.swing.ImageIcon("img/fullsizecarlogo.jpg"));
                fullsizeLogoLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

                javax.swing.GroupLayout fullsizeJpanelLayout = new javax.swing.GroupLayout(fullsizeJpanel);
                fullsizeJpanel.setLayout(fullsizeJpanelLayout);
                fullsizeJpanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
                fullsizeJpanelLayout.setHorizontalGroup(
                                fullsizeJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(fullsizeJpanelLayout.createSequentialGroup()
                                                                .addGroup(fullsizeJpanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(fullsizeJpanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addComponent(fullsizeLogoLbl,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                140,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(fullsizeJpanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(31, 31, 31)
                                                                                                .addComponent(fullsizelbl)))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                fullsizeJpanelLayout.setVerticalGroup(
                                fullsizeJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(fullsizeJpanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(fullsizeLogoLbl,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                100,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(fullsizelbl)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                vanJpanel.setBackground(new java.awt.Color(204, 204, 255));
                vanJpanel.setCursor(new Cursor(Cursor.HAND_CURSOR));
                vanJpanel.addMouseListener(new MouseAdapter() {
                        public void mouseClicked(MouseEvent evt) {
                                vanJpanelMouseClicked(evt, usernameemail);
                        }

                        public void mouseEntered(MouseEvent evt) {
                                vanJpanelMouseEntered(evt);
                        }

                        public void mouseExited(MouseEvent evt) {
                                vanJpanelMouseExited(evt);
                        }
                });

                vanLbl.setFont(new java.awt.Font("Segoe UI", 1, 14));
                vanLbl.setText("Van");

                vanLogoLbl.setBackground(new java.awt.Color(204, 204, 255));
                vanLogoLbl.setIcon(new javax.swing.ImageIcon("img/vanlogo.jpg"));
                vanLogoLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

                javax.swing.GroupLayout vanJpanelLayout = new javax.swing.GroupLayout(vanJpanel);
                vanJpanel.setLayout(vanJpanelLayout);
                vanJpanelLayout.setHorizontalGroup(
                                vanJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(vanJpanelLayout.createSequentialGroup()
                                                                .addGroup(vanJpanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(vanJpanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addComponent(vanLogoLbl,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                140,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(vanJpanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(63, 63, 63)
                                                                                                .addComponent(vanLbl)))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                vanJpanelLayout.setVerticalGroup(
                                vanJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(vanJpanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(vanLogoLbl,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                100,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(vanLbl)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                contactUsJpanel.setBackground(new java.awt.Color(153, 0, 153));
                contactUsJpanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

                hansEmailLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
                hansEmailLbl.setText("Contact us: hanschristianignacio1@gmail.com");

                ramnerEmailLbl.setFont(new java.awt.Font("Segoe UI", 1, 12));
                ramnerEmailLbl.setText("ramnerleonida@gmail.com");

                javax.swing.GroupLayout contactUsJpanelLayout = new javax.swing.GroupLayout(contactUsJpanel);
                contactUsJpanel.setLayout(contactUsJpanelLayout);
                contactUsJpanelLayout.setHorizontalGroup(
                                contactUsJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(contactUsJpanelLayout.createSequentialGroup()
                                                                .addGap(74, 74, 74)
                                                                .addGroup(contactUsJpanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(hansEmailLbl)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                contactUsJpanelLayout
                                                                                                                .createSequentialGroup()
                                                                                                                .addComponent(ramnerEmailLbl)
                                                                                                                .addGap(42, 42, 42)))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                contactUsJpanelLayout.setVerticalGroup(
                                contactUsJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(contactUsJpanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(hansEmailLbl)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(ramnerEmailLbl)
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                javax.swing.GroupLayout mainJpanelLayout = new javax.swing.GroupLayout(mainJpanel);
                mainJpanel.setLayout(mainJpanelLayout);
                mainJpanelLayout.setHorizontalGroup(
                                mainJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(topJpanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(mainJpanelLayout.createSequentialGroup()
                                                                .addComponent(homepagephotoLbl,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                400,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                .addGroup(mainJpanelLayout.createSequentialGroup()
                                                                .addGap(25, 25, 25)
                                                                .addComponent(economyJpanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addComponent(fullsizeJpanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(25, 25, 25))
                                                .addComponent(contactUsJpanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(mainJpanelLayout.createSequentialGroup()
                                                                .addGroup(mainJpanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(mainJpanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addContainerGap()
                                                                                                .addComponent(welcomeLbl,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                390,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(mainJpanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(127, 127, 127)
                                                                                                .addComponent(rentNowLbl))
                                                                                .addGroup(mainJpanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(123, 123, 123)
                                                                                                .addComponent(vanJpanel,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainJpanelLayout
                                                                .createSequentialGroup()
                                                                .addGap(36, 36, 36)
                                                                .addComponent(taglineLbl,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                330,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(36, 36, 36)));
                mainJpanelLayout.setVerticalGroup(
                                mainJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(mainJpanelLayout.createSequentialGroup()
                                                                .addComponent(topJpanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(welcomeLbl)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(taglineLbl)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(homepagephotoLbl,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                110,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(rentNowLbl,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                30,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(mainJpanelLayout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(mainJpanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(fullsizeJpanel,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addGap(34, 34, 34))
                                                                                .addGroup(mainJpanelLayout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(economyJpanel,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)))
                                                                .addComponent(vanJpanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(53, 53, 53)
                                                                .addComponent(contactUsJpanel,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)));

                jScrollPane.setViewportView(mainJpanel);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.TRAILING));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane, javax.swing.GroupLayout.Alignment.TRAILING,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 400,
                                                                Short.MAX_VALUE));

                pack();
        }

        private void menuBtnActionPerformed(ActionEvent evt) {
                popupMenu.show(menuBtn, 0, menuBtn.getHeight());
        }

        private void economyJpanelMouseClicked(MouseEvent evt, String usernameemail) {
                int carId1 = 1;
                int carId2 = 2;
                dispose();
                CarType cartype = new CarType(usernameemail, carId1, carId2);
                cartype.setVisible(true);

        }

        private void economyJpanelMouseEntered(MouseEvent evt) {
                isMouseInside = true;
                economyJpanel.repaint();

        }

        private void economyJpanelMouseExited(MouseEvent evt) {
                isMouseInside = false;
                economyJpanel.repaint();

        }

        private void fullsizeJpanelMouseClicked(MouseEvent evt, String usernameemail) {
                int carId1 = 3;
                int carId2 = 4;
                dispose();
                CarType cartype = new CarType(usernameemail, carId1, carId2);
                cartype.setVisible(true);

        }

        private void fullsizeJpanelMouseEntered(MouseEvent evt) {
                isMouseInside = true;
                fullsizeJpanel.repaint();

        }

        private void fullsizeJpanelMouseExited(MouseEvent evt) {
                isMouseInside = false;
                fullsizeJpanel.repaint();

        }

        private void vanJpanelMouseClicked(MouseEvent evt, String usernameemail) {
                int carId1 = 5;
                int carId2 = 6;
                dispose();
                CarType cartype = new CarType(usernameemail, carId1, carId2);
                cartype.setVisible(true);

        }

        private void vanJpanelMouseEntered(MouseEvent evt) {
                isMouseInside = true;
                vanJpanel.repaint();

        }

        private void vanJpanelMouseExited(MouseEvent evt) {
                isMouseInside = false;
                vanJpanel.repaint();

        }

        private void AccountMenuBtnActionPerformed(ActionEvent evt, String usernameemail) {
                dispose();
                AccountPage accpage = new AccountPage(usernameemail);
                accpage.setVisible(true);
        }

        private void transacHistoryMenuBtnActionPerformed(ActionEvent evt, String usernameemail) {
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

        public static void main(String args[]) {
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                try {
                                        HomePage hpage = new HomePage();
                                        hpage.setVisible(true);
                                } catch (Exception e) {
                                        e.printStackTrace();
                                }
                        }
                });
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                }

        }

        // Variables declaration
        private javax.swing.JMenuItem AccountMenuBtn;
        private javax.swing.JLabel carRentalLbl;
        private javax.swing.JPanel contactUsJpanel;
        private javax.swing.JPanel economyJpanel;
        private javax.swing.JLabel economyLbl;
        private javax.swing.JLabel economylogoLbl;
        private javax.swing.JPanel fullsizeJpanel;
        private javax.swing.JLabel fullsizeLogoLbl;
        private javax.swing.JLabel fullsizelbl;
        private javax.swing.JLabel hansEmailLbl;
        private javax.swing.JLabel homepagephotoLbl;
        private javax.swing.JScrollPane jScrollPane;
        private javax.swing.JMenuItem logoutMenuBtn;
        private javax.swing.JPanel mainJpanel;
        private javax.swing.JButton menuBtn;
        private javax.swing.JPopupMenu popupMenu;
        private javax.swing.JLabel ramnerEmailLbl;
        private javax.swing.JLabel rentNowLbl;
        private javax.swing.JLabel taglineLbl;
        private javax.swing.JPanel topJpanel;
        private javax.swing.JMenuItem transacHistoryMenuBtn;
        private javax.swing.JPanel vanJpanel;
        private javax.swing.JLabel vanLbl;
        private javax.swing.JLabel vanLogoLbl;
        private javax.swing.JLabel welcomeLbl;
        private boolean isMouseInside = false;
        // End of variables declaration
}
