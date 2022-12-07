/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.En;
import Business.Organization.Org;
import Business.UserAccount.UserAccount;
import userinterface.LabAssistantRole.LabAssistantWAJPanel;
import javax.swing.JPanel;

/**
 *
 * @author bhuvana
 */
public class LARole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Org organization, En enterprise, EcoSystem business) {
        return new LabAssistantWAJPanel(userProcessContainer, account, organization, business);
    }
    
}
