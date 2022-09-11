package concreteObservers;

import deviceScreen.DeviceScreen;
import observers.Observer;

public class ComputerScreen implements Observer, DeviceScreen {
    @Override
    public void display(Double temperature) {
        System.out.println("== Temperature in Computer Screen: " + temperature);
    }

    @Override
    public void update(Double temperature) {
        display(temperature);
    }
}
