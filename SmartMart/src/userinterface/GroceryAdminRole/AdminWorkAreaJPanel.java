

package userinterface.GroceryAdminRole;


import Business.EcoSystem;
import Business.Grocery.Grocery;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

/**
 *
 * @author poojadoddannavar 
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount ua;
    String managerName;
    Grocery grocery;
    
    /** Creates new form AdminWorkAreaJPanel */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount ua, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ua = ua;
        managerName = ua.getEmployee().getName();
        ecosystem = system;
        grocery = findManageGrocery();
        valueLabel.setText(grocery.getManager());
        jLabel1.setText("Grocery Manager: "+grocery.getName());
      
        //valueLabel.setText();
    }
   public Grocery findManageGrocery() {
        for(int i = 0; i < ecosystem.getGroceryDirectory().getGroceryList().size(); i ++) {
            if(ecosystem.getGroceryDirectory().getGroceryList().get(i).getUserAccount().getUsername().equals(this.ua.getUsername())) {
                return ecosystem.getGroceryDirectory().getGroceryList().get(i);
            }
        }
        return null;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        updatestorepanel = new javax.swing.JPanel();
        nameText = new javax.swing.JTextField();
        phoneText = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        locationLabel = new javax.swing.JLabel();
        locationText = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        ManageGroceryInventoryButton = new javax.swing.JButton();
        ManageOrdersButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        enterpriseLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        enterpriseLabel.setText("Welcome:");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 120, 30));

        valueLabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 96, 330, 20));

        updatestorepanel.setBackground(new java.awt.Color(204, 204, 255));

        nameText.setForeground(new java.awt.Color(72, 72, 72));

        phoneText.setForeground(new java.awt.Color(72, 72, 72));

        phoneLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        phoneLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        phoneLabel.setText("Phone");

        nameLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nameLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        nameLabel.setText("Grocery Store Name");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Update Grocery Store Information");

        locationLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        locationLabel.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        locationLabel.setText("Location");

        locationText.setForeground(new java.awt.Color(72, 72, 72));
        locationText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationTextActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(102, 102, 255));
        updateButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateButton.setForeground(new java.awt.Color(204, 255, 204));
        updateButton.setText("Update");
        updateButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        ManageGroceryInventoryButton.setBackground(new java.awt.Color(102, 102, 255));
        ManageGroceryInventoryButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ManageGroceryInventoryButton.setForeground(new java.awt.Color(204, 255, 204));
        ManageGroceryInventoryButton.setText("Manage Grocery List");
        ManageGroceryInventoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageGroceryInventoryButtonActionPerformed(evt);
            }
        });

        ManageOrdersButton.setBackground(new java.awt.Color(102, 102, 255));
        ManageOrdersButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ManageOrdersButton.setForeground(new java.awt.Color(255, 255, 255));
        ManageOrdersButton.setText("Manage Orders");
        ManageOrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManageOrdersButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout updatestorepanelLayout = new javax.swing.GroupLayout(updatestorepanel);
        updatestorepanel.setLayout(updatestorepanelLayout);
        updatestorepanelLayout.setHorizontalGroup(
            updatestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatestorepanelLayout.createSequentialGroup()
                .addGroup(updatestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(updatestorepanelLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(updatestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(phoneLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(locationLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(updatestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nameText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                            .addComponent(phoneText, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(locationText, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(updatestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(updatestorepanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(ManageGroceryInventoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ManageOrdersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, updatestorepanelLayout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, updatestorepanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
        );
        updatestorepanelLayout.setVerticalGroup(
            updatestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatestorepanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(updatestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(updatestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLabel)
                    .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(updatestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(locationLabel)
                    .addComponent(locationText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(updatestorepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ManageGroceryInventoryButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ManageOrdersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(updatestorepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 540, 340));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 7, 470, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void locationTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_locationTextActionPerformed

    private void ManageOrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageOrdersButtonActionPerformed
        ManageOrdersPanel mm = new ManageOrdersPanel(userProcessContainer, ecosystem, grocery, ua);
        userProcessContainer.add("manageNetworkJPanel",mm);
//        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
        setVisible(false);
        mm.setVisible(true);

    }//GEN-LAST:event_ManageOrdersButtonActionPerformed

    private void ManageGroceryInventoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManageGroceryInventoryButtonActionPerformed
        ManageGroceryInventoryPanel mm = new ManageGroceryInventoryPanel(userProcessContainer, ecosystem, grocery, ua);
        userProcessContainer.add("manageNetworkJPanel",mm);
//        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
//        layout.next(userProcessContainer);
        setVisible(false);
        mm.setVisible(true);
    }//GEN-LAST:event_ManageGroceryInventoryButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:

        if(phoneText.getText().isEmpty() || nameText.getText().isEmpty() || locationText.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Fields cannot be empty");
            return;
        }else if(phoneText.getText().length() != 10) {
            JOptionPane.showMessageDialog(null, "PhoneNumber must be of 10 digits");
            return;
        }else if(!phoneText.getText().matches("^[0-9]+$")) {
            JOptionPane.showMessageDialog(null, "Phone Number must have digits only");
            return;
        } else {
            grocery.setName(nameText.getText());
            grocery.setLocation(locationText.getText());
            grocery.setPhone(phoneText.getText());
            JOptionPane.showMessageDialog(null, "Grocery Name updated successfully");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_updateButtonActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ManageGroceryInventoryButton;
    private javax.swing.JButton ManageOrdersButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel locationLabel;
    private javax.swing.JTextField locationText;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JTextField phoneText;
    private javax.swing.JButton updateButton;
    private javax.swing.JPanel updatestorepanel;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
    
}
