package assignmentDay3;

public class myThreadMain {
    
public static void main(String[] args) throws InterruptedException {
    
	Thread t1=new Thread(new myThread("This is the message1"));
	
	Thread t2=new Thread(new myThread("This is the message2"));
	
	Thread t3=new Thread(new myThread("This is the message3"));
	
	t1.start();
	t1.join();
	
	t2.start();
	t2.join();
	
	t3.start();
	t3.join();
	
    }
}