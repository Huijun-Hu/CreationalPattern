package PizzaAndMovies;

import java.util.ArrayList;
import java.util.Arrays;

import PizzaAndMovies.Pizza.Size;
import PizzaAndMovies.Pizza.Topping;

public class Driver {
    public static void main(String[] args) {
        Pizza p1 = new Pizza.PizzaBuilder().setChain("Pizza Hut").
            setSize(Size.SMALL).
            setTopping(new ArrayList<Topping>(Arrays.asList(Topping.Bacon,Topping.Pepperoni,Topping.TomatoAndBasil))).
            createPizza();
        Pizza p2 = new Pizza.PizzaBuilder().setChain("Pizza Hut").
            setSize(Size.MEDIUM).setTopping(new ArrayList<Topping>(
            Arrays.asList(Topping.HamAndPineapple,Topping.Sausage,Topping.SpicyPork,
            Topping.ExtraCheese,Topping.Mushrooms,Topping.Spinach)))
            .createPizza();
        Pizza p3 = new Pizza.PizzaBuilder().setChain("Pizza Hut").
            setSize(Size.LARGE).
            setTopping(new ArrayList<Topping>(Arrays.asList(Topping.Mushrooms,Topping.Onions,Topping.Spinach,
            Topping.TomatoAndBasil,Topping.Pesto,Topping.Chicken,
            Topping.Ham,Topping.Peppers,Topping.ExtraCheese))).
        createPizza();

        System.out.println(p1.eat());
        System.out.println(p2.eat());
        System.out.println(p3.eat());
        
        Pizza p5 = new Pizza.PizzaBuilder().setChain("Pizza Hut").
            setSize(Size.LARGE).setTopping(new ArrayList<Topping>(Arrays.asList(Topping.HamAndPineapple,
            Topping.Chicken,Topping.Spinach))).
        createPizza();

        Pizza p6 = new Pizza.PizzaBuilder().setChain("Pizza Hut").
            setSize(Size.SMALL).
            setTopping(new ArrayList<Topping>(Arrays.asList(Topping.Onions,Topping.ExtraCheese))).
        createPizza();

        Pizza l1 = new Pizza.PizzaBuilder().setChain("Little Caesars").
            setSize(Size.MEDIUM).setTopping(new ArrayList<Topping>(Arrays.asList(Topping.HamAndPineapple,
            Topping.Sausage,Topping.SpicyPork,Topping.ExtraCheese,Topping.Mushrooms,
            Topping.TomatoAndBasil,Topping.Pesto,Topping.Spinach))).
        createPizza();

        Pizza l2 = new Pizza.PizzaBuilder().setChain("Little Caesars").
            setSize(Size.SMALL).setTopping(new ArrayList<Topping>(Arrays.asList(Topping.Bacon,
            Topping.HamAndPineapple,Topping.Chicken,Topping.Olives,Topping.Beef,
            Topping.ExtraCheese))).
        createPizza();

        Pizza d1 = new Pizza.PizzaBuilder().setChain("Dominos").
            setSize(Size.SMALL).setTopping(new ArrayList<Topping>(Arrays.asList(Topping.Beef))).
        createPizza();

        Pizza d2 = new Pizza.PizzaBuilder().setChain("Dominos").
            setSize(Size.LARGE).setTopping(new ArrayList<Topping>(Arrays.asList(Topping.Chicken,
            Topping.Peppers,Topping.ExtraCheese))).
        createPizza();

        System.out.println(p5.eat());
        System.out.println(p6.eat());
        System.out.println(l1.eat());
        System.out.println(l2.eat());
        System.out.println(d1.eat());
        System.out.println(d2.eat());
    }
}
