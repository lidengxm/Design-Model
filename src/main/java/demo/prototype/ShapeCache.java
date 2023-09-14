package demo.prototype;

import java.util.Hashtable;

/**
 * @learner lmeng
 * @date 2023/9/14
 * @des
 */
public class ShapeCache {

    public static Hashtable<String,Shape> hashtable = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape cacheShape = hashtable.get(shapeId);
        return (Shape) cacheShape.clone();
    }

    //对每种形状都运行数据库查询，并创建该形状
    //shapeMap.put(shapeKey, shape);
    //例如，我们要添加三种形状
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        hashtable.put(circle.getId(),circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        hashtable.put(rectangle.getId(),rectangle);

        Square square = new Square();
        square.setId("3");
        hashtable.put(square.getId(),square);
    }
}
