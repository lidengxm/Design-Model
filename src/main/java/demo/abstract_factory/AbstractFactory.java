package demo.abstract_factory;

/**
 * @learner lmeng
 * @date 2023/9/13
 * @des 抽象类，创建对应的工厂
 */
public abstract class AbstractFactory {

    public abstract Shape getShape(String shapeType);

    public abstract Color getColor(String colorType);
}
