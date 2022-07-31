import TravelByVehicleMethod.TravelByVehicleMethod;
import VehicleFactory.VehicleFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("==** Choose a vehicle for traveling to Railway Station: ");

        String selectedVehicle = sc.nextLine();

        /** we are going to implement STRATEGY_PATTERN with FACTORY_METHOD_PATTERN,
         * by using these, we don't need to check conditionally inside client code, (assume main class is our client code)
        */

        TravelByVehicleMethod travelByVehicleMethod = new TravelByVehicleMethod();
        VehicleFactory vehicleFactory = new VehicleFactory();

        travelByVehicleMethod.setTravelVehicle(vehicleFactory.getSelectedTravelVehicle(selectedVehicle));
        travelByVehicleMethod.travelBySelectedVehicle();
    }
}