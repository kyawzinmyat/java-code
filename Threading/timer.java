import java.util.Timer;
import java.util.TimerTask;
import java.util.Calendar;

public class Main {
	public static void main(String[] args) {
		Timer timer = new Timer();
		TimerTask tt = new TimerTask(){
				@Override
				public void run(){
						System.out.println("Mission complete");
					}
				
			};
			
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR,2021);
		cal.set(Calendar.MONTH,Calendar.DECEMBER);
		cal.set(Calendar.DAY_OF_MONTH,8);
		cal.set(Calendar.HOUR_OF_DAY,4);
		cal.set(Calendar.MINUTE,20);
		cal.set(Calendar.SECOND,0);
		cal.set(Calendar.MILLISECOND,0);	
		System.out.println(cal.getTime());	
		timer.schedule(tt,cal.getTime());
	}
}