/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.NGODirectorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author arundathi
 */
public class NGODirectorOrg extends Org{
    public NGODirectorOrg() {
        super(Org.Type.Director.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new NGODirectorRole());
        return roles;
    }
}
