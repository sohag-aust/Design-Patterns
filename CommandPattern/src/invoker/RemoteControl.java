package invoker;

import command.Command;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        this.command.execute();
    }
}
