package productServer;

import jenkinsPipeline.JenkinsPipeline;

public class Production implements JenkinsPipeline {
    @Override
    public void deployProduct() {
        System.out.println("\n==** Application Deploying @Production Server **==");
    }
}