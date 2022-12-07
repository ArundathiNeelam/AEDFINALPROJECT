/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.En;
import Business.Organization.Org;
import Business.Organization.TreasurerOrg;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.GovernmentTreasurerRole.TreasurerWorkAreaJPanel;

/**
 *
 * @author bhuvana
 */
public class GovernmentTreasurer extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Org organization, En enterprise, EcoSystem business) {
        return new TreasurerWorkAreaJPanel(userProcessContainer, userAccount, (TreasurerOrg)organization, enterprise);
    }
    
}
