/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author kinopp
 */
public class ConcreteObserver2 implements Observer{
    @Override
    public void update() {
        System.out.println("ConcreteObserver2はSubjectの変更通知を受けました");
    }
}
