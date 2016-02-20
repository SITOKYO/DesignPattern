/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

/**
 *
 * @author kinopp
 */
public interface Visitor {
    // Visitor独自のメソッド
    public void visitorMethod();
    
    // Accepterを受け入れるメソッドを用意する
    public void setAccepter(Accepter accepter);
}
