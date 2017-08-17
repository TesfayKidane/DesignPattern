/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor.domain;

import visitor.visitor.IVisitor;

/**
 *
 * @author Tesfay
 */
public interface Item {
    public void accept(IVisitor visitor);
}
