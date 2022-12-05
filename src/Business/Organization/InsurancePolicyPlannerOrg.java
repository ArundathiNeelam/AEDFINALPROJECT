/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.IPPlannerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author arundathi
 */
public class InsurancePolicyPlannerOrg extends Org { //InsurancePolicyPlannerOrganization

    public InsurancePolicyPlannerOrg() {
        super(Org.Type.InsurancePolicyPlanner.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new IPPlannerRole());
        return roles;
    }
    
}
