/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chainofresponsibility.domain;

/**
 *
 * @author Tesfay
 */
public class Address {

    private String streetAddress;
    private String city;
    private String state;
    private String zipcode;

    public Address(String streetAddress, String city, String state, String zipcode) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Adress{" + "streetAddress=" + streetAddress + ", city=" + city + ", state=" + state + ", zipcode=" + zipcode + '}';
    }
    
    public boolean isEmpty(){
        if(city.isEmpty() || streetAddress.isEmpty() || zipcode.isEmpty() || zipcode.isEmpty() || state.isEmpty())
            return true;
        return false;
    }
}
