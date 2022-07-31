package VehicleType;

import VehicleStrategy.TravelToRailwayStationStrategy;

public class TravelByBus implements TravelToRailwayStationStrategy {

    @Override
    public void gotoRailwayStation() {
        System.out.println("Ashik is Traveling to the Railway Station by a Bus and will be charged 65 Taka");
    }
}
