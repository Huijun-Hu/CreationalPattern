package MacronutrientMeal;

import java.util.*;

public class ProteinFactory extends Macronutrient{
    private static ProteinFactory instance = null;
    private String[] proteins = {"Fish", "Chicken", "Beef", "Tofu"};

    private ProteinFactory(){};

    public static ProteinFactory getInstance(){
        if(instance == null){
            instance = new ProteinFactory();
        }
        return instance;
    }

    @Override
    String generateFood(String dietPlan){

        List<String> proteinList = new ArrayList<>(Arrays.asList(proteins));

        switch(dietPlan){
            case "Paleo": 
                proteinList.remove("Tofu");
                break;
            case "Vegan":
                return "Tofu";
                
        }

        return proteinList.get(new Random().nextInt(proteinList.size()));
    }

    
}
