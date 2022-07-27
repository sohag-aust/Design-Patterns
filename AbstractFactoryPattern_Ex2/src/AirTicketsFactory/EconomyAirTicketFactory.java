package AirTicketsFactory;

import AirLinesTypes.AirLinesTypes;
import AirTicket.AirTicket;
import AirTicketTypes.AirTicketsTypes;

public class EconomyAirTicketFactory extends AirTicket {

    public EconomyAirTicketFactory(AirLinesTypes airLinesTypes) {
        super(AirTicketsTypes.ECONOMY, airLinesTypes);
    }

    @Override
    public void bookTicket() {
        System.out.println("** Booking Your " + getAirTicketsTypes() + " ticket of airlines " + getAirLinesTypes());
    }
}