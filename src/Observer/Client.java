/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author kinopp
 */
public class Client {
    public static void main(String... aegs){
        Subject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        
        subject.addObserver(observer);
        if (subject.getSubjectStatus().equals("変更が発生しました")){
            observer.update();
        }
    
    }
}
