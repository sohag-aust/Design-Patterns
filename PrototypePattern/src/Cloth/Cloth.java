package Cloth;

import ClothTypes.ClothTypes;

public class Cloth {
    private ClothTypes clothType;
    private int clothSKU;

    public ClothTypes getClothType() {
        return clothType;
    }

    public void setClothType(ClothTypes clothType) {
        this.clothType = clothType;
    }

    public int getClothSKU() {
        return clothSKU;
    }

    public void setClothSKU(int clothSKU) {
        this.clothSKU = clothSKU;
    }

    @Override
    public String toString() {
        return "Cloth{" +
                "clothType=" + clothType +
                ", clothSKU=" + clothSKU +
                '}';
    }
}
