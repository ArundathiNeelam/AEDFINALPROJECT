/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.IARole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author arundathi
 */
public class IAOrganization extends Org { //InsuranceAgentOrganization

    public IAOrganization() {
        super(Org.Type.InsuranceAgent.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new IARole());
        return roles;
    }

}
