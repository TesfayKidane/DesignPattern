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
public class Client {
    public static void main(String[] args){
        RequestDirector rd = new RequestDirector(new RegularCallRequest());
        rd.constructRequest();
        Request request = rd.getRequest();
        System.out.println(request);
    }
}
