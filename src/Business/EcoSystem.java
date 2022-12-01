/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Organization.Org;
import Business.Role.Role;
import Business.Role.SysAdminRole;
import java.util.ArrayList;

/**
 *
 * @author arundathi
 */
public class EcoSystem extends Org{
    
    private static EcoSystem ecosystem;
    private ArrayList<Network> networks;
    public static EcoSystem getInstance(){
        if(ecosystem==null){
            ecosystem=new EcoSystem();
        }
        return ecosystem;
    }
    
    public Network createAndAddNetwork(){ //network can be created by the user//
        Network network=new Network();
        networks.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() { //supportedrole//
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SysAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networks=new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworks() { //networks can be seen//
        return networks;
    }

    public void setNetworks(ArrayList<Network> networks) { //arrange networks//
        this.networks = networks;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUsrAccDir().checkIfUsernameIsUnique(userName)){
            return false;
        }
        for(Network network:networks){
            
        }
        return true;
    }
}
