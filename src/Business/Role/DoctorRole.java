/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.En;
import Business.Organization.DoctorOrganz;
import Business.Organization.Org;
import Business.UserAccount.UserAccount;
import userinterface.DoctorRole.DoctorWAJPanel;
import javax.swing.JPanel;

/**
 *
 * @author bhuvana
 */
public class DoctorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Org organization, En enterprise, EcoSystem business) {
        return new DoctorWAJPanel(userProcessContainer, userAccount, (DoctorOrganz)organization, enterprise);
    }
    
    
}
