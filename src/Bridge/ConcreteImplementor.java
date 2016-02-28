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
public class ConcreteImplementor implements Implementor{

    @Override
    public void implMethodA() {
        System.out.println("実装メソッドAです");
    }

    @Override
    public void implMethodB() {
        System.out.println("実装メソッドBです");
    }
    
}
