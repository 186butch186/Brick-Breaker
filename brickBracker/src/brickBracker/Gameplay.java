/*
 * Brick Breaker
 * @Michael Butchko
 * @version 1.0
 */

package brickBreaker;

//Libraries 
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;

import javax.swing.JPanel;

public class Gameplay extends JPanel implements KeyListener, ActionListener{
	
	//Is the game on
	private boolean play = false;
	//Current player score
	private int score = 0;
	//Total bricks left in the game
	private int totalBricks = 0; 
	//Timer
	private Timer timer;
	//Delay for player to react
	private int delay = 8;
	//Players coordinate 
	private int playerX = 310;
	
	private int ballPosX = 120;
	private int ballPosY = 350;
	private int ballXDir = -1;
	private int ballYDir = -2;
	
	public Gameplay(){
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		//timer = new Timer (delay,this);
		//timer.start();
	} 
	
	public void paint(Graphics g){
		//background
		g.setColor(Color.black);
		g.fillRect(1,1,692,592);
		
		//borders
		g.setColor(Color.yellow);
		g.fillRect(0, 0, 3, 592);
		g.fillRect(0, 0, 692, 3);
		g.fillRect(691, 0, 3, 592);
		
		//paddle
		g.setColor(Color.green);
		g.fillRect(playerX, 550, 100, 8);
		
		//ball
		g.setColor(Color.yellow);
		g.fillRect(playerX, 550, 100, 8);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// Right key is pressed
		if (e.getKeyCode() == KeyEvent.VK_RIGHT ){
			//Paddle cannot go out of bounds, keep player stationary
			if(playerX >= 600){
				playerX = 600;
			}	else{
				moveRight();
				}		
		}
		
		// Left key is pressed
		if (e.getKeyCode() == KeyEvent.VK_LEFT ){
			//Paddle cannot go out of bounds, keep player stationary
			if(playerX < 10){
				playerX = 10;
			}	else{
				moveLeft();
				}		
		}
	}

	//Method that moves the player right
	public void moveRight(){
		play = true;
		playerX += 20;
	}
	//Method that moves the player left
	public void moveLeft(){
		play = true;
		playerX -= 20;
	}
	
	@Override
	public void keyReleased(KeyEvent arg0) {}
	@Override
	public void keyTyped(KeyEvent arg0) {}

}
