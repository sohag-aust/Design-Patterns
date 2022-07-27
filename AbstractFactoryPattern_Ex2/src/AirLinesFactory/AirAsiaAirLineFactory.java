package AirLinesFactory;

import AirLinesTypes.AirLinesTypes;
import AirTicket.AirTicket;
import AirTicketTypes.AirTicketsTypes;
import AirTicketsFactory.BusinessClassAirTicketFactory;
import AirTicketsFactory.EconomyAirTicketFactory;
import AirTicketsFactory.FirstClassAirTicketFactory;

public class AirAsiaAirLineFactory {

    public static AirTicket bookAirLines(AirTicketsTypes airTicketsTypes) {
        AirTicket airTicket = null;

        switch (airTicketsTypes) {
            case ECONOMY:
                airTicket = new EconomyAirTicketFactory(AirLinesTypes.AIR_ASIA);
                break;

            case BUSINESS_CLASS:
                airTicket = new BusinessClassAirTicketFactory(AirLinesTypes.AIR_ASIA);
                break;

            case FIRST_CLASS:
                airTicket = new FirstClassAirTicketFactory(AirLinesTypes.AIR_ASIA);
                break;
        }

        return airTicket;
    }
}
