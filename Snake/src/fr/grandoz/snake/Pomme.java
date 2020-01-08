package fr.grandoz.snake;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Pomme {
	
	public int x;
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int y;
	
	public Pomme() {
	
		
		Random r = new Random();
		
		x = r.nextInt(550);
		y = r.nextInt(550);
		
		
		
		
	}
	
	
	public void DrawApple(Graphics g) {
		g.setColor(Color.red);
		g.fillOval(x, y, 10, 10);
	}
	
	
	

}
