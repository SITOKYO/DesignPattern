package Singleton;

public class Client {

    public static void main(String... args){
        Singleton singleton01 = Singleton.getInstance();
        Singleton singleton02 = Singleton.getInstance();
        if (singleton01 == singleton02){
            System.out.println("同じオブジェクトです");
        } else {
            System.out.println("違うオブジェクトです");
        }
    }
    
}
