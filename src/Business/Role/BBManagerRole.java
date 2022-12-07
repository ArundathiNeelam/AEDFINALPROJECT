/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.En;
import Business.Organization.Org;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.BloodBankManagerRole.BBManagerWAJPanel;

/**
 *
 * @author bhuvana
 */
public class BBManagerRole extends Role {
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Org organization,
            En enterprise, EcoSystem business) {
        return new BBManagerWAJPanel(userProcessContainer, account, organization, business);
    }
}
