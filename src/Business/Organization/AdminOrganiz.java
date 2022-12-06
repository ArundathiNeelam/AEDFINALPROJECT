/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.EnAdminRole;
import Business.Role.Role;
import java.util.ArrayList;


/**
 *
 * @author arundathi
 */
public class AdminOrganiz extends Org{ //AdminOrganization

    public AdminOrganiz() {
        super(Type.Admin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new EnAdminRole());
        return roles;
    }
     
}
