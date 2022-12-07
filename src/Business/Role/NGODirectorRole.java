/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.En;
import Business.Organization.NGOAdminOrg;
import Business.Organization.NGODirectorOrg;
import Business.Organization.Org;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.NGOAdministratorRole.NGOAdminWorkAreaPanel;
import userinterface.NGODirectorRole.DirectorWAJPanel;


/**
 *
 * @author arundathi
 */
public class NGODirectorRole extends Role{
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Org organization, En enterprise, EcoSystem business) {
        return new DirectorWAJPanel(userProcessContainer, account, (NGODirectorOrg)organization, enterprise);
    }
}
