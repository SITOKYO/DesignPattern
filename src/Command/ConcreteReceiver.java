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
public class ConcreteReceiver implements Receiver{

    @Override
    public void action1() {
        System.out.println("action1です");
    }

    @Override
    public void action2() {
        System.out.println("action2です");
    }

    @Override
    public void action3() {
        System.out.println("action3です");
    }
    
}
