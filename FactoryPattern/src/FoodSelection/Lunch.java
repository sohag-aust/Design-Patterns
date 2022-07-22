package FoodSelection;

import Food.Food;
import FoodPrice.SelectedFood;

import java.util.List;
import java.util.Random;

public class Lunch extends Food {

    private List<SelectedFood> lunchItems = List.of(
            new SelectedFood("Goru", 750.0),
            new SelectedFood("Khashi", 863.0),
            new SelectedFood("Murgi", 125.0)
    );
    @Override
    public void makeFood() {
        Random randomBreakfastItem = new Random();
        SelectedFood selectedFood = lunchItems.get(randomBreakfastItem.nextInt(lunchItems.size()));

        setFoodName(selectedFood.getFoodName());
        setFoodRate(selectedFood.getFoodPrice());
    }
}
