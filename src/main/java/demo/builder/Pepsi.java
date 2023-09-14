package demo.builder;


/**
 * @learner lmeng
 * @date 2023/9/14
 * @des
 */
public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 12.0f;
    }
}
