/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.HotelAdminRole;

import userinterface.CustomerRole.*;
import Business.Customer.Customer;
import Business.Customer.SendMail;
import Business.Hotel.Hotel;
import javax.swing.JOptionPane;
import javax.swing.JSplitPane;

/**
 *
 * @author  Samarth
 */
public class HotelPaymentPanels extends javax.swing.JPanel {

    /**
     * Creates new form HotelPaymentPanels
     */
    Double Total;
    JSplitPane screen;
    Hotel cust;
    String message;
    public HotelPaymentPanels(JSplitPane screen, Hotel cust, Double Total, String message) {
        this.Total = Total;
        this.screen = screen;
        this.cust = cust;
        this.message = message;
        initComponents();
        jLabel2.setText(String.valueOf(Total));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FeedbackBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Total Amount : $");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 280, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 74, 220, 30));

        FeedbackBtn.setBackground(new java.awt.Color(255, 255, 204));
        FeedbackBtn.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        FeedbackBtn.setText("Pay");
        FeedbackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FeedbackBtnActionPerformed(evt);
            }
        });
        add(FeedbackBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 120, 50));
    }// </editor-fold>//GEN-END:initComponents

    private void FeedbackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FeedbackBtnActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Payment Done, We have Sent you your Reciept");
        CustomerStaticRight adminPanel = new CustomerStaticRight();
        screen.setRightComponent(adminPanel);
//        SendMail sm = new SendMail(cust.getEmail(),"Order Confirmation","Your Order has been Confirmed with Us. \n Your oder of" + Total + " is in our bank accounts");
    }//GEN-LAST:event_FeedbackBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FeedbackBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
