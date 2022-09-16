package wrappers;

import decorator.DeveloperDecorator;
import developer.Developer;

public class JuniorDeveloper extends DeveloperDecorator {
    public JuniorDeveloper(Developer developer) {
        super(developer);
    }

    @Override
    public String makeJob() {
        return super.makeJob();
    }
}
