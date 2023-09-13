package demo.abstract_factory;

/**
 * @learner lmeng
 * @date 2023/9/13
 * @des 工厂创造者---获取工厂
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if(choice == null) {
            return null;
        }

        //根据对应参数创建不同的工厂对象
        if(choice.equals("SHAPE")) {
            return new ShapeFactory();
        } else if (choice.equals("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
