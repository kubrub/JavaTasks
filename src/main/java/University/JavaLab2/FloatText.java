package University.JavaLab2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.swing.JPanel;

public class FloatText extends JPanel implements Runnable {
	private static final long serialVersionUID = 1L;
	private int x;
	private int y;
	private int delay;
	
	public FloatText(int _delay) {
		x = 0;
		y = 40;
		delay = _delay;
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	    g.setColor(Color.WHITE);
	    g.fillRect(0, 0, getWidth(), getHeight());
		Font fnt = new Font("SansSerif", Font.PLAIN, 20);
	    g.setColor(Color.ORANGE);
	    g.setFont(fnt);
	    g.drawString("☀ Don't worry! Be happy! ☀",x,y);
	}
	
	public void run() {
		Lock floatTextLook = new ReentrantLock();
		floatTextLook.lock();
		try {
			for(long i = 0; i < Long.MAX_VALUE; ++i) {
				x = (++x)%getWidth();
				repaint();
				Thread.sleep(delay);
			}
		}
		catch(InterruptedException e) {
			System.err.println(e.getMessage());
		}
		finally {
			floatTextLook.unlock();
		}
	}
}
