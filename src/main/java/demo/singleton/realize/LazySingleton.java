package demo.singleton.realize;

/**
 * @learner lmeng
 * @date 2023/9/13
 * @des 懒汉式
 */
public class LazySingleton {

    /**
     * 线程不安全
     */
    private static LazySingleton instance;

    public LazySingleton() {}

    public static LazySingleton getInstance() {
        if(instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    /**
     * 线程安全
     */
//    private static LazySingleton instance;
//
//    public LazySingleton() {}
//
//    public static synchronized LazySingleton getInstance() {
//        if(instance == null) {
//            instance = new LazySingleton();
//        }
//        return instance;
//    }
}
