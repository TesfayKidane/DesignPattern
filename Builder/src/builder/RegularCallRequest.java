/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import builder.domain.Agent;
import builder.domain.Customer;
import builder.domain.Request;
import java.util.Date;

/**
 *
 * @author Tesfay
 */
public class RegularCallRequest implements RequestBuilder {

    private Request request;

    public RegularCallRequest() {
        request = new Request();
    }

    @Override
    public void buildAgetn() {
        Agent agent = new Agent();
        request.setAgent(agent);
        request.setRequestId(String.valueOf(new Date().getTime()));
    }

    @Override
    public void buildCustomer() {
        // get phone number
        Customer cust = getFromDb("184726");
        if (cust == null) {
            cust = new Customer();
        }
        request.setRequester(cust);
    }

    @Override
    public void buildReqContent() {

        request.setReqContent("");
    }

    @Override
    public void buildRespContent() {
        if (canHandleRequest()) {
            if (requestNeedsCallBack()) {
                request.setNeedCallback(true);
            } else {
                request.setRespContent("");
                request.setIsAnswered(true);
            }
        } else {

        }
    }

    @Override
    public Request getRequest() {
        return request;
    }

    @Override
    public void closeCall() {
        
        // store to db;

    }

    private boolean canHandleRequest() {
        return true; // just return true for test purpose
    }

    private boolean requestNeedsCallBack() {
        return false; // just return flase for test purpose
    }

}
