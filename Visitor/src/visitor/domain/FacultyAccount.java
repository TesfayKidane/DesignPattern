/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor.domain;

import visitor.domain.Item;
import visitor.domain.AAccount;
import java.util.List;

/**
 *
 * @author Tesfay
 */
public class FacultyAccount extends AAccount {
    
    public FacultyAccount(int id, String firstName, String lastName, List<Item> itemsBorrowed) {
        super(id, firstName, lastName, itemsBorrowed);
    }
    
}
