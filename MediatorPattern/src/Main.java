import colleague.Colleague;
import colleagueImpl.Employee;
import mediator.Mediator;
import mediatorImpl.SkypeGroupChatMediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new SkypeGroupChatMediator();

        // registering new employee to the company group
        Colleague employee1 = new Employee(mediator, "Rahim");
        Colleague employee2 = new Employee(mediator, "Karim");
        Colleague employee3 = new Employee(mediator, "Jamal");
        Colleague employee4 = new Employee(mediator, "Abir");
        Colleague employee5 = new Employee(mediator, "Shohag");

        // registering new employee to the skype group
        mediator.addColleague(employee1);
        mediator.addColleague(employee2);
        mediator.addColleague(employee3);
        mediator.addColleague(employee4);
        mediator.addColleague(employee5);

        employee1.sendMessageToSkypeGroup("Starting Juhor Salat, Please all come to Prayer Room");
    }
}