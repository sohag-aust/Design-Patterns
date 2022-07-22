import Food.Food;
import FoodFactoryManager.FoodFactoryManager;
import FoodPrice.SelectedFood;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("==** Please enter you food type: ");

        String foodType = sc.nextLine();

        FoodFactoryManager foodFactoryManager = new FoodFactoryManager();
        Food food = foodFactoryManager.getPreparedFood(foodType);
        food.makeFood();

        SelectedFood selectedFood = new SelectedFood(food.getFoodName(), food.getFoodRate());
        System.out.println(selectedFood);
    }
}