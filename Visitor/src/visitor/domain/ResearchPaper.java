/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor.domain;

import visitor.visitor.IVisitor;
import visitor.domain.Item;

/**
 *
 * @author Tesfay
 */
public class ResearchPaper implements Item {

    private boolean overdue = false;

    public boolean isOverdue() {
        return overdue;
    }

    public void setOverdue(boolean overdue) {
        this.overdue = overdue;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

}
