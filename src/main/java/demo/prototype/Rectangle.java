package demo.prototype;

/**
 * @learner lmeng
 * @date 2023/9/14
 * @des
 */
public class Rectangle extends Shape{

    public Rectangle() {
        type = "RECTANGLE";
    }

    @Override
    public void draw() {
        System.out.println("draw a rectangle...");
    }
}
