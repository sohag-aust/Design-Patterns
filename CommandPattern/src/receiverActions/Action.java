package receiverActions;

public interface Action {
    void on();
    void off();
    void setDefaultChannel(String defaultChannel);
    void setDefaultVolume(int defaultVolume);
}
