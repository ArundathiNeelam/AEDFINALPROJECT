/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Org.Type;
import static Business.Organization.Org.Type.InsuranceFinanceOrganization;
import java.util.ArrayList;

/**
 *
 * @author bhuvana
 */
public class OD {

    private ArrayList<Org> orgList;

    public OD() {
        orgList = new ArrayList();
    }

    public ArrayList<Org> getOrganizations() {
        return orgList;
    }

    public Org createOrganization(Type type) {
        Org organization = null;

        if (type.getValue().equals(Type.Doctor.getValue())) {
            organization = new DoctorOrganz();
            orgList.add(organization);
        } else if (type.getValue().equals(Type.Lab.getValue())) {
            organization = new LabOrg();
            orgList.add(organization);
        }

        else if (type.getValue().equals(Type.Patient.getValue())) {
            organization = new PatientOrg();
            orgList.add(organization);

        }

        else if (type.getValue().equals(Type.Accountant.getValue())) {
            organization = new AccountantOrgnz();
            orgList.add(organization);

        } else if (type.getValue().equals(Type.BloodBank.getValue())) {
            organization = new BloodBMOrganz();
            orgList.add(organization);

        }


        else if (type.getValue().equals(Type.HealthcareOfficer.getValue())) {
            organization = new HCOfficerOrganz();
            orgList.add(organization);

        }

        else if (type.getValue().equals(Type.Secretary.getValue())) {
            organization = new SecretaryOrg();
            orgList.add(organization);

        } else if (type.getValue().equals(Type.Treasurer.getValue())) {
            organization = new TreasurerOrg();
            orgList.add(organization);

        }

        else if (type.getValue().equals(Type.InsuranceAgent.getValue())) {
            organization = new IAOrganization();
            orgList.add(organization);

        } else if (type.getValue().equals(Type.InsuranceFinanceOrganization.getValue())) {
            organization = new IFOrganization();
            orgList.add(organization);

        } else if (type.getValue().equals(Type.InsurancePolicyPlanner.getValue())) {
            organization = new InsurancePolicyPlannerOrg();
            orgList.add(organization);

        }

        else if (type.getValue().equals(Type.NGOAdministrator.getValue())) {
            organization = new NGOAdminOrg();
            orgList.add(organization);

        }

        else if (type.getValue().equals(Type.Director.getValue())) {
            organization = new NGODirectorOrg();
            orgList.add(organization);

        }
        return organization;
    }
}