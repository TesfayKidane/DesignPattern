/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import builder.domain.Customer;
import builder.domain.Request;

/**
 *
 * @author Tesfay
 */
public interface RequestBuilder {
    public void buildAgetn();
    public void buildCustomer();
    public void buildReqContent();
    public void buildRespContent();  
    public void closeCall();
    
    default Customer getFromDb(String string) {
        return null;
    }

    public Request getRequest();
}
