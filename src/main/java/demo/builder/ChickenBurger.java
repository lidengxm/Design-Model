package demo.builder;

/**
 * @learner lmeng
 * @date 2023/9/14
 * @des
 */
public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 35.5f;
    }
}
