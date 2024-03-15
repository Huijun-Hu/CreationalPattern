package MacronutrientMeal;

import java.util.*;

public class CarbFactory extends Macronutrient{
    private static CarbFactory instance = null;
    private String[] carbs = {"Cheese", "Bread", "Lentils", "Pistachio"};

    private CarbFactory(){};

    public static CarbFactory getInstance(){
        if(instance == null){
            instance = new CarbFactory();
        }
        return instance;
    }

    @Override
    String generateFood(String dietPlan){

        List<String> carbsList = new ArrayList<>(Arrays.asList(carbs));

        switch(dietPlan){
            case "Paleo": 
                return "Pistachio";
            case "Vegan":
                carbsList.remove("Cheese");
                break;
            case "Nut Allergy":
                carbsList.remove("Pistachio");
                break;
        }

        return carbsList.get(new Random().nextInt(carbsList.size()));
    } 
}
