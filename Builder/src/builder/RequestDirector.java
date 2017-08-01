/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import builder.domain.Request;

/**
 *
 * @author Tesfay
 */
public class RequestDirector {
    
    private RequestBuilder requestBuilder = null;

    public RequestDirector(RequestBuilder requestBuilder) {
        this.requestBuilder = requestBuilder;
    }
    
    public void constructRequest(){
        requestBuilder.buildAgetn();
        requestBuilder.buildCustomer();
        requestBuilder.buildReqContent();
        requestBuilder.buildRespContent();
        requestBuilder.closeCall();
    }
    
    public Request getRequest()
    {
        return requestBuilder.getRequest();
    }
    
    
}
