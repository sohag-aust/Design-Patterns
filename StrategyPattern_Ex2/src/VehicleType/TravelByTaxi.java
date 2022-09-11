package VehicleType;

import VehicleStrategy.TravelToRailwayStationStrategy;

public class TravelByTaxi implements TravelToRailwayStationStrategy {

    @Override
    public void gotoRailwayStation() {
        System.out.println("Ashik is Traveling to the Railway Station by a Taxi and will be charged 640 Taka");
    }
}