package colleague;

import mediator.Mediator;

public abstract class Colleague {
    protected Mediator mediator;
    protected String colleagueName;

    public Colleague(Mediator mediator, String colleagueName) {
        this.mediator = mediator;
        this.colleagueName = colleagueName;
    }

    public Mediator getSkypeGroupChatMediator() {
        return mediator;
    }

    public String getColleagueName() {
        return colleagueName;
    }

    public abstract void sendMessageToSkypeGroup(String message);
    public abstract void receiveMessageFromSkypeGroup(String message);
}
