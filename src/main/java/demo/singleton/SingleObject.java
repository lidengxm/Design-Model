package demo.singleton;

/**
 * @learner lmeng
 * @date 2023/9/13
 * @des
 */
public class SingleObject {

    //创建SingleObject对象
    private static SingleObject instance = new SingleObject();

    //构造函数设为private，这样就不会被实例化
    private SingleObject() {}

    //获取唯一可用的对象
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("single message...");
    }
}
