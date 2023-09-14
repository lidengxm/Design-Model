package demo.builder;

/**
 * @learner lmeng
 * @date 2023/9/14
 * @des
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
