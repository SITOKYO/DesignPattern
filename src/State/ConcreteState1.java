package State;

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
