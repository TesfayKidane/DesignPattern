/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor.visitor;

import visitor.domain.ResearchPaper;
import visitor.domain.Magazine;
import visitor.domain.Book;

/**
 *
 * @author Tesfay
 */
public interface IVisitor {
    public void visit(Book book);
    public void visit(Magazine magazine);
    public void visit(ResearchPaper researchPaper);
    public double getTotalFine();
}
