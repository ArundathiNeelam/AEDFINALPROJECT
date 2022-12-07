/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.En;
import Business.Organization.Org;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.PatientRole.PaWorkAreaJPanel;

/**
 *
 * @author arundathi
 */
public class PatientRole extends Role{
     @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Org organization, En enterprise, EcoSystem business) {
        return new PaWorkAreaJPanel(userProcessContainer, account, organization, business);
    }
}
