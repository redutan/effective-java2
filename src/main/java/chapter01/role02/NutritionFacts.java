package chapter01.role02;

/**
 * p.16 규칙 02 빌더패턴 고려하라
 * 점층적 생성자 패턴 - 더 많은 인자 개수에 잘 적응하지 못한다.
 * @author myeongju.jung
 */
public class NutritionFacts {
    private final int servingSize;      // (mL)                 *Required
    private final int servings;         // (per container)      *Required
    private final int calories;         //                      Optional
    private final int fat;              // (g)                  Optional
    private final int sodium;           // (mg)                 Optional
    private final int carbohydrate;     // (g)                  Optional

    public NutritionFacts(int servingSize, int servings) {
        this(servingSize, servings, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium,
                          int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }

    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts(240, 8, 100, 3, 35, 27);
    }
}
