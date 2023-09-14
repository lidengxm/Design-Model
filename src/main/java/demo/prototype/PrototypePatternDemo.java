package demo.prototype;

/**
 * @learner lmeng
 * @date 2023/9/14
 * @des 原型模式
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape shape1 = ShapeCache.getShape("1");
        System.out.println("shape：" + shape1.type);

        Shape shape2 = ShapeCache.getShape("2");
        System.out.println("shape：" + shape2.type);

        Shape shape3 = ShapeCache.getShape("3");
        System.out.println("shape：" + shape3.type);
    }
}
