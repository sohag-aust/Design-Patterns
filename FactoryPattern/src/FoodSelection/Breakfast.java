package FoodSelection;

import Food.Food;
import FoodPrice.SelectedFood;

import java.util.List;
import java.util.Random;

public class Breakfast extends Food {

    private List<SelectedFood> breakfastItems = List.of(
            new SelectedFood("Dim", 10.0),
            new SelectedFood("Alu Bhaji", 15.0),
            new SelectedFood("Ruti", 5.0)
    );

    @Override
    public void makeFood() {
        Random randomBreakfastItem = new Random();
        SelectedFood selectedFood = breakfastItems.get(randomBreakfastItem.nextInt(breakfastItems.size()));

        setFoodName(selectedFood.getFoodName());
        setFoodRate(selectedFood.getFoodPrice());
    }
}
