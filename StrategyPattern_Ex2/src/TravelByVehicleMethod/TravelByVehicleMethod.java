package TravelByVehicleMethod;

import VehicleStrategy.TravelToRailwayStationStrategy;

public class TravelByVehicleMethod {
    private TravelToRailwayStationStrategy travelToRailwayStationStrategy;

    public void setTravelVehicle(TravelToRailwayStationStrategy travelToRailwayStationStrategy) {
        this.travelToRailwayStationStrategy = travelToRailwayStationStrategy;
    }

    public void travelBySelectedVehicle() {
        travelToRailwayStationStrategy.gotoRailwayStation();
    }
}
