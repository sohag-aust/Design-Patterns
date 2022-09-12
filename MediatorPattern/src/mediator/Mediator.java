package mediator;

import colleague.Colleague;

public interface Mediator {
    void addColleague(Colleague colleague);
    void sendMessageToEmployee(String message, Colleague colleague);
}
