package VehicleFactory;

import VehicleNames.TravelVehicleNames;
import VehicleStrategy.TravelToRailwayStationStrategy;
import VehicleType.TravelByAuto;
import VehicleType.TravelByBus;
import VehicleType.TravelByTaxi;

public class VehicleFactory {
    private TravelToRailwayStationStrategy travelToRailwayStationStrategy;

    public TravelToRailwayStationStrategy getSelectedTravelVehicle(String vehicleType) {
        TravelVehicleNames travelVehicleNames = TravelVehicleNames.valueOf(vehicleType.toUpperCase());

        switch (travelVehicleNames) {
            case BUS:
                travelToRailwayStationStrategy = new TravelByBus();
                break;

            case AUTO:
                travelToRailwayStationStrategy = new TravelByAuto();
                break;

            case TAXI:
                travelToRailwayStationStrategy = new TravelByTaxi();
                break;
        }

        return travelToRailwayStationStrategy;
    }
}
