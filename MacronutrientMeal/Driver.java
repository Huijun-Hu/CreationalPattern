package MacronutrientMeal;

public class Driver {
    public static void main(String[] args) {
        System.out.println(Macronutrient.createMeal("Perry", "No Restriction"));
        System.out.println(Macronutrient.createMeal("Jerry", "Paleo"));

        System.out.println(Macronutrient.createMeal("Mary", "Vegan"));
        System.out.println(Macronutrient.createMeal("Burry", "Nut Allergy"));

        System.out.println(Macronutrient.createMeal("Henry", "No Restriction"));
        System.out.println(Macronutrient.createMeal("Harry", "Vegan"));

    }
}
