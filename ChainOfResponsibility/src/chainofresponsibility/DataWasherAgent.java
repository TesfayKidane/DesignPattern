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
public class DataWasherAgent extends AbstractAgent {

    @Override
    public void handleRequest(CallRecord callRecord) {
        if (this.canHandleRequest(callRecord)) {
            // some analysis here
            callRecord.setIsASalesLead(true);
            if (this.nextAgent != null) {
                this.nextAgent.handleRequest(callRecord);
            }
        }
        else{
            System.out.println("This call record did not pass through the validator");
        }
    }

    @Override
    public boolean canHandleRequest(CallRecord callRecord) {
        if(callRecord.isIsValid())
            return true;
        return false;
    }
}
