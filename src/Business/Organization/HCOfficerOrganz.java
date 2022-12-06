/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.GovtHealthOfficerRole;
import Business.Role.LARole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author arundathi
 */
public class HCOfficerOrganz extends Org { //HealthCareOfficerOrganization

    public HCOfficerOrganz() {
        super(Org.Type.HealthcareOfficer.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new GovtHealthOfficerRole());
        return roles;
    }

}
