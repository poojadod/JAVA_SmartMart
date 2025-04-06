/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Pragna
 */
public class HotelMain extends javax.swing.JPanel {

    /**
     * Creates new form HospitalMain
     */
    JPanel userProcessContainer;
    private static EcoSystem ecosystem;
    
    public HotelMain(JPanel userProcessContainer1, EcoSystem system) {
        userProcessContainer = userProcessContainer1;
        ecosystem = system;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ManageGroceryButton = new javax.swing.JButton();
        manageGroceryManagersButton = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        ManageGroceryButton.setBackground(new java.awt.Color(102, 102, 255));
        ManageGroceryButton.setForeground(new java.awt.Color(255, 255, 255));
        ManageGroceryButton.setText("View Hotel");
        ManageGroceryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageGroceryButtonActionPerformed(evt);
            }
        });

        manageGroceryManagersButton.setBackground(new java.awt.Color(102, 102, 255));
        manageGroceryManagersButton.setForeground(new java.awt.Color(255, 255, 255));
        manageGroceryManagersButton.setText("Hotel Managers");
        manageGroceryManagersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageGroceryManagersButtonActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(0, 0, 0));
        btnBack.setForeground(new java.awt.Color(204, 204, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageGroceryManagersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ManageGroceryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(1090, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addComponent(manageGroceryManagersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(ManageGroceryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(502, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ManageGroceryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageGroceryButtonActionPerformed
        ManageHotel rest= new ManageHotel(userProcessContainer, ecosystem);
        userProcessContainer.add("manageNetworkJPanel",rest);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ManageGroceryButtonActionPerformed

    private void manageGroceryManagersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageGroceryManagersButtonActionPerformed
        // TODO add your handling code here:
        ManagerHotelManagers restM= new ManagerHotelManagers(userProcessContainer, ecosystem);
        userProcessContainer.add("manageNetworkJPanel",restM);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageGroceryManagersButtonActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        SystemAdminWorkAreaJPanel dm= new SystemAdminWorkAreaJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("manageNetworkJPanel",dm);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageGroceryButton;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton manageGroceryManagersButton;
    // End of variables declaration//GEN-END:variables
}
