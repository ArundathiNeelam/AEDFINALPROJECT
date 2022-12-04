/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ARole;
import Business.Role.Role;
import java.util.ArrayList;


/**
 *
 * @author arundathi
 */
public class AccountantOrgnz extends Org { //AccountantOrganization

    public AccountantOrgnz() {
        super(Org.Type.Accountant.getValue());

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ARole());
        return roles;
    }

}
