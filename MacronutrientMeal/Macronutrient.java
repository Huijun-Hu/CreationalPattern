package MacronutrientMeal;

public abstract class Macronutrient {

    abstract String generateFood(String dietPlan);
   
    static String createMeal(String customerName, String dietPlan){
        return String.format("\nCostomer name: %s\nCoustomer diet plan: %s\nMeal: %s %s %s", customerName, dietPlan,
         CarbFactory.getInstance().generateFood(dietPlan),
         ProteinFactory.getInstance().generateFood(dietPlan),
         FatFactory.getInstance().generateFood(dietPlan));
    }
}
