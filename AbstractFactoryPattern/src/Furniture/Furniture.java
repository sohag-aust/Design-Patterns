package Furniture;

import FurnitureDesign.FurnitureDesign;
import FurnitureType.FurnitureType;

public abstract class Furniture {
    private FurnitureType furnitureType;
    private FurnitureDesign furnitureDesign;

    public Furniture(FurnitureType furnitureType, FurnitureDesign furnitureDesign) {
        this.furnitureType = furnitureType;
        this.furnitureDesign = furnitureDesign;
    }

    public abstract void construct();

    public FurnitureDesign getFurnitureOrigin() {
        return furnitureDesign;
    }

    public void setFurnitureOrigin(FurnitureDesign furnitureDesign) {
        this.furnitureDesign = furnitureDesign;
    }

    public FurnitureType getFurnitureType() {
        return furnitureType;
    }

    public void setFurnitureType(FurnitureType furnitureType) {
        this.furnitureType = furnitureType;
    }
}
