public class Main {
	public static void main(String[] args) {


		CThread thread = new CThread();
		CTask task = new CTask();


		System.out.println("Main thread is started ");


		for (int doc = 0; doc < 10; doc++) {
			
				System.out.println("Main / " + doc);
			


		}
		//thread.start();
		//task.execute();
		
		CRunnable cr = new CRunnable();
		Thread nThread = new Thread(cr);
		nThread.start();

		System.out.println("Main thread is stopped ");

	}
}


class CThread extends Thread {
	public void run() {
		for (int doc = 0; doc < 10; doc++) {
			System.out.println("Custom Thread / " + doc);
		}
	}
}


class CTask {
	public void execute() {
		for (int doc = 0; doc < 10; doc++) {
			System.out.println("Custom Task / " + doc);
		}
	}
}


class CRunnable implements Runnable{
		public void run(){
				for(int doc=0;doc<10;doc++){
				System.out.println("Runnable / "+doc);
			}
			}
	}