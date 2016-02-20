/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author kinopp
 */
public class Client {
    public static void main(String... args) throws Exception{
        Invoker invoker1 = new Invoker("ConcreteCommand1");
        invoker1.invoke();
        
        Invoker invoker2 = new Invoker("ConcreteCommand2");
        invoker2.invoke();
    }
}
