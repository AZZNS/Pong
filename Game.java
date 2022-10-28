package Morpion;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Game extends JPanel implements ActionListener, KeyListener {

	int ballX = 100, ballY = 310, ballvelX = 0, ballvelY = 0;
	Ball ball = new Ball(ballX, ballY, ballvelX, ballvelY);
	private Random r;
	Timer tm = new Timer(5, this);
	boolean up1, down1, up2, down2;
	private boolean p1moving, p2moving;
	private boolean running;
	int yVel1 = 0, x1 = 45, y1 = 300;
	int yVel2 = 0, x2 = 925, y2 = 300;
	
	public Game() {  
		
		ball = new Ball(ballX, ballY, ballvelX, ballvelY);
		r = new Random();
		addKeyListener(this);
		setFocusable(true);
		tm.start();
		running = true;
		
	}
	
	public void paint(Graphics g) {
		
		super.paint(g);
		//background
		g.setColor(Color.DARK_GRAY);
		g.fillRect(0, 0, 1000, 700);
		//player left
		g.setColor(Color.white);
		g.fillRect(x1, y1, 10, 70);
		//player right
		g.setColor(Color.white);
		g.fillRect(x2, y2, 10, 70);
		
		if(y1 > 700) {
			y1 = 700;
		}
		
		if(y1 < 1000) {
			y1 = 1000;
		}
		
		if(y2 > 700) {
			y2 = 700;
		}
		
		if(y2 < 0) {
			y2 = 0;
		}
		
	}
	
	public void stop() {
		
		running = false;
		
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {

		int c = e.getKeyCode();
		
		
		
		if(c == KeyEvent.VK_Z) {
			up1 = true;
			p1moving = true;
			yVel1 = -1;
		}
		
		if(c == KeyEvent.VK_S) {
			down1 = true;
			p1moving = true;
			yVel1 = 1;
		}
		
		if(c == KeyEvent.VK_UP) {
			up2 = true;
			p2moving = true;
			yVel2 = -1;
		}
		
		if(c == KeyEvent.VK_DOWN) {
			down2 = true;
			p2moving = true;
			yVel2 = 1;
		}
		

		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		int c = e.getKeyCode();
		
		if(c == KeyEvent.VK_Z) {
			up1 = false;
			p1moving = true;
			yVel1 = -1;
		}
		
		if(c == KeyEvent.VK_S) {
			down1 = false;
			p1moving = true;
			yVel1 = 1;
		}
		
		if(c == KeyEvent.VK_UP) {
			up2 = false;
			p2moving = true;
			yVel2 = -1;
		}
		
		if(c == KeyEvent.VK_DOWN) {
			down2 = false;
			p2moving = true;
			yVel2 = 1;
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		y1 = y1 + yVel1;
		y2 = y2 + yVel2;
		repaint();
		
	}
		
}
