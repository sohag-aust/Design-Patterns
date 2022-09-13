import burgerMakingTemplate.Burger;
import burgers.BeefBurger;
import burgers.ChickenBurger;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n==** Making Chicken Burger **==");
        Burger chickenBurger = new ChickenBurger();
        chickenBurger.makeBurger("Brioche buns", "Chicken", false);

        System.out.println("\n==** Making Beef Burger **==");
        Burger beefBurger = new BeefBurger();
        beefBurger.makeBurger("Sesame seed buns", "Beef", true);
    }
}