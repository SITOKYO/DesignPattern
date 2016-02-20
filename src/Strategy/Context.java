package Strategy;

/**
 *
 * @author kinopp
 */
public class Context {
    private Strategy strategy;
    
    public Context(String className) throws Exception{   
        try {
            final String fullyQualifiedClassName = Strategy.class.getPackage().getName() + "." + className;
            strategy = (Strategy)Class.forName(fullyQualifiedClassName).newInstance();
        } catch (ClassNotFoundException ex) {
            // 注意：生成対象のクラスは当クラスと同パッケージに存在する必要があります。
            System.err.println("クラスの指定が正しくありません");
            throw ex;
        }
    }

    public void calculate(){
        strategy.calculate();
    }
}
