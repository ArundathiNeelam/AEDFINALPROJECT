package Business;

import Business.Employee.Emply;
import Business.Role.SysAdminRole;
import Business.UserAccount.UserAccount;


/**
 *
 * @author arundathi
 */
public class SysConfig {
    
    public static EcoSystem configure(){
        
        EcoSystem ecosystem = EcoSystem.getInstance();
        
        
        Emply employee = ecosystem.getEmpDir().createEmployee("sysadmin");//employee username//
        
        UserAccount userAccount = ecosystem.getUsrAccDir().createUserAccount("sysadmin", "sysadmin", employee, new SysAdminRole());
        //login details//
        
        return ecosystem;
    }
    
}
