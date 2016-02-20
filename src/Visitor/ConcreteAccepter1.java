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
public class ConcreteAccepter1 implements Accepter{

    @Override
    public void visit(Visitor visitor){
        visitor.setAccepter(this);
        visitor.visitorMethod();
    }
    
    @Override
    public void accepterMethod() {
        System.out.println("Accepter1です");
    }
    
}
