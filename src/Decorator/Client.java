/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author kinopp
 */
public class Client {
    public static void main(String... args){
        Component component1 = new ConcreteComponent("Hello Java");
        Component component2 = new ConcreteDecorator1(component1);
        Component component3 = new ConcreteDecorator2(component2);
        component3.display();
    }
}
