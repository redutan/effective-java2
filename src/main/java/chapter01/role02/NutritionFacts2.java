package chapter01.role02;

/**
 * p.18 규칙 02 빌더패턴 고려하라
 * 자바빈(JavaBean) 패턴 - 불변(immutable)객체를 만들수가 없다
 * @author myeongju.jung
 */
public class NutritionFacts2 {
    private int servingSize;      // (mL)                 *Required
    private int servings;         // (per container)      *Required
    private int calories;         //                      Optional
    private int fat;              // (g)                  Optional

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    private int sodium;           // (mg)                 Optional
    private int carbohydrate;     // (g)                  Optional

    public NutritionFacts2() {

    }

    public static void main(String[] args) {
        NutritionFacts2 cocaCola = new NutritionFacts2();
        cocaCola.setServingSize(240);
        cocaCola.setServings(8);
        cocaCola.setCalories(100);
        cocaCola.setSodium(35);
        cocaCola.setCarbohydrate(27);
    }
}
