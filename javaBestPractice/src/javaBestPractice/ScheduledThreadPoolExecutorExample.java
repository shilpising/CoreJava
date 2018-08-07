package javaBestPractice;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
class TaskSchedule implements Runnable
{
    private String name;
 
    public TaskSchedule(String name) {
        this.name = name;
    }
     
    public String getName() {
        return name;
    }
 
    @Override
    public void run()
    {
        try {
            System.out.println("Doing a task during : " + name + " - Time - " + new Date());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
public class ScheduledThreadPoolExecutorExample {

	public static void main(String[] args)
    {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        TaskSchedule task1 = new TaskSchedule ("Demo Task 1");
         
        System.out.println("The time is : " + new Date());
         
        ScheduledFuture<?> result = executor.scheduleAtFixedRate(task1, 2, 5, TimeUnit.SECONDS);
         
        try {
            TimeUnit.MILLISECONDS.sleep(20000);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
         
        executor.shutdown();
    }
}
