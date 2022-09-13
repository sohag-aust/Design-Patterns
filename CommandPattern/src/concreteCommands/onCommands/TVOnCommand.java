package concreteCommands.onCommands;

import command.Command;
import receiverModel.TV;

public class TVOnCommand implements Command {

    private TV tv;

    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        this.tv.on();
        this.tv.setDefaultChannel("Peace TV");
        this.tv.setDefaultVolume(25);
    }
}
