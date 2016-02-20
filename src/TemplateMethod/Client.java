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
public class Client {
    public static void main(String... args){
        AbstractClass clazz = new ConcreteClass();
        clazz.templateMethod();
    }
}
