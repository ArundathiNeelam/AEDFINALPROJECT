/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Enterprise;

import Business.Organization.Org;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bhuvana
 */
public class NGOEn extends En{ //NGOEnterprise extends Enterprise//

    public NGOEn(String name) {
        super(name, En.EntType.NGO);
    }
    
     @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    @Override
    public List<Org.Type> getAllOrganizationTypes() {
        List<Org.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Org.Type.NGOAdministrator);
        orgTypes.add(Org.Type.Director);

        return orgTypes;
    }
    
}
