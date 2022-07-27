package FurnitureDesignFactories;

import Furniture.Furniture;
import FurnitureModels.Chair;
import FurnitureModels.CoffeeTable;
import FurnitureModels.Sofa;
import FurnitureDesign.FurnitureDesign;
import FurnitureType.FurnitureType;

public class MughalFurnitureFactory {
    public static Furniture buildMughalFurniture(FurnitureType furnitureType) {
        Furniture furniture = null;

        switch (furnitureType) {
            case SOFA:
                furniture = new Sofa(FurnitureDesign.MUGHAL);
                break;

            case CHAIR:
                furniture = new Chair(FurnitureDesign.MUGHAL);
                break;

            case COFFEE_TABLE:
                furniture = new CoffeeTable(FurnitureDesign.MUGHAL);
                break;
        }

        return furniture;
    }
}
