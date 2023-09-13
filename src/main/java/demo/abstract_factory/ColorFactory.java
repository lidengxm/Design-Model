package demo.abstract_factory;

import demo.factory.Circle;
import demo.factory.Rectangle;
import demo.factory.Square;

/**
 * @learner lmeng
 * @date 2023/9/13
 * @des
 */
public class ColorFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        if(colorType == null) {
            return null;
        }

        if(colorType.equals("RED")) {
            return new Red();
        } else if (colorType.equals("BLUE")) {
            return new Blue();
        } else if (colorType.equals("YELLOW")) {
            return new Yellow();
        }
        return null;
    }
}
