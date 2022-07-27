import AbstractAirTicketFactory.AbstractAirTicketFactory;
import AirLinesTypes.AirLinesTypes;
import AirTicket.AirTicket;
import AirTicketTypes.AirTicketsTypes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==** Choose AirLine: ");
        String airLine = sc.nextLine();

        System.out.println("==** Choose AirTicket Type: ");
        String ticket = sc.nextLine();

        AirLinesTypes airLinesTypes = AirLinesTypes.valueOf(airLine.toUpperCase());
        AirTicketsTypes airTicketsTypes = AirTicketsTypes.valueOf(ticket.toUpperCase());

        AirTicket airTicket = AbstractAirTicketFactory.bookAirLineTicket(airLinesTypes, airTicketsTypes);
        airTicket.bookTicket();
    }
}