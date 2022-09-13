package receiverModel;

import receiverActions.Action;

public class Radio implements Action {

    @Override
    public void on() {
        System.out.println("Radio is on");
    }

    @Override
    public void off() {
        System.out.println("Radio is off");
    }

    @Override
    public void setDefaultChannel(String defaultChannel) {
        System.out.println("Radio is set to channel " + defaultChannel);
    }

    @Override
    public void setDefaultVolume(int defaultVolume) {
        System.out.println("Radio is set to volume: " + defaultVolume);
    }
}
