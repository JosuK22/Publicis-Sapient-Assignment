package assignmentDay3;

public class TestingSynchronization extends Thread {
    
    public synchronized void run() {

        for(int i=0;i<5;i++) {
        
	        System.out.print(i);
        }
        System.out.println();
    }
}