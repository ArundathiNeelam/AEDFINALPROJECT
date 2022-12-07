/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Employee.EmplyDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAD;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author bhuvana
 */
public abstract class Org {

    private String orgNm;
    private WorkQueue wrkQ;
    private EmplyDirectory empDir;
    private UserAD usrAccDir;
    private int orgID;
    private static int cntr = 0;
    

    public enum Type {

        Admin("Admin Organization"), Doctor("Doctor Organization"), Lab("Lab Organization"), Patient("Patient Organization"), Accountant("Accountant Organization"),BloodBank("BloodBank Manager Organization"),
        InsuranceAgent("Insurance Agent Organization"), InsurancePolicyPlanner("Insurance Policy Planning Organization"), InsuranceFinanceOrganization("Insurance Finance Organization"),
        Treasurer("Treasurer Organization"), Secretary("Secretary Organization"), HealthcareOfficer("Healthcare Officer Organization"),
        NGOAdministrator("Administrator Organization"), Director("Director Organization");
        

        private String value;

        private Type(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public Org(String name) {
        this.orgNm = name;
        wrkQ = new WorkQueue();
        empDir = new EmplyDirectory();
        usrAccDir = new UserAD();
        orgID = cntr;
        ++cntr;
    }

    public abstract ArrayList<Role> getSupportedRole();

    public UserAD getUsrAccDir() {
        return usrAccDir;
    }

    public int getOrgID() {
        return orgID;
    }

    public EmplyDirectory getEmpDir() {
        return empDir;
    }

    public String getName() {
        return orgNm;
    }

    public WorkQueue getWrkQ() {
        return wrkQ;
    }

    public void setName(String name) {
        this.orgNm = name;
    }

    public void setWrkQ(WorkQueue wrkQ) {
        this.wrkQ = wrkQ;
    }

    @Override
    public String toString() {
        return orgNm;
    }

}
