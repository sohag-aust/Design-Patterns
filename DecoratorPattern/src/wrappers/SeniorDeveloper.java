package wrappers;

import decorator.DeveloperDecorator;
import developer.Developer;

public class SeniorDeveloper extends DeveloperDecorator {

    public SeniorDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return "Make Code Review Properly";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + ", " + this.makeCodeReview();
    }
}
