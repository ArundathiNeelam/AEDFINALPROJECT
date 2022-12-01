/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author arundathi
 */
public class EmplyDirectory { //EmployeeDirectory//

    private ArrayList<Emply> empList;

    public EmplyDirectory() {
        empList = new ArrayList();
    }

    public ArrayList<Emply> getEmpList() {
        return empList;
    }

    public Emply createEmployee(String name) {
        Emply employee = new Emply();
        employee.setEmpName(name);
        empList.add(employee);
        return employee;
    }
}
