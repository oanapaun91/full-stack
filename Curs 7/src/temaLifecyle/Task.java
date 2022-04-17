package temaLifecyle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@Component
//@Scope("prototype")
public class Task {
    private String taskName;
    private Integer taskId;
    private Integer executionTime;
    static int numberOfTasks;


    public void run() {
        try {
            System.out.println("Sleep for " + this.executionTime);
            TimeUnit.SECONDS.sleep(this.executionTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Integer generateID() {
        return new Random().nextInt(1000);
    }

    @PostConstruct
    private void init() {
        System.out.println("init...");
        this.numberOfTasks++;
        this.taskId = generateID();
        this.taskName = "Task" + taskId;
        this.executionTime = new Random().nextInt(20);
        System.out.println("Task creat: " + this.taskName);
    }

    @PreDestroy
    private void destroy() {
        numberOfTasks -= 1;
        System.out.println("Task distrus: " + this.taskName);
    }

}

