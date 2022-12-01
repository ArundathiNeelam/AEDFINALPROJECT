/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author arundathi
 */
public class EnDirectory {
    private ArrayList<En> entList; //EnterpriseDirectory//
   

    public ArrayList<En> getEntList() {
        return entList;
    }

    public void setEntList(ArrayList<En> entList) {
        this.entList = entList;
    }
    
    public EnDirectory(){
        entList=new ArrayList<En>();
    }
    
    //Create enterprise
    public En crtAndAddEnt(String name,En.EntType type){
        En enterprise=null;
        if(type==En.EntType.HealthCenter){
            enterprise=new HealthcenterEN(name);
            entList.add(enterprise);
        }
        
        else if(type == En.EntType.Government)
        {
            enterprise =  new GovtEn(name);
            entList.add(enterprise);
            
        }
        
        else if(type == En.EntType.InsuranceCompany)
        {
            enterprise = new InsurancecmpnyEN(name);
            entList.add(enterprise);
            
            
        }
        else if(type == En.EntType.NGO)
        {
            enterprise = new NGOEn(name);
            entList.add(enterprise);
            
        }
        return enterprise;
    }
}
