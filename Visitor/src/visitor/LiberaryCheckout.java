/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import visitor.visitor.StudentFineCalculatingVisitor;
import visitor.visitor.IVisitor;
import visitor.visitor.FacultyFineCalculatingVisitor;
import visitor.domain.FacultyAccount;
import visitor.domain.Item;
import visitor.domain.AAccount;
import visitor.domain.StudentAccount;
import java.util.List;

/**
 *
 * @author Tesfay
 */
public class LiberaryCheckout {

    private List<Item> items;

    public LiberaryCheckout() {
    }

    public double calculateFine(AAccount account) {
        IVisitor visitor = null;
        if (account instanceof StudentAccount) {
            visitor = new StudentFineCalculatingVisitor();
        } else if (account instanceof FacultyAccount) {
            visitor = new FacultyFineCalculatingVisitor();
        }

        items = account.getItemsBorrowed();
        for (Item item : items) {
            item.accept(visitor);
        }

        double totalFine = visitor.getTotalFine();
        return totalFine;
    }

}
