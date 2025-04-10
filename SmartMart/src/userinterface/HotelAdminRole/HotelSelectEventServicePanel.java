/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.HotelAdminRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Hotel.Hotel;

import Business.Orders.EventOrder;
import Business.Orders.Event1Directory;
import Business.EventManager.EventManager;

import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author  Samarth
 */
public class HotelSelectEventServicePanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    EcoSystem ecosystem;
    private UserAccount userAccount;
    EventManager eventManager;
    DefaultTableModel model;
    DefaultTableModel model1;
    DefaultTableModel model2;
    private String selectedItem;
    private String selectedPrice;
    private String removeItem;
    JSplitPane screen;
    Double Total = 0.0;

    private Event1Directory EventOrderDirectory;
    java.util.Date dateCurrent = new java.util.Date();

    /**
     * Creates new form CustomerSelectLegalPanel
     */
    public HotelSelectEventServicePanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, EventManager eventManager, JSplitPane screen) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.eventManager = eventManager;
        this.screen = screen;
        ecosystem = system;
        model = new DefaultTableModel();
        model1 = new DefaultTableModel();
        model2 = new DefaultTableModel();

        LegalserviceTable.setModel(model);
        cartTable.setModel(model1);

        EventOrderDirectory = new Event1Directory();

        model.addColumn("Service Name");
        model.addColumn("Price/hrs");

        model1.addColumn("Service Name");
        model1.addColumn("Date");
        model1.addColumn("Price");
        model1.addColumn("Hrs");
        model1.addColumn("Total");

        showMenuTable();
        showCartTable();

        eventname.setText(eventManager.getName());
        eventpn.setText(eventManager.getPhone());
        eventaddress.setText(eventManager.getAddress());
        eventgender.setText(eventManager.getGender());

        ImageIcon icon7 = new ImageIcon("./src/images/customer_panel_cart.png");
        Image image7 = icon7.getImage().getScaledInstance(75, 60, Image.SCALE_SMOOTH);
        AddButton.setIcon(new ImageIcon(image7));

        ImageIcon icon8 = new ImageIcon("./src/images/remove.png");
        Image image8 = icon8.getImage().getScaledInstance(45, 30, Image.SCALE_SMOOTH);
        removeButton.setIcon(new ImageIcon(image8));

        ImageIcon icon9 = new ImageIcon("./src/images/clear_cart.png");
        Image image9 = icon9.getImage().getScaledInstance(45, 30, Image.SCALE_SMOOTH);
        clearButton.setIcon(new ImageIcon(image9));

        jPanel3.setVisible(false);
    }

    public void populateRequestTable() {
        for (int i = 0; i < ecosystem.getEventManagerDirectory().getEventManagerList().size(); i++) {
            model2.addRow(new Object[]{
                ecosystem.getEventManagerDirectory().getEventManagerList().get(i).getName(),
                ecosystem.getEventManagerDirectory().getEventManagerList().get(i).getAddress(),
                ecosystem.getEventManagerDirectory().getEventManagerList().get(i).getPhone(),
                ecosystem.getEventManagerDirectory().getEventManagerList().get(i).getAvailable()});
        }
    }

    public void showMenuTable() {
        HashMap<String, String> menu = eventManager.getMenu();
        if (menu.size() > 0) {
            for (Map.Entry<String, String> e : menu.entrySet()) {
                model.addRow(new Object[]{
                    e.getKey(),
                    e.getValue()
                });
            }
        }
    }

    public void showCartTable() {
        if (EventOrderDirectory.getOrderList().size() > 0) {
            for (int i = 0; i < EventOrderDirectory.getOrderList().size(); i++) {
                model1.addRow(new Object[]{
                    EventOrderDirectory.getOrderList().get(i).getItem(),
                    EventOrderDirectory.getOrderList().get(i).getDate(),
                    EventOrderDirectory.getOrderList().get(i).getPrice(),
                    EventOrderDirectory.getOrderList().get(i).getTime(),
                    EventOrderDirectory.getOrderList().get(i).getTotal()
                });
            }
        }
    }

    public int CheckEventAvailibilty(String Date) {
        int a = 0;
        System.out.println(eventManager.getOrderList().size());
        if (eventManager.getOrderList().size() > 0) {
            for (int i = 0; i < eventManager.getOrderList().size(); i++) {
                System.out.println(i);
                System.out.println(eventManager.getOrderList().get(i).getDate());
                if (Date.equals(eventManager.getOrderList().get(i).getDate())) {
                    a = a + 1;
                }

            }
        }
        return a;
    }

    public Customer findCustomer() {
        for (int i = 0; i < ecosystem.getCustomerDirectory().getCustomerList().size(); i++) {
            if (ecosystem.getCustomerDirectory().getCustomerList().get(i).getAccountDetails().getUsername().equals(this.userAccount.getUsername())) {
                return ecosystem.getCustomerDirectory().getCustomerList().get(i);
            }
        }
        return null;
    }

    public Hotel findManageHotel() {
        for (int i = 0; i < ecosystem.getHotel_Directory().getHotelList().size(); i++) {
            if (ecosystem.getHotel_Directory().getHotelList().get(i).getUserAccount().getUsername().equals(this.userAccount.getUsername())) {
                return ecosystem.getHotel_Directory().getHotelList().get(i);
            }
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        LegalserviceTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        itemText = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        AddButton = new javax.swing.JButton();
        Backbutton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        itemText1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        eventname = new javax.swing.JLabel();
        eventpn = new javax.swing.JLabel();
        eventgender = new javax.swing.JLabel();
        eventaddress = new javax.swing.JLabel();
        maidname = new javax.swing.JLabel();
        maidpn = new javax.swing.JLabel();
        maidaddress = new javax.swing.JLabel();
        maidgender = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        removeItemText = new javax.swing.JTextField();
        removeButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        placeButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LegalserviceTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        LegalserviceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        LegalserviceTable.setRowHeight(25);
        LegalserviceTable.setShowGrid(true);
        LegalserviceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LegalserviceTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(LegalserviceTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 354, 149));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(72, 72, 72));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Event Type");
        jLabel3.setAutoscrolls(true);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, 26));

        itemText.setForeground(new java.awt.Color(72, 72, 72));
        itemText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTextActionPerformed(evt);
            }
        });
        add(itemText, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 145, -1));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 145, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Select Date");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 115, 26));

        AddButton.setBackground(new java.awt.Color(102, 102, 255));
        AddButton.setForeground(new java.awt.Color(255, 255, 255));
        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });
        add(AddButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 80, 30));

        Backbutton.setBackground(new java.awt.Color(0, 0, 0));
        Backbutton.setForeground(new java.awt.Color(255, 255, 255));
        Backbutton.setText("Back");
        Backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbuttonActionPerformed(evt);
            }
        });
        add(Backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 6, 141, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(72, 72, 72));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Number of hours");
        jLabel4.setAutoscrolls(true);
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 115, 26));

        itemText1.setForeground(new java.awt.Color(72, 72, 72));
        add(itemText1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 145, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Event Manager Details");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        eventname.setBackground(new java.awt.Color(255, 255, 255));
        eventname.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        eventname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eventname.setText("Name");
        eventname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        eventpn.setBackground(new java.awt.Color(255, 255, 255));
        eventpn.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        eventpn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eventpn.setText("Phone Number");
        eventpn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        eventgender.setBackground(new java.awt.Color(255, 255, 255));
        eventgender.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        eventgender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eventgender.setText("Gender");
        eventgender.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        eventaddress.setBackground(new java.awt.Color(255, 255, 255));
        eventaddress.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        eventaddress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eventaddress.setText("Address");
        eventaddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        maidname.setBackground(new java.awt.Color(255, 255, 255));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(eventgender, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eventaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eventname, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eventpn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maidpn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maidname, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maidaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maidgender, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(maidname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(eventname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maidpn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eventpn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maidaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eventaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maidgender, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eventgender, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 47, Short.MAX_VALUE))))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 110, -1, -1));

        cartTable.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        cartTable.setRowHeight(25);
        cartTable.setShowGrid(true);
        cartTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(cartTable);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, 410, 155));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Book Your Event");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 172, 20));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Your Quick Cart View");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 160, 30));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(72, 72, 72));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel12.setText("Selected Item");
        jLabel12.setAutoscrolls(true);
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, -1, -1));

        removeItemText.setForeground(new java.awt.Color(72, 72, 72));
        add(removeItemText, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, 190, -1));

        removeButton.setBackground(new java.awt.Color(102, 102, 255));
        removeButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        removeButton.setForeground(new java.awt.Color(255, 255, 255));
        removeButton.setText("Remove");
        removeButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });
        add(removeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(708, 349, 100, 30));

        clearButton.setBackground(new java.awt.Color(102, 102, 255));
        clearButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("Clear ");
        clearButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(586, 349, 90, 30));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Wanna do a quick checkout? \nClick the button Below");

        placeButton.setBackground(new java.awt.Color(102, 102, 255));
        placeButton.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        placeButton.setForeground(new java.awt.Color(255, 255, 255));
        placeButton.setText("Place Order");
        placeButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        placeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel13))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(placeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(34, 34, 34)
                .addComponent(placeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void LegalserviceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LegalserviceTableMouseClicked
        // TODO add your handling code here:
        System.out.println(model.getValueAt(LegalserviceTable.getSelectedRow(), 0) + " selected added list ");
        selectedItem = String.valueOf(model.getValueAt(LegalserviceTable.getSelectedRow(), 0));
        selectedPrice = String.valueOf(model.getValueAt(LegalserviceTable.getSelectedRow(), 1));
        itemText.setText(selectedItem);
    }//GEN-LAST:event_LegalserviceTableMouseClicked

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (jDateChooser1.getDate() == null || itemText.getText().isEmpty() || itemText1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Kindly select service and select dates");
            jDateChooser1.setDate(null);
            return;
        } else if (jDateChooser1.getDate().before(new Date())) {
            JOptionPane.showMessageDialog(this, "Kindly select date after today's date");
            jDateChooser1.setDate(null);
            return;
        }

        Date date = jDateChooser1.getDate();
        SimpleDateFormat format1 = new SimpleDateFormat("MM-dd-yyyy");
        String time = itemText1.getText();
        double total = Integer.parseInt(time) * Integer.parseInt(selectedPrice);
        String date1 = format1.format(date);
        System.out.println("Date Wanted by Customer " + date1);
        int a = CheckEventAvailibilty(date1);

        String mes = "We are Sorry, " + eventManager.getName() + " is not Available on this date!";

        if (a > 0) {
            JOptionPane.showMessageDialog(this, mes);
            itemText.setText("");
            jDateChooser1.setDate(null);
            itemText1.setText("");
            return;
        }

        EventOrderDirectory.createOrder(selectedItem, selectedPrice, date1, String.valueOf(total), time, eventManager, userAccount);
        model1.addRow(new Object[]{
            selectedItem,
            date1,
            selectedPrice,
            time,
            String.valueOf(total)
        });
        itemText.setText("");
        jDateChooser1.setDate(null);
        itemText1.setText("");
        JOptionPane.showMessageDialog(this, "Item added to cart");

        jPanel3.setVisible(true);

    }//GEN-LAST:event_AddButtonActionPerformed

    private void BackbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbuttonActionPerformed
        // TODO add your handling code here:
        HotelOrderEventPanel dm = new HotelOrderEventPanel(userProcessContainer, userAccount, ecosystem, screen);
//        userProcessContainer.add("manageNetworkJPanel",dm);
//        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
        screen.setRightComponent(dm);
    }//GEN-LAST:event_BackbuttonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
        if (removeItemText.getText().isEmpty() || removeItem == null) {
            JOptionPane.showMessageDialog(this, "Kindly select item to remove");
            return;
        }
        EventOrderDirectory.deleteOrder(removeItem);
        for (int i = 0; i < cartTable.getRowCount(); i++) {
            if (((String) cartTable.getValueAt(i, 0)).equals(removeItem)) {
                model1.removeRow(i);
            }
        }
        removeItemText.setText("");
        JOptionPane.showMessageDialog(this, "Item removed successfully");
    }//GEN-LAST:event_removeButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        EventOrderDirectory.deleteOrderAll();
        for (int i = model1.getRowCount() - 1; i >= 0; i--) {
            model1.removeRow(i);
        }
        JOptionPane.showMessageDialog(this, "Items removed successfully");
        jPanel3.setVisible(false);
    }//GEN-LAST:event_clearButtonActionPerformed

    private void cartTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartTableMouseClicked
        removeItem = String.valueOf(model1.getValueAt(cartTable.getSelectedRow(), 0));
        removeItemText.setText(removeItem);        // TODO add your handling code here:
    }//GEN-LAST:event_cartTableMouseClicked

    private void placeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeButtonActionPerformed
        // TODO add your handling code here:
        Hotel cust = findManageHotel();
//        if("Credit".equals(cust.getCardType())){
        if ("Credit".equals(0)) {

//         setOrderListLegal(cust);
            for (int i = 0; i < EventOrderDirectory.getOrderList().size(); i++) {
                Total += (Double.parseDouble(EventOrderDirectory.getOrderList().get(i).getTime()) * Double.parseDouble(EventOrderDirectory.getOrderList().get(i).getPrice()));
            }
//        CustomerPaymentPanels mm = new CustomerPaymentPanels(screen, cust, Total, "We have received your order. We will update as soon as you have appointment is scheduled.");
//        screen.setRightComponent(mm);
        } else {
            JOptionPane.showMessageDialog(this, "Sorry Cannot place Direct Order, Add A Credit Card");
        }
        jPanel3.setVisible(false);
    }//GEN-LAST:event_placeButtonActionPerformed

    private void itemTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemTextActionPerformed

    public void setOrderListLegal(Customer cust) {
        for (int i = 0; i < EventOrderDirectory.getOrderList().size(); i++) {
            eventManager.getOrderList().add(EventOrderDirectory.getOrderList().get(i));
            cust.getEventorderList().add(EventOrderDirectory.getOrderList().get(i));

        }
//        legal.getOrders().put(String.valueOf(legal.getOrders().size()), legalOrderDirectory.getOrderList());
        cust.getEventDirectoryList().add(EventOrderDirectory);
        eventManager.getOrderDirectoryList().add(EventOrderDirectory);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton Backbutton;
    private javax.swing.JTable LegalserviceTable;
    private javax.swing.JTable cartTable;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel eventaddress;
    private javax.swing.JLabel eventgender;
    private javax.swing.JLabel eventname;
    private javax.swing.JLabel eventpn;
    private javax.swing.JTextField itemText;
    private javax.swing.JTextField itemText1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel maidaddress;
    private javax.swing.JLabel maidgender;
    private javax.swing.JLabel maidname;
    private javax.swing.JLabel maidpn;
    private javax.swing.JButton placeButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JTextField removeItemText;
    // End of variables declaration//GEN-END:variables
}
