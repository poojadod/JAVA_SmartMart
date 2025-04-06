/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Pragna
 */
public class NetworkPanel extends javax.swing.JPanel {

    /**
     * Creates new form NetworkPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;

    public NetworkPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
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

        jPanel6 = new javax.swing.JPanel();
        ManageCustomerButton3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        ManageCustomerButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 250, 211));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));

        ManageCustomerButton3.setBackground(new java.awt.Color(204, 102, 0));
        ManageCustomerButton3.setForeground(new java.awt.Color(255, 255, 255));
        ManageCustomerButton3.setText("Create Network");
        ManageCustomerButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageCustomerButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ManageCustomerButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(ManageCustomerButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, 100));

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));

        ManageCustomerButton4.setBackground(new java.awt.Color(204, 102, 0));
        ManageCustomerButton4.setForeground(new java.awt.Color(255, 255, 255));
        ManageCustomerButton4.setText("Select Enterprise");
        ManageCustomerButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageCustomerButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ManageCustomerButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(ManageCustomerButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, -1, 100));
    }// </editor-fold>//GEN-END:initComponents

    private void ManageCustomerButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageCustomerButton3ActionPerformed
        ManageNetwork dm = new ManageNetwork(userProcessContainer, ecosystem);
        userProcessContainer.add("manageNetworkJPanel", dm);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ManageCustomerButton3ActionPerformed

    private void ManageCustomerButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageCustomerButton4ActionPerformed
        // TODO add your handling code here:
      if(ecosystem.getcreateNetwork().getNetwork().size() > 0 ) {
        SystemAdminWorkAreaJPanel dm= new SystemAdminWorkAreaJPanel(userProcessContainer, ecosystem);
        userProcessContainer.add("manageNetworkJPanel",dm);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(this, "Kindly Add A Network");
        }

    }//GEN-LAST:event_ManageCustomerButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageCustomerButton3;
    private javax.swing.JButton ManageCustomerButton4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
