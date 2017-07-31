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
public abstract class AbstractAgent {
    protected AbstractAgent nextAgent;
    public abstract void handleRequest(CallRecord callRecord);
    public abstract boolean canHandleRequest(CallRecord callRecord);
}
