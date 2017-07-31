/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

import chainofresponsibility.domain.CallRecord;

/**
 *
 * @author Tesfay
 */
public class ReporterAgent extends AbstractAgent{

    @Override
    public void handleRequest(CallRecord callRecord) {
        if(this.canHandleRequest(callRecord))
        {
             System.out.println("Report ... ");
             System.out.println(callRecord.toString());
        }
        else{
            System.out.println("This call record did not pass through data washer.");
        }
    }

    @Override
    public boolean canHandleRequest(CallRecord callRecord) {
        if(callRecord.isIsASalesLead())
            return true;
        return false;
    }
    
}
