/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplateMethod;

/**
 *
 * @author kinopp
 */
public abstract class AbstractClass {
    
    // 抽象メソッドを利用して処理内容を記載
    public void templateMethod(){
        System.out.println("----- start -----");
        method1();   // 具体的な処理はわからないが、method1を行う
        for (int i=0; i<5; i++){
            method2();   // 具体的な処理はわからないが、method2を行う
        }
        method3();   // 具体的な処理はわからないが、method3を行う
        System.out.println("-----  end  -----");
    }
    
    // 具体的な処理はサブクラスに記載
    protected abstract void method1();
    protected abstract void method2();
    protected abstract void method3();
    
}
