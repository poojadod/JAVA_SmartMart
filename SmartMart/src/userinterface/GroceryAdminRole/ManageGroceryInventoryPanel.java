/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.GroceryAdminRole;

import Business.EcoSystem;
import Business.Grocery.Grocery;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author poojadoddannavar
 */
public class ManageGroceryInventoryPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem ecosystem;
    Grocery grocery;
    DefaultTableModel model;
    UserAccount ua;

    /**
     * Creates new form ManageRestaurantMenu
     */
    public ManageGroceryInventoryPanel(JPanel userProcessContainer, EcoSystem system, Grocery groc, UserAccount ua) {
        initComponents();
        ecosystem = system;
        this.userProcessContainer = userProcessContainer;
        grocery = groc;
        this.ua = ua;
        model = new DefaultTableModel();
        menuTable.setModel(model);
        model.addColumn("Item Name");
        model.addColumn("Price");
        System.out.println(grocery.getMenu());
        
        showDeleteList();
        viewMenuList();
    }

    public void viewMenuList() {
        HashMap<String, String> menu = grocery.getMenu();
        if (menu.size() > 0) {
            for (Map.Entry<String, String> e : menu.entrySet()) {
                model.addRow(new Object[]{
                    e.getKey(),
                    e.getValue()
                });
            }
        }
    }

    public void showDeleteList() {
        HashMap<String, String> menu = grocery.getMenu();
        if (grocery.getMenu().size() > 0) {
            for (Map.Entry<String, String> e : menu.entrySet()) {
                itemsCombo.addItem(e.getKey());
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        AddItemPanel = new javax.swing.JPanel();
        AddItemLabel = new javax.swing.JLabel();
        itemText = new javax.swing.JTextField();
        priceText = new javax.swing.JTextField();
        AddItemNameLabel = new javax.swing.JLabel();
        AddItemPriceLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        UpdateItemPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        itemsCombo = new javax.swing.JComboBox<>();
        ItemPanel = new javax.swing.JLabel();
        updateItemText = new javax.swing.JTextField();
        PriceLabel = new javax.swing.JLabel();
        updatePriceText = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        menuTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        menuTable.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        menuTable.setModel(new javax.swing.table.DefaultTableModel(
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
        menuTable.setGridColor(new java.awt.Color(0, 0, 0));
        menuTable.setRowHeight(25);
        jScrollPane1.setViewportView(menuTable);

        btnBack.setBackground(new java.awt.Color(102, 102, 255));
        btnBack.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        title.setBackground(new java.awt.Color(255, 51, 0));
        title.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(0, 83, 170));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        AddItemPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        AddItemLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        AddItemLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AddItemLabel.setText("Add Item");

        itemText.setForeground(new java.awt.Color(72, 72, 72));
        itemText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTextActionPerformed(evt);
            }
        });

        priceText.setForeground(new java.awt.Color(72, 72, 72));

        AddItemNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AddItemNameLabel.setForeground(new java.awt.Color(72, 72, 72));
        AddItemNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        AddItemNameLabel.setText("Item");

        AddItemPriceLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AddItemPriceLabel.setForeground(new java.awt.Color(72, 72, 72));
        AddItemPriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        AddItemPriceLabel.setText("Price");

        addButton.setBackground(new java.awt.Color(204, 153, 0));
        addButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Add");
        addButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddItemPanelLayout = new javax.swing.GroupLayout(AddItemPanel);
        AddItemPanel.setLayout(AddItemPanelLayout);
        AddItemPanelLayout.setHorizontalGroup(
            AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddItemPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AddItemLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(AddItemPanelLayout.createSequentialGroup()
                            .addComponent(AddItemNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(itemText))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, AddItemPanelLayout.createSequentialGroup()
                            .addComponent(AddItemPriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddItemPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
        );
        AddItemPanelLayout.setVerticalGroup(
            AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddItemPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddItemLabel)
                .addGap(28, 28, 28)
                .addGroup(AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddItemNameLabel)
                    .addComponent(itemText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddItemPriceLabel)
                    .addComponent(priceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        UpdateItemPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Update / Delete an Item");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(72, 72, 72));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel5.setText("Select Item");

        itemsCombo.setForeground(new java.awt.Color(72, 72, 72));
        itemsCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--None" }));
        itemsCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemsComboActionPerformed(evt);
            }
        });

        ItemPanel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ItemPanel.setForeground(new java.awt.Color(72, 72, 72));
        ItemPanel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        ItemPanel.setText("Item");

        updateItemText.setForeground(new java.awt.Color(72, 72, 72));
        updateItemText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateItemTextActionPerformed(evt);
            }
        });

        PriceLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        PriceLabel.setForeground(new java.awt.Color(72, 72, 72));
        PriceLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        PriceLabel.setText("Price");

        updatePriceText.setForeground(new java.awt.Color(72, 72, 72));

        updateButton.setBackground(new java.awt.Color(204, 153, 0));
        updateButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(204, 153, 0));
        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Delete");
        deleteButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UpdateItemPanelLayout = new javax.swing.GroupLayout(UpdateItemPanel);
        UpdateItemPanel.setLayout(UpdateItemPanelLayout);
        UpdateItemPanelLayout.setHorizontalGroup(
            UpdateItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateItemPanelLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(UpdateItemPanelLayout.createSequentialGroup()
                .addGroup(UpdateItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UpdateItemPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(UpdateItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UpdateItemPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(itemsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(UpdateItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, UpdateItemPanelLayout.createSequentialGroup()
                                    .addGap(61, 61, 61)
                                    .addComponent(PriceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(updatePriceText))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, UpdateItemPanelLayout.createSequentialGroup()
                                    .addGap(49, 49, 49)
                                    .addComponent(ItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(updateItemText, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(UpdateItemPanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        UpdateItemPanelLayout.setVerticalGroup(
            UpdateItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateItemPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(UpdateItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(itemsCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(UpdateItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateItemText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ItemPanel))
                .addGap(31, 31, 31)
                .addGroup(UpdateItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updatePriceText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PriceLabel))
                .addGap(28, 28, 28)
                .addGroup(UpdateItemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("View Orders");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 1363, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UpdateItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(297, 297, 297)
                                .addComponent(jLabel3)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(UpdateItemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(363, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void itemTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemTextActionPerformed

    private void updateItemTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateItemTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateItemTextActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        Boolean isValid = validateFields(itemText.getText(), priceText.getText());
        if (!isValid) {
            return;
        }
        HashMap<String, String> menu = grocery.getMenu();
        menu.put(itemText.getText(), priceText.getText());
        grocery.setMenu(menu);
        JOptionPane.showMessageDialog(this, "Item added successfully");
        itemsCombo.addItem(itemText.getText());
        System.out.println(itemText.getText() + " test " + priceText.getText());
        model.addRow(new Object[]{
            itemText.getText(),
            priceText.getText()
        });
        itemText.setText("");
        priceText.setText("");

    }//GEN-LAST:event_addButtonActionPerformed
    public void reset() {
        itemsCombo.setSelectedIndex(0);
        updateItemText.setText("");
        updatePriceText.setText("");

    }
    private void itemsComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemsComboActionPerformed
        // TODO add your handling code here:
        HashMap<String, String> menu = grocery.getMenu();
        if (itemsCombo.getSelectedItem() != null) {
            String selectedItem = (String) itemsCombo.getSelectedItem();
            for (Map.Entry<String, String> e : menu.entrySet()) {
                if (e.getKey().equalsIgnoreCase(selectedItem)) {
                    updateItemText.setText(e.getKey());
                    updatePriceText.setText(String.valueOf(e.getValue()));
                }
            }
        }

    }//GEN-LAST:event_itemsComboActionPerformed
    public Boolean validateFields(String item, String price) {
        String pattern = "^(\\d*\\.)?\\d+$";
        java.util.regex.Pattern r = java.util.regex.Pattern.compile(pattern);
        Matcher m = r.matcher(price);
        if(item.isEmpty() || price.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Fields cannot be empty");
            return false;
        } else if(!m.find()) {
            JOptionPane.showMessageDialog(null, "Please enter Valid price");
            return false;
        }
        return true;
    }
    
    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        if(itemsCombo.getSelectedItem() == null || itemsCombo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null,"Select a value from dropdown");
            return;
        } else if (!validateFields(updateItemText.getText(), updatePriceText.getText())) {
            return;
        }
        HashMap<String, String> menu = grocery.getMenu();
        if (itemsCombo.getSelectedItem() != null) {
            String selectedItem = (String) itemsCombo.getSelectedItem();
            for (Map.Entry<String, String> e : menu.entrySet()) {
                if (e.getKey().equalsIgnoreCase(selectedItem)) {
                    menu.remove(e);
                    menu.put(updateItemText.getText(), updatePriceText.getText());
                    JOptionPane.showMessageDialog(this, "Menu Item updated successfully");
                }
            }
        }
        grocery.setMenu(menu);
        String selectedItem = (String) itemsCombo.getSelectedItem();
        itemsCombo.getSelectedIndex();
        for (int i = 0; i < menuTable.getRowCount(); i++) {
            if (((String) menuTable.getValueAt(i, 0)).equals(selectedItem)) {
                itemsCombo.addItem(updateItemText.getText());
                model.addRow(new Object[]{
                    updateItemText.getText(),
                    updatePriceText.getText()
                });
                model.removeRow(i);
                itemsCombo.removeItemAt(i + 1);

            }//end of if block
        }
        reset();
        // TODO add your handling code here:
  
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        if(itemsCombo.getSelectedItem() == null || itemsCombo.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null,"Select a value from dropdown");
            return;
        }
        HashMap<String, String> menu = grocery.getMenu();
        String selectedItem = (String) itemsCombo.getSelectedItem();
        itemsCombo.getSelectedIndex();
        if (itemsCombo.getSelectedItem() != null) {
            for (Map.Entry<String, String> e : menu.entrySet()) {
                if (e.getKey().equalsIgnoreCase(selectedItem)) {
                    System.out.println("inside delete..");
                    menu.remove(e.getKey());
                    JOptionPane.showMessageDialog(this, "Menu Item deleted successfully");
                }
            }
        }
        for (int i = 0; i < menuTable.getRowCount(); i++) {
            if (((String) menuTable.getValueAt(i, 0)).equals(selectedItem)) {
                model.removeRow(i);
                itemsCombo.removeItemAt(i + 1);
                updateItemText.setText("");
                updatePriceText.setText("");
            }//end of if block
        }
        
        grocery.setMenu(menu);
        System.out.println(menu.size() + "jsdje " + grocery.getMenu().size());
        reset();
        // TODO add your handling code here:

    }//GEN-LAST:event_deleteButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
       AdminWorkAreaJPanel dm= new AdminWorkAreaJPanel(userProcessContainer, ua, ecosystem);
        userProcessContainer.add("manageNetworkJPanel",dm);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AddItemLabel;
    private javax.swing.JLabel AddItemNameLabel;
    private javax.swing.JPanel AddItemPanel;
    private javax.swing.JLabel AddItemPriceLabel;
    private javax.swing.JLabel ItemPanel;
    private javax.swing.JLabel PriceLabel;
    private javax.swing.JPanel UpdateItemPanel;
    private javax.swing.JButton addButton;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField itemText;
    private javax.swing.JComboBox<String> itemsCombo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable menuTable;
    private javax.swing.JTextField priceText;
    private javax.swing.JLabel title;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField updateItemText;
    private javax.swing.JTextField updatePriceText;
    // End of variables declaration//GEN-END:variables
}
