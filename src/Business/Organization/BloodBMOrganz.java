/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.BBManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author arundathi
 */
public class BloodBMOrganz extends Org{ //BloodBankManagerOrganization
    
    public BloodBMOrganz() {
        super(Org.Type.BloodBank.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BBManagerRole());
        return roles;
    }
     
   
    
    
}

