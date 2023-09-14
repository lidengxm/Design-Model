package demo.builder;

/**
 * @learner lmeng
 * @date 2023/9/14
 * @des
 */
public class VegBurger extends Burger{
    @Override
    public String name() {
        return "Vegetables Burger";
    }

    @Override
    public float price() {
        return 15.5f;
    }
}
