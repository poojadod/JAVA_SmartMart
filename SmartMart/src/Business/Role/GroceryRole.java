/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import userinterface.GroceryAdminRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 *  @author poojadoddannavar
 */
public class GroceryRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new AdminWorkAreaJPanel(userProcessContainer, account, business);
    }

    
    
}
