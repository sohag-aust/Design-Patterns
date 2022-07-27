package FurnitureFactory;

import Furniture.Furniture;
import FurnitureDesign.FurnitureDesign;
import FurnitureDesignFactories.ModernFurnitureFactory;
import FurnitureDesignFactories.MughalFurnitureFactory;
import FurnitureDesignFactories.VictorianFurnitureFactory;
import FurnitureType.FurnitureType;

public class FurnitureFactory {
    public static Furniture buildFurniture(FurnitureDesign furnitureDesign, FurnitureType furnitureType) {
        Furniture furniture = null;

        switch (furnitureDesign) {
            case MODERN:
                furniture = ModernFurnitureFactory.buildModernFurniture(furnitureType);
                break;

            case MUGHAL:
                furniture = MughalFurnitureFactory.buildMughalFurniture(furnitureType);
                break;

            case VICTORIAN:
                furniture = VictorianFurnitureFactory.buildVictorianFurniture(furnitureType);
                break;
        }

        return furniture;
    }
}
