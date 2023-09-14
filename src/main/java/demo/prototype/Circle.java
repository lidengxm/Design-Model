package demo.prototype;

/**
 * @learner lmeng
 * @date 2023/9/14
 * @des
 */
public class Circle extends Shape{

    public Circle() {
        type = "CIRCLE";
    }

    @Override
    public void draw() {
        System.out.println("draw a circle...");
    }
}
