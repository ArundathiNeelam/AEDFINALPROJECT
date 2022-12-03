/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.InsuranceCustomer;



import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bhuvana
 */
public class InsuranceCD { //InsuranceCustomerDirectory

    private List<InsuranceCust> insCust = new ArrayList<>();

    public List<InsuranceCust> getInsCust() {
        return insCust;
    }

    public void setInsCust(List<InsuranceCust> insCust) {
        this.insCust = insCust;
    }

    @Override
    public String toString() {
        return "InsuranceCustomerDirectory{" + "insuranceCustomers=" + insCust + '}';
    }

}
