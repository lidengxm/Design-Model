package demo.builder;

/**
 * @learner lmeng
 * @date 2023/9/14
 * @des 物品接口
 */
public interface Item {

    public String name();

    public Packing packing();

    public float price();
}
