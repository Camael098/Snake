package fr.grandoz.snake;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import java.util.Collections;
import java.util.List;

import fr.grandoz.panels.MenuNew;

public class SnakePart {

	public int x;
	public int y;
	public Dir direction;
	public Dir getDirection() {
		return direction;
	}

	public void setDirection(Dir direction) {
		this.direction = direction;
	}

	Main main;
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

	public SnakePart(int x , int y , Main main , Dir direction) {
		this.x = x;
		this.y = y;
		this.direction = direction;
		this.main = main;
	}
	
	public void move(Graphics g) {
		
		int speed = main.getspeed();

		
		Dir state = main.getstate();
		
		
		
		if(x> 600) {
			x = -5;
		}
		if(x< -5) {
			x = 600;
		}
		if(y <-5) {
			y = 600;
		}
		if(y> 600) {
			y =-5;
		}
		
		
		
		
		
		
		
		if(main.IsHead(this)) {
			
			
		
			
			
			
			
			main.getSnakeDirections().put(this, direction );
			g.setColor(Color.gray);
			if(state ==Dir.HAUT) {
				
				
				y = y-speed ;
				g.fillRect(x, y,25 , 25);
				g.setColor(Color.BLUE);
				g.fillOval(x, y-2, 2, 2);
				direction = Dir.HAUT;
				
				
				
			}	
			if(state ==Dir.BAS) {
				
				
				
				y = y+speed ;
				g.fillRect(x, y,25 , 25);
				g.setColor(Color.BLUE);
				g.fillOval(x, y-2, 2, 2);
				
				direction = Dir.BAS;
			}
			if(state ==Dir.DROITE) {

				
				x = x+speed ;
				g.fillRect(x, y,25 , 25);
				g.setColor(Color.BLUE);
				g.fillOval(x, y-2, 2, 2);
				direction = Dir.DROITE;
			}
			if(state ==Dir.GAUCHE) {
				
				

				
			x = x-speed ;
			
			g.fillRect(x, y,25 , 25);
			g.setColor(Color.BLUE);
			g.fillOval(x, y-2, 2, 2);
				direction = Dir.GAUCHE;
			}
			if(IsColliding()) {
				  main.getFrame().setSize(	12*40 , 12*30);
				  main.getFrame().setLocationRelativeTo(null);
			main.getFrame().setContentPane(new MenuNew(main));
		main.getFrame().revalidate();
		
			}
			
		}else {	
				g.setColor(Color.white);
				main.getSnakeDirections().put(this, direction );
				SnakePart after = main.getsnake().get(main.getsnake().indexOf(this)-1);
				direction = main.getSnakeDirections().get(after);
				
				
				
				
				if(direction == Dir.BAS	) {
				
				
				
				
				y = y+speed ;
			}
			if(direction == Dir.HAUT	) {
				
				y = y-speed ;
			}
			
			if(direction == Dir.DROITE	) {
				
				
				
				
				
				x = x+speed ;
			}
			if(direction == Dir.GAUCHE	) {

				
				x = x-speed ;
			}
		
		
			
			
			
			
			g.fillRect(x, y,25 , 25);
		}
		
		
		
		
	}
	
	public boolean IsHead() {
		if(main.getsnake().get(0) == this) {
			return true;
		}
		return false;
	}
	
	public boolean IsColliding() {
		for(int a = 0 ; a< main.getsnake().size() ; a++) {
			
			
		
	if(!main.IsHead(main.getsnake().get(a))) {
			
			if(x == main.getsnake().get(a).getX() && y== main.getsnake().get(a).getY()) {
				return true;
			}
			
					
	}
	
			}
		return false;
			
			
	}
}
