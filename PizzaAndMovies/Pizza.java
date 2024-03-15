package PizzaAndMovies;

import java.util.ArrayList;

public class Pizza{
    public enum Size{
        SMALL,
        MEDIUM,
        LARGE
    }

    enum Topping{
        Pepperoni,
        Sausage,
        Mushrooms,
        Bacon,
        Onions,
        ExtraCheese,
        Peppers,
        Chicken,
        Olives,
        Spinach,
        TomatoAndBasil,
        Beef,
        Ham,
        Pesto,
        SpicyPork,
        HamAndPineapple
    }

    // before purchasing another two pizza chain
    //private String chain = "Pizza hut";
    private String chain;
    private Size size;
    private ArrayList<Topping> toppings;

    public Pizza(String pizzaChain, Size size, ArrayList<Topping> topping){
        this.chain = pizzaChain;
        if (size == null){
            // defual size SMALL
            size = Size.SMALL;
        }else{
            this.size = size;
        }
        this.toppings = topping;
    }

    public String eat(){
        return "\nYou ate a pizza produced in " + this.chain +", with a size of " 
            + this.size + "\nwith " 
            + (this.toppings.size()==0? "no topping" : this.toppings.toString());
    }
    
    public static class PizzaBuilder {
        private String chain;
        private Size size;
        private ArrayList<Topping> toppings = new ArrayList<>();
    
        public PizzaBuilder(){};
    
        public PizzaBuilder setChain(String chain){
            this.chain = chain;
            return this;
        }
        public PizzaBuilder setSize(Size size){
            this.size = size;
            return this;
        }
       
        public PizzaBuilder setTopping(ArrayList<Topping> topping){
            this.toppings = topping;
            return this;
        }
        public Pizza createPizza(){
            return new Pizza(this.chain,this.size,this.toppings);
        }
    }
}