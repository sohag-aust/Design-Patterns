package FurnitureModels;

import Furniture.Furniture;
import FurnitureDesign.FurnitureDesign;
import FurnitureType.FurnitureType;

public class Chair extends Furniture {

    private FurnitureDesign furnitureDesign;

    public Chair(FurnitureDesign furnitureDesign) {
        super(FurnitureType.CHAIR, furnitureDesign);
    }

    @Override
    public void construct() {
        System.out.println("** Constructing Your " + getFurnitureType() + " of design " + getFurnitureOrigin());
    }
}
