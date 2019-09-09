package Threads;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
public class Assignment_2 extends TimerTask{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		 System.out.println("Timer task started at:"+new Date());
		
	}
	
	public static void main(String args[]){
       Assignment_2 timerTask = new Assignment_2();
        Timer timer = new Timer(true);
        timer.scheduleAtFixedRate(timerTask, 0, 2*1000);
        System.out.println("TimerTask started");
        //cancel after sometime
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        timer.cancel();
        System.out.println("TimerTask cancelled");
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	

}
