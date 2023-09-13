package demo.abstract_factory;

/**
 * @learner lmeng
 * @date 2023/9/13
 * @des
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        //创建形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        //获取形状为圆形的
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();
        //获取形状为长方形的
        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        rectangle.draw();

        //创建颜色工厂
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        //用红色填充
        Color red = colorFactory.getColor("RED");
        red.fill();
        //用绿色填充
        Color blue = colorFactory.getColor("BLUE");
        blue.fill();

    }
}
