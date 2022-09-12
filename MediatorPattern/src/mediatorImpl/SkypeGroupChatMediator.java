package mediatorImpl;

import colleague.Colleague;
import mediator.Mediator;

import java.util.ArrayList;
import java.util.List;

public class SkypeGroupChatMediator implements Mediator {
    private List<Colleague> colleagues;

    public SkypeGroupChatMediator() {
        this.colleagues = new ArrayList<>();
    }

    @Override
    public void addColleague(Colleague colleague) {
        this.colleagues.add(colleague);
    }

    @Override
    public void sendMessageToEmployee(String message, Colleague colleague) {
        for(Colleague colleague1 : colleagues) {
            if(!colleague1.getColleagueName().equalsIgnoreCase(colleague.getColleagueName())) {
                colleague1.receiveMessageFromSkypeGroup(message);
            }
        }
    }
}
