/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

/**
 *
 * @author kinopp
 */
public class ConcreteState1 implements State{

    @Override
    public void stateMethod1() {
        System.out.println("ConcreteState1のstateMethod1");
    }

    @Override
    public void stateMethod2() {
        System.out.println("ConcreteState1のstateMethod2");
    }
    
}
