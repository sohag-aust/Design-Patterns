import concreteObservable.WeatherStation;
import concreteObservers.ComputerScreen;
import concreteObservers.PhoneScreen;
import observers.Observer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer phoneScreenObserver = new PhoneScreen();
        Observer computerScreenObserver = new ComputerScreen();

        weatherStation.registerObserver(phoneScreenObserver);
        weatherStation.registerObserver(computerScreenObserver);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("==** Press: 1 to continue **==");
            System.out.println("==** Press: 2 to unregister **==");
            System.out.println("==** Press: 3 to exit **==");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    weatherStation.startCheckingWeather();
                    break;

                case 2:
                    System.out.println("==** Press: 1 to unregister PhoneScreen **==");
                    System.out.println("==** Press: 2 to unregister ComputerScreen **==");

                    int screen = sc.nextInt();

                    if(screen == 1) {
                        weatherStation.unregisterObserver(phoneScreenObserver);
                    } else if(screen == 2) {
                        weatherStation.unregisterObserver(computerScreenObserver);
                    }
                    break;

                case 3:
                    return;
            }
        }
    }
}