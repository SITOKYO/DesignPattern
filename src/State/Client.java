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
public class Client {
    public static void main(String... args) throws Exception{
        // 前の状態がConcreteState1の場合method1を実行、でない場合method2を実行する処理を呼び出し
        Context context1 = new Context("ConcreteState1");
        context1.contextMethod();  // 前の状態がないのでmethod2を実行
        Context context2 = new Context("ConcreteState1");
        context2.contextMethod();  // 前の状態がState1なのでmethod1を実行
        Context context3 = new Context("ConcreteState2");
        context3.contextMethod();  // 前の状態がState1なのでmethod1を実行
        Context context4 = new Context("ConcreteState2");
        context2.contextMethod();  // 前の状態がState2なのでmethod2を実行
    }
}
