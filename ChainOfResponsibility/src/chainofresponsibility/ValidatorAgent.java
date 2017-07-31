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
public class ValidatorAgent extends AbstractAgent{

    @Override
    public void handleRequest(CallRecord callRecord) {
        if(this.canHandleRequest(callRecord)){
           callRecord.setIsValid(true);
           if(this.nextAgent != null){
                this.nextAgent.handleRequest(callRecord);
            }
        }
        else{
            System.out.println("Data is invalid");
            return;
        }
    }

    @Override
    public boolean canHandleRequest(CallRecord callRecord) {
        if(callRecord.getCustomer().getAddress().isEmpty() || callRecord.getCustomer().getEmail().isEmpty() || callRecord.getCustomer().getPhone().isEmpty())
            return false;
       return true;
    }
    
}
