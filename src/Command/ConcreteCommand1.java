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
public class ConcreteCommand1 implements Command{

    Receiver receiver = new ConcreteReceiver();
    
    @Override
    public void execute() {
        System.out.println("--- ConcreteCommand1開始 ---");
        receiver.action1();
        receiver.action2();
        receiver.action3();
    }
    
}
