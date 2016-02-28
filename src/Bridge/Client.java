/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

/**
 *
 * @author kinopp
 */
public class Client {
    public static void main(String... args){
        RefinedAbstraction abstraction = new RefinedAbstraction(new ConcreteImplementor());
        abstraction.refineMethodA();
        abstraction.refineMethodB();
    }
}
