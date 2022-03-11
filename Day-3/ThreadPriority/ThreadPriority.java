package assignmentDay3;

public class ThreadPriority extends Thread {

	@Override
	public void run() {
	    
		Thread t= Thread.currentThread();
		
		System.out.println("Priority of "+t.getName()+" is "+t.getPriority());
	}
}