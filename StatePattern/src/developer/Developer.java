package developer;

import context.PipelineContext;
import jenkinsPipeline.JenkinsPipeline;
import productServer.Dev;
import productServer.Production;
import productServer.QA;
import productServer.Stage;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

public class Developer {
    private JenkinsPipeline devPipeline;
    private JenkinsPipeline QAPipeline;
    private JenkinsPipeline stagePipeline;
    private JenkinsPipeline productionPipeline;

    Timer timer;

    PipelineContext pipelineContext = new PipelineContext();

    Queue<JenkinsPipeline> pipelineQueue;
    int progress = 0;

    public Developer() {
        pipelineQueue = new LinkedList<>();

        devPipeline = new Dev();
        QAPipeline = new QA();
        stagePipeline = new Stage();
        productionPipeline = new Production();

        pipelineQueue.add(devPipeline);
        pipelineQueue.add(QAPipeline);
        pipelineQueue.add(stagePipeline);
        pipelineQueue.add(productionPipeline);

        timer = new Timer();
    }

    public JenkinsPipeline getPipeline() {
        return pipelineQueue.poll();
    }

    private void deployProduct() {
        JenkinsPipeline currentPipeline = getPipeline();
        pipelineContext.setJenkinsPipelineState(currentPipeline);
        pipelineContext.deployProduct();

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                progress += 10;
                System.out.println("# Progress : " + progress + "% for " + pipelineContext.getJenkinsPipelineState());

                if(progress >= 100 && !pipelineQueue.isEmpty()) {
                    progress = 0;
                    JenkinsPipeline currentPipeline = getPipeline();
                    pipelineContext.setJenkinsPipelineState(currentPipeline);
                    pipelineContext.deployProduct();

                    try {
                        Thread.sleep(10 * 1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

                if(progress >= 100 && pipelineQueue.isEmpty()) {
                    System.out.println("\n==** Your Product is Successfully Deployed **==");
                    // exit the timer
                    timer.cancel();
                    timer.purge();
                }
            }
        }, 0, 2000);
    }

    public void startProductDeploymentProcess() {
        deployProduct();
    }
}
