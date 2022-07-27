package AirTicketsFactory;

import AirLinesTypes.AirLinesTypes;
import AirTicket.AirTicket;
import AirTicketTypes.AirTicketsTypes;

public class FirstClassAirTicketFactory extends AirTicket {

    public FirstClassAirTicketFactory(AirLinesTypes airLinesTypes) {
        super(AirTicketsTypes.FIRST_CLASS, airLinesTypes);
    }

    @Override
    public void bookTicket() {
        System.out.println("** Booking Your " + getAirTicketsTypes() + " ticket of airlines " + getAirLinesTypes());
    }
}