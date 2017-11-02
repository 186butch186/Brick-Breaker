package brickBracker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;

import javax.swing.JPanel;

public class Gameplay extends JPanel implements KeyListener, ActionListener{
	
	private boolean play = false;
	private int score = 0;
	private int totalBricks = 0; 
	
	private Timer time; 
	private int delay = 8;
	
	private int playerX = 310;
	
	private int ballPosX = 120;
	private int ballPosY = 350;
	private int ballXDir = -1;
	private int ballYDir = -2;
	
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
