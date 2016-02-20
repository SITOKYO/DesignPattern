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
public class ConcreteClass extends AbstractClass{

    @Override
    protected void method1() {
        System.out.println("method1です");
    }

    @Override
    protected void method2() {
        System.out.println("method2です");
    }

    @Override
    protected void method3() {
        System.out.println("method3です");
    }
    
}
