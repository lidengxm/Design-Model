package demo.factory;

/**
 * @learner lmeng
 * @date 2023/9/13
 * @des 形状工厂
 */
public class ShapeFactory {
    //使用getShape方法获取对象的类型
    public Shape getShape(String shapeType) {
        if(shapeType == null) {
            return null;
        }

        if(shapeType.equals("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equals("SQUARE")) {
            return new Square();
        } else if (shapeType.equals("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}
