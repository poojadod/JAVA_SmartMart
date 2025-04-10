/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import userinterface.SystemAdminWorkArea.*;
import Business.Customer.Customer;
import userinterface.CustomerRole.CustomerStaticRight;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pragna 
 */
public class CustomerUpdateInformation extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    private UserAccount userAccount;
    private static EcoSystem ecosystem;
    private ArrayList<Customer> customerList = new ArrayList<Customer>();
    DefaultTableModel model;
    Customer cust;
    JSplitPane screen;

    /**
     * Creates new form ManageCustomers
     */
    public CustomerUpdateInformation(JPanel userProcessContainer1, UserAccount account,EcoSystem system, JSplitPane screen) {
        initComponents();
        userProcessContainer = userProcessContainer1;
        ecosystem = system;
        this.screen = screen;
        this.userAccount = account;
        cust = findCustomer();
        for (int i = 0; i < system.getCustomerDirectory().getCustomerList().size(); i++) {
            customerList.add(system.getCustomerDirectory().getCustomerList().get(i));
        }
        updateNameText.setText(cust.getName());
        updateUsernameText.setText(cust.getAccountDetails().getUsername());
        updatePhoneText.setText(cust.getPhone());
        updateAddressText.setText(cust.getAddress());
        updateEmailTxt.setText(cust.getEmail());
        
        ImageIcon icon6 =  new ImageIcon("./src/images/birdie.png");
        Image image6 = icon6.getImage().getScaledInstance(524, 400, Image.SCALE_SMOOTH);
        jLabel1.setIcon(new ImageIcon(image6));
        
        ImageIcon icon7 =  new ImageIcon("./src/images/home-803-450320.png");
        Image image7 = icon7.getImage().getScaledInstance(70, 55, Image.SCALE_SMOOTH);
        btnBack.setIcon(new ImageIcon(image7));
        
        

        
        
        
        
        
    }
    public Customer findCustomer() {
        for(int i = 0; i < ecosystem.getCustomerDirectory().getCustomerList().size(); i ++) {
            if(ecosystem.getCustomerDirectory().getCustomerList().get(i).getAccountDetails().getUsername().equals(this.userAccount.getUsername())) {
                return ecosystem.getCustomerDirectory().getCustomerList().get(i);
            }
        }
        return null;
    }       
    
    public void reset() {

        updateNameText.setText("");
        updateUsernameText.setText("");
        
        updatePhoneText.setText("");
        updateAddressText.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        updateNameText = new javax.swing.JTextField();
        updateUsernameText = new javax.swing.JTextField();
        restPwdLabel2 = new javax.swing.JLabel();
        updatePhoneText = new javax.swing.JTextField();
        phoneLabel1 = new javax.swing.JLabel();
        addressLabel1 = new javax.swing.JLabel();
        updateAddressText = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        selectManagerLabel2 = new javax.swing.JLabel();
        addressLabel2 = new javax.swing.JLabel();
        updateEmailTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));
        setForeground(new java.awt.Color(72, 72, 72));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Update Details");

        updateNameText.setForeground(new java.awt.Color(72, 72, 72));
        updateNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateNameTextActionPerformed(evt);
            }
        });

        updateUsernameText.setForeground(new java.awt.Color(72, 72, 72));
        updateUsernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUsernameTextActionPerformed(evt);
            }
        });

        restPwdLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        restPwdLabel2.setForeground(new java.awt.Color(72, 72, 72));
        restPwdLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        restPwdLabel2.setText("Username");

        updatePhoneText.setForeground(new java.awt.Color(72, 72, 72));

        phoneLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        phoneLabel1.setForeground(new java.awt.Color(72, 72, 72));
        phoneLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        phoneLabel1.setText("Phone");

        addressLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addressLabel1.setForeground(new java.awt.Color(72, 72, 72));
        addressLabel1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        addressLabel1.setText("Address");

        updateAddressText.setForeground(new java.awt.Color(72, 72, 72));

        updateButton.setBackground(new java.awt.Color(204, 204, 0));
        updateButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateButton.setForeground(new java.awt.Color(255, 255, 255));
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 204));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        selectManagerLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        selectManagerLabel2.setForeground(new java.awt.Color(72, 72, 72));
        selectManagerLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        selectManagerLabel2.setText("Name");

        addressLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addressLabel2.setForeground(new java.awt.Color(72, 72, 72));
        addressLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        addressLabel2.setText("Email");

        updateEmailTxt.setForeground(new java.awt.Color(72, 72, 72));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 67, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(phoneLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(selectManagerLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(restPwdLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(updateUsernameText)
                            .addComponent(updateNameText)
                            .addComponent(updatePhoneText)
                            .addComponent(updateAddressText)
                            .addComponent(updateEmailTxt)
                            .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(332, 332, 332))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(updateNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(selectManagerLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addComponent(updateUsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(restPwdLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updatePhoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneLabel1))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressLabel1))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updateEmailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressLabel2))
                        .addGap(38, 38, 38)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    public Boolean validateFields(String username, String address, String phone, String name, String email) {
        if(username.isEmpty() || phone.isEmpty() || name.isEmpty() || address.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Fields cannot be empty","Error message", JOptionPane.ERROR_MESSAGE);
            return false;
        } 
         else if(phone.length() != 10) {
            JOptionPane.showMessageDialog(null, "PhoneNumber must be of 10 digits","Error message", JOptionPane.ERROR_MESSAGE);
            return false;
        }else if(!phone.matches("^[0-9]+$")) {
            JOptionPane.showMessageDialog(null, "Phone Number must have digits only","Error message", JOptionPane.ERROR_MESSAGE);
            return false;
        }else if(!email.matches("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?")){
             JOptionPane.showMessageDialog(null, "Email is invalid","Error message", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    private void updateNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateNameTextActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        if (!validateFields(updateUsernameText.getText(), updateAddressText.getText(), updatePhoneText.getText(), updateNameText.getText(), updateEmailTxt.getText())) {
            return;
        }
    String selectedItem = (String) cust.getName();
            for (int i = 0; i < customerList.size(); i++) {
               
               
                if (customerList.get(i).getName().equalsIgnoreCase(selectedItem)) {
                    customerList.get(i).setAddress(updateAddressText.getText());
                    customerList.get(i).setPhone(updatePhoneText.getText());
                    
                    customerList.get(i).setName(updateNameText.getText());
                    customerList.get(i).getAccountDetails().setUsername(updateUsernameText.getText());
                    customerList.get(i).setEmail(updateEmailTxt.getText());
                    JOptionPane.showMessageDialog(this, "Customer updated successfully");
                    return;
                }
            }

    }//GEN-LAST:event_updateButtonActionPerformed

    private void updateUsernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUsernameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateUsernameTextActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        CustomerStaticRight adminPanel = new CustomerStaticRight();
        screen.setRightComponent(adminPanel);
       
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel1;
    private javax.swing.JLabel addressLabel2;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel phoneLabel1;
    private javax.swing.JLabel restPwdLabel2;
    private javax.swing.JLabel selectManagerLabel2;
    private javax.swing.JTextField updateAddressText;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField updateEmailTxt;
    private javax.swing.JTextField updateNameText;
    private javax.swing.JTextField updatePhoneText;
    private javax.swing.JTextField updateUsernameText;
    // End of variables declaration//GEN-END:variables
}
