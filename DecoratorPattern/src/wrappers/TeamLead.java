package wrappers;

import decorator.DeveloperDecorator;
import developer.Developer;

public class TeamLead extends DeveloperDecorator {

    public TeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport() {
        return "Send week report to Client";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + ", " + this.sendWeekReport();
    }
}