package context;

import jenkinsPipeline.JenkinsPipeline;

public class PipelineContext implements JenkinsPipeline {
    private JenkinsPipeline jenkinsPipeline;

    public JenkinsPipeline getJenkinsPipelineState() {
        return jenkinsPipeline;
    }

    public void setJenkinsPipelineState(JenkinsPipeline jenkinsPipeline) {
        this.jenkinsPipeline = jenkinsPipeline;
    }

    @Override
    public void deployProduct() {
        this.jenkinsPipeline.deployProduct();
    }
}
