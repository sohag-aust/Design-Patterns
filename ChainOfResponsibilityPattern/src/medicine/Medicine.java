package medicine;

public class Medicine {
    private String medicineName;
    private int quantity;

    public Medicine(String medicineName, int quantity) {
        this.medicineName = medicineName;
        this.quantity = quantity;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public int getQuantity() {
        return quantity;
    }
}