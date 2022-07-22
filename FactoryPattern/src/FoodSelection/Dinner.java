package FoodSelection;

import Food.Food;
import FoodPrice.SelectedFood;

import java.util.List;
import java.util.Random;

public class Dinner extends Food {

    private List<SelectedFood> dinnerItems = List.of(
            new SelectedFood("Burritos", 55.0),
            new SelectedFood("Fajitas", 99.0),
            new SelectedFood("Burgers", 253.0)
    );

    @Override
    public void makeFood() {
        Random randomBreakfastItem = new Random();
        SelectedFood selectedFood = dinnerItems.get(randomBreakfastItem.nextInt(dinnerItems.size()));

        setFoodName(selectedFood.getFoodName());
        setFoodRate(selectedFood.getFoodPrice());
    }
}
