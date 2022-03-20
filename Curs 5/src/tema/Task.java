package tema;

import java.util.Random;
import java.util.concurrent.TimeUnit;

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

   public Integer generateID(){
       return new Random().nextInt(1000);
   }

   private void init(){
       System.out.println("init...");
       this.numberOfTasks ++;
       this.taskId = generateID();
       this.taskName = "Task" + taskId;
       this.executionTime = new Random().nextInt(20);
       System.out.println("Task creat: " + this.taskName);
   }

    private void destroy(){
        numberOfTasks -= 1;
        System.out.println("Task distrus: " + this.taskName);
    }

}
