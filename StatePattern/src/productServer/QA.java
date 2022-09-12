package productServer;

import jenkinsPipeline.JenkinsPipeline;

public class QA implements JenkinsPipeline {
    @Override
    public void deployProduct() {
        System.out.println("\n==** Application Deploying @QA Server **==");
    }
}