package Adapter;

public class Client {
    public static void main(String... args){
        Target target = new Adapter();
        target.newMethod1();
        target.newMethod2();
    }
}
