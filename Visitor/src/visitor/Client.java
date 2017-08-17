/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import visitor.domain.ResearchPaper;
import visitor.domain.AAccount;
import visitor.domain.StudentAccount;
import visitor.domain.Magazine;
import visitor.domain.Book;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Tesfay
 */
public class Client {
    
    public static void main(String[] args){
        AAccount account = new StudentAccount(1, "Tesfay", "Aregay", new ArrayList<>(Arrays.asList(new Book(), new Magazine(), new ResearchPaper(), new Book(), new Book())));
        LiberaryCheckout lc = new LiberaryCheckout();
        System.out.println(lc.calculateFine(account));
    }
}
