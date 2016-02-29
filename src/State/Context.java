package State;

public class Context {
    private static State state;
    private static State previousState;
    private static final Context context = new Context();
    
    private Context(){
    }
    
    public static Context getInstance(){
        return context;
    }
     
    public void contextMethod(String className) throws Exception{
        
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
    
        // 一つ前の状態がConcreteState1の場合stateMethod1を実行、でない場合stateMethod2を実行
        if (previousState instanceof ConcreteState1){
            state.stateMethod1();
        } else {
            state.stateMethod2();
        }
    }
}
