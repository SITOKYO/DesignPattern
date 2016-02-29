package State;

public class Client {
    public static void main(String... args) throws Exception{    
        Context context = Context.getInstance();
        context.contextMethod("ConcreteState1");  // 前の状態がないのでmethod2を実行
        context.contextMethod("ConcreteState1");  // 前の状態がState1なのでmethod1を実行
        context.contextMethod("ConcreteState2");  // 前の状態がState1なのでmethod1を実行
        context.contextMethod("ConcreteState2");  // 前の状態がState2なのでmethod2を実行
    }
}
