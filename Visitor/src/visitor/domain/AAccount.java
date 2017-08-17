/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor.domain;

import java.util.List;

/**
 *
 * @author Tesfay
 */
public abstract class AAccount {
    private int id;
    private String firstName;
    private String lastName;
    private List<Item> itemsBorrowed;

    public AAccount(int id, String firstName, String lastName, List<Item> itemsBorrowed) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.itemsBorrowed = itemsBorrowed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Item> getItemsBorrowed() {
        return itemsBorrowed;
    }

    public void setItemsBorrowed(List<Item> itemsBorrowed) {
        this.itemsBorrowed = itemsBorrowed;
    }
}
