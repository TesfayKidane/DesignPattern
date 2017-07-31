/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility;

import chainofresponsibility.domain.Address;
import chainofresponsibility.domain.Agent;
import chainofresponsibility.domain.CallRecord;
import chainofresponsibility.domain.Customer;
/**
 *
 * @author Tesfay
 */
public class Client {
  
    
    public void sendRequest(CallRecord callRecord){
        ChainBuilder.getChainBuilder().getHandler().handleRequest(callRecord);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Address address = new Address("1000 N 4th S", "FF", "IA", "52557");
        Customer customer = new Customer("T", "A", address, "329", "tk@gmail.com");
        Agent agent = new Agent("123", address);
        CallRecord callRecord = new CallRecord(customer, agent, "validate and wash call record", false, false);
        Client client = new Client();
        client.sendRequest(callRecord);
        
        // test it if you 
        address.setCity("");
        client.sendRequest(callRecord);
        
    }
    
}
