package demo.singleton.realize;

/**
 * @learner lmeng
 * @date 2023/9/13
 * @des 饿汉式
 */
public class HungrySingleton {

    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {}

    public static HungrySingleton getInstance() {
        return instance;
    }
}
