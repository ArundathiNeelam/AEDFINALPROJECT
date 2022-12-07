/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.En;
import Business.Organization.Org;
import Business.UserAccount.UserAccount;
import userinterface.AdministrativeRole.EnAdminWAJPanel;
import javax.swing.JPanel;


/**
 *
 * @author arundathi
 */
public class EnAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Org organization, En enterprise, EcoSystem ecosystem) {
        return new EnAdminWAJPanel(userProcessContainer, enterprise, account,ecosystem);
    }

    
    
}
