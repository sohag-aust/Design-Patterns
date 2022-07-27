package FurnitureModels;

import Furniture.Furniture;
import FurnitureDesign.FurnitureDesign;
import FurnitureType.FurnitureType;

public class Sofa extends Furniture {

    private FurnitureDesign furnitureDesign;

    public Sofa(FurnitureDesign furnitureDesign) {
        super(FurnitureType.SOFA, furnitureDesign);
    }

    @Override
    public void construct() {
        System.out.println("** Constructing Your " + getFurnitureType() + " of design " + getFurnitureOrigin());
    }
}

