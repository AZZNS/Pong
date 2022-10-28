package Morpion;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
		Game gm = new Game();
		JFrame frame = new JFrame("Ping-Pong");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000, 700);
		frame.setLocationRelativeTo(null);
		frame.add(gm);
		
	}
	
}
