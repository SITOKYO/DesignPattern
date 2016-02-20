package Singleton;

/**
 * Singletonのサンプル
 */
public class Singleton {

    private static final Singleton singleton = new Singleton();

    // コンストラクタをprivateにすることでnewを禁止する。
    private Singleton() {                                 
    }

    /**
     * インスタンス取得メソッド
     * @return 当クラスのインスタンス
     */
    public static Singleton getInstance() {
        // このメソッドを通してのみインスタンスを取得できる。
        // staticなインスタンスなのでどこから呼ばれても常に同じオブジェクトを渡す。
        return singleton;
    }
}
