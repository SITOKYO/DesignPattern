/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author kinopp
 */
public class Adapter implements Target{
    private Adaptee adaptee;
    
    public Adapter(){
        this.adaptee = new Adaptee();
    }

    @Override
    public void newMethod1() {
        adaptee.oldMethod1();
    }

    @Override
    public void newMethod2() {
        adaptee.oldMethod2();
    }
}
