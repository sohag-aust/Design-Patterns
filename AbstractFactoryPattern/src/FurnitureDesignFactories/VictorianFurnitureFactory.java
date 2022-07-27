package FurnitureDesignFactories;

import Furniture.Furniture;
import FurnitureModels.Chair;
import FurnitureModels.CoffeeTable;
import FurnitureModels.Sofa;
import FurnitureDesign.FurnitureDesign;
import FurnitureType.FurnitureType;

public class VictorianFurnitureFactory {
    public static Furniture buildVictorianFurniture(FurnitureType furnitureType) {
        Furniture furniture = null;

        switch (furnitureType) {
            case SOFA:
                furniture = new Sofa(FurnitureDesign.VICTORIAN);
                break;

            case CHAIR:
                furniture = new Chair(FurnitureDesign.VICTORIAN);
                break;

            case COFFEE_TABLE:
                furniture = new CoffeeTable(FurnitureDesign.VICTORIAN);
                break;
        }

        return furniture;
    }
}
