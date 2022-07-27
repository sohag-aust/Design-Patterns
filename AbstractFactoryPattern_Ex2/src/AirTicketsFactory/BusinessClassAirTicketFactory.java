package AirTicketsFactory;

import AirLinesTypes.AirLinesTypes;
import AirTicket.AirTicket;
import AirTicketTypes.AirTicketsTypes;

public class BusinessClassAirTicketFactory extends AirTicket {

    public BusinessClassAirTicketFactory(AirLinesTypes airLinesTypes) {
        super(AirTicketsTypes.BUSINESS_CLASS, airLinesTypes);
    }

    @Override
    public void bookTicket() {
        System.out.println("** Booking Your " + getAirTicketsTypes() + " ticket of airlines " + getAirLinesTypes());
    }
}
