package demo.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @learner lmeng
 * @date 2023/9/14
 * @des
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getPrice() {
        float price = 0.0f;
        for(Item item : items) {
            price += item.price();
        }
        return price;
    }

    public void showItems() {
        for(Item item : items) {
            System.out.println("Item：" + item.name());
            System.out.println("price：" + item.price());
            System.out.println("packing：" + item.packing().pack());
            System.out.println();
        }
    }

}
