/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Insurance.InsurancePD;
import Business.InsuranceCustomer.InsuranceCD;
import Business.Organization.Org;
import Business.Role.Role;
import java.util.ArrayList;
//import java.util.List;
import java.util.List;

/**
 *
 * @author bhuvana
 */
public class InsurancecmpnyEN extends En { //InsuranceCompanyEnterprise extends Enterprise//

    private InsuranceCD insCustDir;

    private InsurancePD insPlcyDir;

    public InsurancecmpnyEN(String name) {
        super(name, EntType.InsuranceCompany);
        insCustDir = new InsuranceCD();
        insPlcyDir = new InsurancePD();

    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public List<Org.Type> getAllOrganizationTypes() {
        List<Org.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Org.Type.InsuranceAgent);
        orgTypes.add(Org.Type.InsurancePolicyPlanner);
        orgTypes.add(Org.Type.InsuranceFinanceOrganization);

        return orgTypes;
    }

    public InsuranceCD getInsCustDir() {
        return insCustDir;
    }

    public void setInsCustDir(InsuranceCD insCustDir) {
        this.insCustDir = insCustDir;
    }

    public InsurancePD getInsPlcyDir() {
        return insPlcyDir;
    }

    public void setInsPlcyDir(InsurancePD insPlcyDir) {
        this.insPlcyDir = insPlcyDir;
    }

}
