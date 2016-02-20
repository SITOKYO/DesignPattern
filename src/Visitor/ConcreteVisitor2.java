/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

/**
 *
 * @author kinopp
 */
public class ConcreteVisitor2 implements Visitor {
    
    private Accepter accepter;
    
    @Override
    public void setAccepter(Accepter accepter) {
        this.accepter = accepter;
    }

    @Override
    public void visitorMethod() {
        System.out.println("Visitor2です");
    }
}
