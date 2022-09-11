package VehicleType;

import VehicleStrategy.TravelToRailwayStationStrategy;

public class TravelByAuto implements TravelToRailwayStationStrategy {

    @Override
    public void gotoRailwayStation() {
        System.out.println("Ashik is Traveling to the Railway Station by an Auto and will be charged 350 Taka");
    }
}