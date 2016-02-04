package role02;

/**
 * p.19 규칙 02 빌더패턴 고려하라
 * 빌더패턴!!
 */
public class NutritionFacts3 {
    private final int servingSize;      // (mL)                 *Required
    private final int servings;         // (per container)      *Required
    private final int calories;         //                      Optional
    private final int fat;              // (g)                  Optional
    private final int sodium;           // (mg)                 Optional
    private final int carbohydrate;     // (g)                  Optional

    public static class Builder {

        // 필수인자
        private final int servingSize;
        private final int servings;
        // 선택인자
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;
        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val; return this;
        }

        public Builder fat(int val) {
            fat = val; return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val; return this;
        }

        public Builder sodium(int val) {
            sodium = val; return this;
        }

        public NutritionFacts3 build() {
            return new NutritionFacts3(this);
        }
    }

    private NutritionFacts3(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        carbohydrate = builder.carbohydrate;
        sodium = builder.sodium;
    }

    public static void main(String[] args) {
        NutritionFacts3 cocaCola = new Builder(240, 8)
                .calories(100)
                .sodium(35)
                .carbohydrate(27).build();
    }
}
