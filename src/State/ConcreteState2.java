package State;

public class ConcreteState2 implements State{
    @Override
    public void stateMethod1() {
        System.out.println("ConcreteState2のstateMethod1");
    }

    @Override
    public void stateMethod2() {
        System.out.println("ConcreteState2のstateMethod2");
    }    
}
