package Morpion;

import java.awt.Color;
import java.awt.Graphics;

public class Ball {

	private int ballX, ballY, ballvelX, ballvelY;
	
	public Ball(int ballX, int ballY, int ballvelX, int ballvelY) {
		
		this.ballvelX = ballvelX;
		this.ballvelY = ballvelY;
		this.ballX = ballX;
		this.ballY = ballY;
		
	}
	
	public void draw(Graphics g) {
		
		g.setColor(Color.red);
		g.fillOval(ballX, ballY, 10, 10);
		
	}

	public int getBallX() {
		return ballX;
	}

	public void setBallX(int ballX) {
		this.ballX = ballX;
	}

	public int getBallY() {
		return ballY;
	}

	public void setBallY(int ballY) {
		this.ballY = ballY;
	}
	
	
	
}
