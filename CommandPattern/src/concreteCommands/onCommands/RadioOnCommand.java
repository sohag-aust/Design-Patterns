package concreteCommands.onCommands;

import command.Command;
import receiverModel.Radio;

public class RadioOnCommand implements Command {

    private Radio radio;

    public RadioOnCommand(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        this.radio.on();
        this.radio.setDefaultChannel("BBC");
        this.radio.setDefaultVolume(12);
    }
}
