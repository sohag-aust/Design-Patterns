package FoodFactoryManager;

import Food.Food;
import FoodSelection.Breakfast;
import FoodSelection.Dinner;
import FoodSelection.Lunch;
import FoodTypesConstants.FoodType;

public class FoodFactoryManager {

    Food food = null;

    public Food getPreparedFood(String foodType) {
        System.out.println("==** FoodType: " + foodType);

        if(foodType.equalsIgnoreCase(FoodType.BREAKFAST.getFood())) {
            System.out.println("==** Your Breakfast is Preparing **==");
            food = new Breakfast();
        } else if(foodType.equalsIgnoreCase(FoodType.LUNCH.getFood())) {
            System.out.println("==** Your Lunch is Preparing **==");
            food = new Lunch();
        } else if(foodType.equalsIgnoreCase(FoodType.DINNER.getFood())) {
            System.out.println("==** Your Dinner is Preparing **==");
            food = new Dinner();
        }
        return food;
    }
}
