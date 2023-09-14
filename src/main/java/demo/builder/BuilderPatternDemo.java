package demo.builder;

/**
 * @learner lmeng
 * @date 2023/9/14
 * @des 建造者模式启动类
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        System.out.println("======================蔬菜汉堡信息================");
        Meal vegMeal = mealBuilder.getVegMeal();
        System.out.println(vegMeal);
        vegMeal.showItems();

        System.out.println("========================鸡肉汉堡信息====================");
        Meal chickenMeal = mealBuilder.getChickenMeal();
        System.out.println(chickenMeal);
        chickenMeal.showItems();

    }
}
