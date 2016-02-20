/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kinopp
 */
public class Client {
    
    public static void main(String... args){
        List<Accepter> list = new ArrayList<>();
        list.add(new ConcreteAccepter1());
        list.add(new ConcreteAccepter2());
        list.add(new ConcreteAccepter1());
        
        Visitor visitor1 = new ConcreteVisitor1();
        Visitor visitor2 = new ConcreteVisitor2();
        for (Accepter accepter: list){
            System.out.println("-------------");
            accepter.accepterMethod();
            accepter.visit(visitor1);
            accepter.visit(visitor2);
        }
    }
    
    

}
