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
public class RefinedAbstraction extends Abstraction{

    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    public void refineMethodA() {
        method1();
        System.out.println("機能メソッドAです");
    }

    public void refineMethodB() {
        method2();
        System.out.println("機能メソッドBです");
    }
}
