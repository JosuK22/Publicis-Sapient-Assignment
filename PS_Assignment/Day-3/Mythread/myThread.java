package assignmentDay3;

public class myThread extends Thread {
    
    private String message;

	public myThread(String message) {
	    
	    this.message = message;
    }

	@Override
	public void run() {
	    
		for (int i = 1; i <=10; i++) {
		    
			System.out.println(this.message);
			
			try {
			    
				Thread.sleep(1000);
				
			} 
			catch (InterruptedException e) {
			    
				e.printStackTrace();
			}
		}	
	}
}