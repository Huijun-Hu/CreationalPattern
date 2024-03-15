package MacronutrientMeal;

import java.util.*;

public class FatFactory extends Macronutrient{

    private static FatFactory instance = null;
    private String[] fats = {"Avocado", "Sour Cream", "Tuna", "Peanuts"};
    private FatFactory(){};

    public static FatFactory getInstance(){
        if(instance == null){
            instance = new FatFactory();
        }
        return instance;
    }

    @Override
    String generateFood(String dietPlan){

        List<String> fatList = new ArrayList<>(Arrays.asList(fats));

        switch(dietPlan){
            case "Paleo" : 
                fatList.remove("Sour Cream");
                break;
            case "Vegan" : 
                fatList.remove("Sour Cream");
                fatList.remove("Tuna");
                break;
            case "Nut Allergy":
                fatList.remove("Peanuts");
                break;
        }

        return fatList.get(new Random().nextInt(fatList.size()));
    }
}
