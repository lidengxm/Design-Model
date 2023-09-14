package demo.builder;

/**
 * @learner lmeng
 * @date 2023/9/14
 * @des
 */
public abstract class ColdDrink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
