public class Main {
	public static void main(String[] args) {
		myThread mt = new myThread();
		mt.start();
		System.out.println(Thread.currentThread().isAlive());
		System.out.println(Thread.activeCount());
		/// Thread priority is inheritance from super thraed class
	}
}


class myThread extends Thread{
		public void run(){
				System.out.println("myThread is running");
			}
}