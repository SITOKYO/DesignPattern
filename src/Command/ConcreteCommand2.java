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
public class ConcreteCommand2 implements Command{

    Receiver receiver = new ConcreteReceiver();
    
    @Override
    public void execute() {
        receiver.action3();
        receiver.action1();
        receiver.action2();    
    }
    
}
