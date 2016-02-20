/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author kinopp
 */
public class Client {
    public static void main(String... args) throws Exception{
        // 戦略：ConcreteStrategy1のクラス名を指定
        Context context1 = new Context("ConcreteStrategy1");
        context1.calculate();
        
        // 戦略：ConcreteStrategy2のクラス名を指定
        Context context2 = new Context("ConcreteStrategy2");
        context2.calculate();
    }
}
