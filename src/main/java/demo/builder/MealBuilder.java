package demo.builder;

/**
 * @learner lmeng
 * @date 2023/9/14
 * @des
 */
public class MealBuilder {

    //获取蔬菜汉堡套餐
    public Meal getVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    //获取鸡肉汉堡套餐
    public Meal getChickenMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        return meal;
    }
}
