/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnDirectory;

/**
 *
 * @author arundathi
 */
public class Network { //Network
    private String netwrkNm;
    private EnDirectory entDir;
    
    public Network(){
        entDir=new EnDirectory();
    }
    public String getNetwrkNm() {
        return netwrkNm;
    }

    public void setNetwrkNm(String netwrkNm) {
        this.netwrkNm = netwrkNm;
    }

    public EnDirectory getEntDir() {
        return entDir;
    }
    
    @Override
    public String toString(){
        return netwrkNm;
    }
    
}
