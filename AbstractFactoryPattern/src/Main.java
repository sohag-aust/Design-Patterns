import Furniture.Furniture;
import FurnitureDesign.FurnitureDesign;
import FurnitureFactory.FurnitureFactory;
import FurnitureType.FurnitureType;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==** Choose Furniture Design: ");
        String designName = sc.nextLine();

        System.out.println("==** Choose Furniture Type: ");
        String type = sc.nextLine();

        FurnitureDesign furnitureDesign = FurnitureDesign.valueOf(designName.toUpperCase());
        FurnitureType furnitureType = FurnitureType.valueOf(type.toUpperCase());

        Furniture furniture = FurnitureFactory.buildFurniture(furnitureDesign, furnitureType);
        furniture.construct();
    }
}