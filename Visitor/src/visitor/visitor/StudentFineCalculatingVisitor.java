/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor.visitor;

import visitor.domain.ResearchPaper;
import visitor.visitor.IVisitor;
import visitor.domain.Magazine;
import visitor.domain.Book;

/**
 *
 * @author Tesfay
 */
public class StudentFineCalculatingVisitor implements IVisitor{
    private double totalFine; 
    
    @Override
    public void visit(Book book) {
       if(book.isOverdue()){
           totalFine += 1.2;
       }
    }

    @Override
    public void visit(Magazine magazine) {
        if(magazine.isOverdue())
            totalFine += 2.90;
    }

    @Override
    public void visit(ResearchPaper researchPaper) {
        if(researchPaper.isOverdue())
            totalFine += 3.0;
    }

    @Override
    public double getTotalFine() {
        return totalFine > 10.00 ? 10.00 : totalFine;
    }
    
}
