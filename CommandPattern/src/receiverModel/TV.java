package receiverModel;

import receiverActions.Action;

public class TV implements Action {

    @Override
    public void on() {
        System.out.println("TV is on");
    }

    @Override
    public void off() {
        System.out.println("TV is off");
    }

    @Override
    public void setDefaultChannel(String defaultChannel) {
        System.out.println("TV is set to channel " + defaultChannel);
    }

    @Override
    public void setDefaultVolume(int defaultVolume) {
        System.out.println("TV is set to volume " + defaultVolume);
    }
}
