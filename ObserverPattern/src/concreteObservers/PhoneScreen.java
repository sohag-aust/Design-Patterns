package concreteObservers;

import deviceScreen.DeviceScreen;
import observers.Observer;

public class PhoneScreen implements Observer, DeviceScreen {
    @Override
    public void display(Double temperature) {
        System.out.println("== Temperature in Phone Screen: " + temperature);
    }

    @Override
    public void update(Double temperature) {
        display(temperature);
    }
}
