package productServer;

import jenkinsPipeline.JenkinsPipeline;

public class Dev implements JenkinsPipeline {
    @Override
    public void deployProduct() {
        System.out.println("\n==** Application Deployed @Dev Server **==");
    }
}
