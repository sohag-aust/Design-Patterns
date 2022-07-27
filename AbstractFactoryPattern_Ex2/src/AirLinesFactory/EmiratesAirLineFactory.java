package AirLinesFactory;

import AirLinesTypes.AirLinesTypes;
import AirTicket.AirTicket;
import AirTicketTypes.AirTicketsTypes;
import AirTicketsFactory.BusinessClassAirTicketFactory;
import AirTicketsFactory.EconomyAirTicketFactory;
import AirTicketsFactory.FirstClassAirTicketFactory;

public class EmiratesAirLineFactory {
    public static AirTicket bookAirLines(AirTicketsTypes airTicketsTypes) {
        AirTicket airTicket = null;

        switch (airTicketsTypes) {
            case ECONOMY:
                airTicket = new EconomyAirTicketFactory(AirLinesTypes.EMIRATES);
                break;

            case BUSINESS_CLASS:
                airTicket = new BusinessClassAirTicketFactory(AirLinesTypes.EMIRATES);
                break;

            case FIRST_CLASS:
                airTicket = new FirstClassAirTicketFactory(AirLinesTypes.EMIRATES);
                break;
        }

        return airTicket;
    }
}
