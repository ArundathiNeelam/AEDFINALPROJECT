/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Org;
import Business.Patient.PD;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bhuvana
 */
public class HealthcenterEN extends En { //HealthCenterEnterprise extends Enterprise//

    private PD patientDir;

    public HealthcenterEN(String name) {
        super(name, EntType.HealthCenter);
        patientDir = new PD();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public List<Org.Type> getAllOrganizationTypes() {
        List<Org.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Org.Type.Doctor);
        orgTypes.add(Org.Type.Lab);
        orgTypes.add(Org.Type.Accountant);
        orgTypes.add(Org.Type.BloodBank);
        return orgTypes;

    }

    @Override
    public String toString() {
        return this.getName();
    }

    public PD getPatientDir() {
        return patientDir;
    }

    public void setPatientDir(PD patientDir) {
        this.patientDir = patientDir;
    }

}
