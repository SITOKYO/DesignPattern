/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author kinopp
 */
public class ConcreteComponent extends Component{

    private String string;
    
    public ConcreteComponent(String string) {
        this.string = string;
    }
    
    @Override
    public void display() {
        System.out.println(string);
    }
    
}
