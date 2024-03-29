/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Emply;
import Business.Role.Role;

import java.util.ArrayList;

/**
 *
 * @author bhuvana
 */
public class UserAD {

    private ArrayList<UserAccount> usrAccList;

    public UserAD() {
        usrAccList = new ArrayList();
    }

    public ArrayList<UserAccount> getUsrAccList() {
        return usrAccList;
    }

    public UserAccount authenticateUser(String username, String password) {
        for (UserAccount ua : usrAccList) {
            if (ua.getUname().equals(username) && ua.getPwd().equals(password)) {
                return ua;
            }
        }

        return null;
    }

    public UserAccount createUserAccount(String username, String password, Emply employee, Role role) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUname(username);
        userAccount.setPwd(password);
        userAccount.setEmp(employee);
        userAccount.setRole(role);
        usrAccList.add(userAccount);
        return userAccount;
    }

    public UserAccount createUserAccount(String username, String password, Emply employee, Role role, String type) {
        UserAccount userAccount = new UserAccount();
        userAccount.setUname(username);
        userAccount.setPwd(password);
        userAccount.setEmp(employee);
        userAccount.setRole(role);
        userAccount.setType(type);
        usrAccList.add(userAccount);
        return userAccount;
    }

    public boolean checkIfUsernameIsUnique(String username) {
        for (UserAccount ua : usrAccList) {
            if (ua.getUname().equals(username)) {
                return false;
            }
        }
        return true;
    }
}
