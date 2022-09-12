package productServer;

import jenkinsPipeline.JenkinsPipeline;

public class Stage implements JenkinsPipeline {
    @Override
    public void deployProduct() {
        System.out.println("\n==** Application Deployed @Stage Server **==");
    }
}