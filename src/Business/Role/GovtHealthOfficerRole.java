/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.En;
import Business.Organization.HCOfficerOrganz;
import Business.Organization.Org;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.HealthcareOfficerRole.OfficerWAJPanel;

/**
 *
 * @author bhuvana
 */
public class GovtHealthOfficerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, Org organization, En enterprise, EcoSystem business) {
        return new OfficerWAJPanel(userProcessContainer, userAccount, (HCOfficerOrganz)organization, enterprise);
    }
    
}
