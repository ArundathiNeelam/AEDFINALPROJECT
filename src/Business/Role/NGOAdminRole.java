/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.En;
import Business.Organization.NGOAdminOrg;
import Business.Organization.Org;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.NGOAdministratorRole.NGOAdminWorkAreaPanel;
import userinterface.LabAssistantRole.LabAssistantWAJPanel;

/**
 *
 * @author arundathi
 */
public class NGOAdminRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Org organization, En enterprise, EcoSystem business) {
        return new NGOAdminWorkAreaPanel(userProcessContainer, account, (NGOAdminOrg)organization, enterprise);
    }
}
