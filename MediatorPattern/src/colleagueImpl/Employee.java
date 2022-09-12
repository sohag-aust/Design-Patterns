package colleagueImpl;

import colleague.Colleague;
import mediator.Mediator;

public class Employee extends Colleague {
    public Employee(Mediator mediator, String colleagueName) {
        super(mediator, colleagueName);
    }

    @Override
    public void sendMessageToSkypeGroup(String message) {
        System.out.println(this.colleagueName + ": sending message = " + message);
        mediator.sendMessageToEmployee(message, this);
    }

    @Override
    public void receiveMessageFromSkypeGroup(String message) {
        System.out.println(this.colleagueName + ": received message = " + message);
    }
}
