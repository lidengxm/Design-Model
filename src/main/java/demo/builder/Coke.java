package demo.builder;


/**
 * @learner lmeng
 * @date 2023/9/14
 * @des
 */
public class Coke extends ColdDrink {

    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 9.0f;
    }
}
