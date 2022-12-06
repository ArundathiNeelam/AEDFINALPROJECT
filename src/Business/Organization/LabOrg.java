/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.LARole;
import Business.Role.Role;
import java.util.ArrayList;


/**
 *
 * @author arundathi
 */
public class LabOrg extends Org{ //LabOrganization

    public LabOrg() {
        super(Org.Type.Lab.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new LARole());
        return roles;
    }
     
   
    
    
}
