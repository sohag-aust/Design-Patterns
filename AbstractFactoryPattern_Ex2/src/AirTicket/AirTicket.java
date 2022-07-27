package AirTicket;

import AirLinesTypes.AirLinesTypes;
import AirTicketTypes.AirTicketsTypes;

public abstract class AirTicket {

    private AirLinesTypes airLinesTypes;
    private AirTicketsTypes airTicketsTypes;

    public AirTicket(AirTicketsTypes airTicketsTypes, AirLinesTypes airLinesTypes) {
        this.airTicketsTypes = airTicketsTypes;
        this.airLinesTypes = airLinesTypes;
    }

    public abstract void bookTicket();

    public AirLinesTypes getAirLinesTypes() {
        return airLinesTypes;
    }

    public AirTicketsTypes getAirTicketsTypes() {
        return airTicketsTypes;
    }
}
