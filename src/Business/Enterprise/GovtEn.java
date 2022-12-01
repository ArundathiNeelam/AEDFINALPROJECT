/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Org;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arundathi
 */
public class GovtEn extends En { //GovernmentEnterprise extends Enterprise//

    public GovtEn(String name) {
        super(name, EntType.Government);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public List<Org.Type> getAllOrganizationTypes() {
        List<Org.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Org.Type.HealthcareOfficer);
        orgTypes.add(Org.Type.Secretary);
        orgTypes.add(Org.Type.Treasurer);

        return orgTypes;
    }

}
