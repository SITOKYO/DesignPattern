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
public class Abstraction {
    private Implementor implementor;

    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }
    
    public void method1(){
        implementor.implMethodA();
    }
    public void method2(){
        implementor.implMethodB();
    } 
}
