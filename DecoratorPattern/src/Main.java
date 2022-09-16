import baseModel.JavaDeveloper;
import developer.Developer;
import wrappers.JuniorDeveloper;
import wrappers.SeniorDeveloper;
import wrappers.TeamLead;

public class Main {
    public static void main(String[] args) {
        Developer developer = new JavaDeveloper();

        Developer juniorDeveloper = new JuniorDeveloper(developer);
        System.out.println("Junior Java Developer Wrapper : " + juniorDeveloper.makeJob());

        Developer seniorDeveloper = new SeniorDeveloper(juniorDeveloper);
        System.out.println("Senior Java Developer Wrapper : " + seniorDeveloper.makeJob());

        Developer teamLead = new TeamLead(seniorDeveloper);
        System.out.println("Java Team Lead Wrapper : " + teamLead.makeJob());

        // if we want to see teamLead role directly
        Developer wrapperTeamLead = new TeamLead(new SeniorDeveloper(new JuniorDeveloper(new JavaDeveloper())));
        System.out.println("Direct Team Lead Wrapper : " + wrapperTeamLead.makeJob());
    }
}