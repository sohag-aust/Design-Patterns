import concreteCommands.offCommands.RadioOffCommand;
import concreteCommands.offCommands.TVOffCommand;
import concreteCommands.onCommands.RadioOnCommand;
import concreteCommands.onCommands.TVOnCommand;
import invoker.RemoteControl;
import receiverModel.Radio;
import receiverModel.TV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("==** Press Remote Button **==");
        System.out.println("Press 1 for TV ON");
        System.out.println("Press 2 for TV OFF");
        System.out.println("Press 3 for Radio ON");
        System.out.println("Press 4 for Radio OFF");

        Scanner sc = new Scanner(System.in);

        System.out.print("\nRemote Button: ");
        int choice = sc.nextInt();

        RemoteControl remoteControl = new RemoteControl();
        TV tv = new TV();
        Radio radio = new Radio();

        switch (choice) {
            case 1:
                remoteControl.setCommand(new TVOnCommand(tv));
                break;

            case 2:
                remoteControl.setCommand(new TVOffCommand(tv));
                break;

            case 3:
                remoteControl.setCommand(new RadioOnCommand(radio));
                break;

            case 4:
                remoteControl.setCommand(new RadioOffCommand(radio));
                break;
        }

        remoteControl.pressButton();
    }
}