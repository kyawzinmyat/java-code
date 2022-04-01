public class Main {
	public static void main(String[] args) {
		intro();
		printer p = new printer();
		
		
		Thread thread = new CThread(p);
		Thread thread2 = new CThread2(p);
		thread.start();
		//try{
//				thread.join();
//			}catch(InterruptedException e){
//				e.printStackTrace();
//				}
		thread2.start();
		
	}
	
	
	public static void intro(){
		System.out.println("Main Thraed is started");
			}
}







class printer{
	void print(String threadName,int times){
			for(int i=1;i<=times;i++){
					try{
						Thread.sleep(300);
					}
					catch (InterruptedException e){
							e.printStackTrace();
						}
					System.out.println("Thread / "+threadName+" "+"called "+i);
				}
		}
}


class CThread2 extends Thread{
	printer p ;
	
	CThread2(printer newPrinter){
			this.p = newPrinter;
		}
	
	
	synchronized public void run() {
			synchronized(p){
				p.print("CThread1",5);
			}
		}
	
}

class CThread extends Thread{
	
	printer p ;
	
	CThread(printer newPrinter){
			this.p = newPrinter;
		}
	
	
	public void run() {
			synchronized(p){
				p.print("CThread1",5);
			}
		}
	
}