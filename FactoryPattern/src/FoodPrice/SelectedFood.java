package FoodPrice;

public class SelectedFood {

    private String foodName;
    private Double foodPrice;

    public SelectedFood(String foodName, Double foodPrice) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
    }

    public String getFoodName() {
        return foodName;
    }

    public Double getFoodPrice() {
        return foodPrice;
    }

    @Override
    public String toString() {
        return "SelectedFood{" +
                "foodName='" + foodName + '\'' +
                ", foodPrice=" + foodPrice +
                '}';
    }
}
