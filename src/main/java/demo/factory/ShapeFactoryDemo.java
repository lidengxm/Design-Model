package demo.factory;

/**
 * @learner lmeng
 * @date 2023/9/13
 * @des
 */
public class ShapeFactoryDemo {
    public static void main(String[] args) {
        //创建形状工厂
        ShapeFactory shapeFactory = new ShapeFactory();
        //1.通过工厂创建一个圆形
        String shapeType1 = "CIRCLE";
        Shape shape1 = shapeFactory.getShape(shapeType1);
        //调用draw方法
        shape1.draw();

        //3.通过工厂创建一个正方形
        String shapeType2 = "SQUARE";
        Shape shape2 = shapeFactory.getShape(shapeType2);
        //调用draw方法
        shape2.draw();

        //3.通过工厂创建一个长方形
        String shapeType3 = "RECTANGLE";
        Shape shape3 = shapeFactory.getShape(shapeType3);
        //调用draw方法
        shape3.draw();
    }

}
