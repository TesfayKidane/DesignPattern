/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

import flyweight.domain.Address;
import flyweight.domain.Customer;
import flyweight.domain.LocationMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Tesfay
 */
public class Client {
    
    public static void main(String[] args){
    
        List<Address> address = new ArrayList<>(Arrays.asList(
                new Address("1000 N 4th S", "FairField", "IA", "52557"),
                new Address("1002 N 4th S", "FairField", "IA", "52557"),
                new Address("20018 S 10th S", "Seattle", "WA", "45533")
        ));
        for(int i = 0 ; i < 10; i ++){
            CustomerService cs = new CustomerService(new Customer());            
            Customer customer = cs.getCustomer();
            customer.setFirstName("Tesfay");
            customer.setLastName("Aregay");
            customer.setResidenceAddress(address.get(0));
            
            // since LocationMap of cities is same, it can be shared.
            LocationMap locationMap = ServiceFactory.getLocationImage(customer.getResidenceAddress().getCity(), "/img/location", 10, 20);
            customer.setLocationMap(locationMap);
            
            cs.displayHealthProfile();
            cs.displayLocationMap();
        }
    }
}
