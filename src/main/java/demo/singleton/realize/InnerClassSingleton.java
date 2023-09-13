package demo.singleton.realize;

import demo.singleton.SingleObject;

/**
 * @learner lmeng
 * @date 2023/9/13
 * @des  静态内部类
 */
public class InnerClassSingleton {

    private static class SingleDemo {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

    private InnerClassSingleton() {}

    public static final InnerClassSingleton getInstance() {
        return new SingleDemo().INSTANCE;
    }
}
