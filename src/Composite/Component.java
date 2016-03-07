/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Composite;

/**
 *
 * @author kinopp
 */
public abstract class Component {
    //Leafはadd出来ない為、デフォルトは例外とする。Nodeはaddメソッドをオーバーライドする
    public void add(Component composite) throws Exception{
        throw new Exception();
    }
    public abstract String getName();
    public abstract void printList();
}
