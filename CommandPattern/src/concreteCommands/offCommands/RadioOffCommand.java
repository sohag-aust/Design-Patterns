package concreteCommands.offCommands;

import command.Command;
import receiverModel.Radio;

public class RadioOffCommand implements Command {

    private Radio radio;

    public RadioOffCommand(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        this.radio.off();
    }
}
