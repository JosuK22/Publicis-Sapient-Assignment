package assignmentDay3;

public class ThreadPriorityMain {
    
	public static void main(String[] args) throws InterruptedException{
	    
		System.out.println("main thread enters..");
		System.out.println(Thread.currentThread());
		
		ThreadPriority t1= new ThreadPriority();
		ThreadPriority t2= new ThreadPriority();
		
		t1.setPriority(8);
		t2.setPriority(9);
		
		t2.start();
		t1.start();
		t1.join();
		t2.join();
		System.out.println("main thread exits..");
	}
}