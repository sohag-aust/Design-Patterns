package AirLinesFactory;

import AirLinesTypes.AirLinesTypes;
import AirTicket.AirTicket;
import AirTicketTypes.AirTicketsTypes;
import AirTicketsFactory.BusinessClassAirTicketFactory;
import AirTicketsFactory.EconomyAirTicketFactory;
import AirTicketsFactory.FirstClassAirTicketFactory;

public class QatarAirwaysAirLineFactory {

    public static AirTicket bookAirLines(AirTicketsTypes airTicketsTypes) {
        AirTicket airTicket = null;

        switch (airTicketsTypes) {
            case ECONOMY:
                airTicket = new EconomyAirTicketFactory(AirLinesTypes.QATAR_AIRWAYS);
                break;

            case BUSINESS_CLASS:
                airTicket = new BusinessClassAirTicketFactory(AirLinesTypes.QATAR_AIRWAYS);
                break;

            case FIRST_CLASS:
                airTicket = new FirstClassAirTicketFactory(AirLinesTypes.QATAR_AIRWAYS);
                break;
        }

        return airTicket;
    }
}
