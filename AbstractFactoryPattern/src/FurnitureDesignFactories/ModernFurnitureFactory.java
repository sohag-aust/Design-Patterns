package FurnitureDesignFactories;

import Furniture.Furniture;
import FurnitureModels.Chair;
import FurnitureModels.CoffeeTable;
import FurnitureModels.Sofa;
import FurnitureDesign.FurnitureDesign;
import FurnitureType.FurnitureType;

public class ModernFurnitureFactory {
    public static Furniture buildModernFurniture(FurnitureType furnitureType) {
        Furniture furniture = null;

        switch (furnitureType) {
            case SOFA:
                furniture = new Sofa(FurnitureDesign.MODERN);
                break;

            case CHAIR:
                furniture = new Chair(FurnitureDesign.MODERN);
                break;

            case COFFEE_TABLE:
                furniture = new CoffeeTable(FurnitureDesign.MODERN);
                break;
        }

        return furniture;
    }
}
