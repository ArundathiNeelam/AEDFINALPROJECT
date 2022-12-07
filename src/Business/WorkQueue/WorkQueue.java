/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;


/**
 *
 * @author arundathi
 */
public class WorkQueue {

    private ArrayList<WR> workRequests;

    public WorkQueue() {
        workRequests = new ArrayList();
    }

    public ArrayList<WR> getWorkRequests() {
        return workRequests;
    }
}
