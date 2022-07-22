package Food;

public abstract class Food {

    private String foodName;
    private Double foodRate;

    public abstract void makeFood();

    protected void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    protected void setFoodRate(Double foodRate) {
        this.foodRate = foodRate;
    }

    public String getFoodName() {
        return foodName;
    }

    public Double getFoodRate() {
        return foodRate;
    }
}
