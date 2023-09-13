package demo.singleton;

/**
 * @learner lmeng
 * @date 2023/9/13
 * @des
 */
public class SingletonDemo {
    public static void main(String[] args) {
        //错误的创建对象方式，构造函数 SingleObject() 是不可见的
//        SingleObject singleObject = new SingleObject();

        //获取唯一可用的对象
        SingleObject instance = SingleObject.getInstance();

        instance.showMessage();
    }
}
