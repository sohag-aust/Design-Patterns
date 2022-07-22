package FoodTypesConstants;

public enum FoodType {

    BREAKFAST("Breakfast"),
    LUNCH("Lunch"),
    DINNER("Dinner");

    private String food;

    FoodType(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }
}
