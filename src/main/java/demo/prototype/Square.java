package demo.prototype;

/**
 * @learner lmeng
 * @date 2023/9/14
 * @des
 */
public class Square extends Shape {

    public Square() {
        type = "SQUARE";
    }

    @Override
    public void draw() {
        System.out.println("draw a square...");
    }
}
