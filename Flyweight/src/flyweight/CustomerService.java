/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

import flyweight.domain.Customer;

/**
 *
 * @author Tesfay
 */
public class CustomerService implements Service{
    private Customer customer;

    public CustomerService(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void displayHealthProfile() {
        System.out.println(customer.toString());
    }

    @Override
    public void displayLocationMap() {
        System.out.println(customer.toString());
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
}
