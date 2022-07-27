package FurnitureModels;

import Furniture.Furniture;
import FurnitureDesign.FurnitureDesign;
import FurnitureType.FurnitureType;

public class CoffeeTable extends Furniture {

    private FurnitureDesign furnitureDesign;

    public CoffeeTable(FurnitureDesign furnitureDesign) {
        super(FurnitureType.COFFEE_TABLE, furnitureDesign);
    }

    @Override
    public void construct() {
        System.out.println("** Constructing Your " + getFurnitureType() + " of design " + getFurnitureOrigin());
    }
}