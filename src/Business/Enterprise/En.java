 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Org;
import Business.Organization.OD;
import java.util.List;

/**
 *
 * @author arundathi
 */
public abstract class En extends Org { //Enterprise extends Organization//

    private EntType entType;
    private OD orgDir;

    public OD getOrgDir() {
        return orgDir;
    }

    public enum EntType {

        HealthCenter("HealthCenter"),
        InsuranceCompany("InsuranceCompany"),
        Government("Government"),
        NGO("NGO");

        private String value;

        private EntType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public EntType getEntType() {
        return entType;
    }

    public void setEntType(EntType entType) {
        this.entType = entType;
    }

    public En(String name, EntType type) {
        super(name);
        this.entType = type;
        orgDir = new OD();
    }
    
    public abstract List<Org.Type> getAllOrganizationTypes();
}
