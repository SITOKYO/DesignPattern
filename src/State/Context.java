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
public class Context {
    private static State state;
    private static State previousState;
    
    public Context(String className) throws Exception{
        // 前回状態の保持
        previousState = state;
        
        try {
            final String fullyQualifiedClassName = State.class.getPackage().getName() + "." + className;
            state = (State)Class.forName(fullyQualifiedClassName).newInstance();
        } catch (ClassNotFoundException ex) {
            // 注意：生成対象のクラスは当クラスと同パッケージに存在する必要があります。
            System.err.println("クラスの指定が正しくありません");
            throw ex;
        }
    }
    // 一つ前の状態がConcreteState1の場合stateMethod1を実行、でない場合stateMethod2を実行
    public void contextMethod(){
        if (previousState instanceof ConcreteState1){
            state.stateMethod1();
        } else {
            state.stateMethod2();
        }
    }
}
