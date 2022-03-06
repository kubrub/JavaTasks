package JavaThreads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.swing.JLabel;

public class Increase implements Runnable {
	private JLabel label;
	private int delay;
	
	
	public Increase(JLabel result2, int _delay) {
		label = result2;
	    delay = _delay;
	}

	public void run() {
	   Lock increaseLook = new ReentrantLock();
	   increaseLook.lock();
	   try {
   			long next = 0;
   			while(next < Long.MAX_VALUE) {
   				next = next + 1;
   				label.setText(Long.toString(next));
   				Thread.sleep(delay);
   			}
	   }
	   catch (InterruptedException e) {
		   System.err.println(e.getMessage());
	   }
	   finally {
		   increaseLook.unlock();
	   }
	}
}
