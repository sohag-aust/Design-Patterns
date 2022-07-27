package AbstractAirTicketFactory;

import AirLinesFactory.AirAsiaAirLineFactory;
import AirLinesFactory.EmiratesAirLineFactory;
import AirLinesFactory.QatarAirwaysAirLineFactory;
import AirLinesTypes.AirLinesTypes;
import AirTicket.AirTicket;
import AirTicketTypes.AirTicketsTypes;

public class AbstractAirTicketFactory {

    public static AirTicket bookAirLineTicket(AirLinesTypes airLinesTypes, AirTicketsTypes airTicketsTypes) {
        AirTicket airTicket = null;

        switch (airLinesTypes) {
            case AIR_ASIA:
                airTicket = AirAsiaAirLineFactory.bookAirLines(airTicketsTypes);
                break;

            case EMIRATES:
                airTicket = EmiratesAirLineFactory.bookAirLines(airTicketsTypes);
                break;

            case QATAR_AIRWAYS:
                airTicket = QatarAirwaysAirLineFactory.bookAirLines(airTicketsTypes);
                break;
        }

        return airTicket;
    }
}
