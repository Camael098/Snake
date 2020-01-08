package fr.grandoz.snake;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.List;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.Box.Filler;

import fr.grandoz.panels.MenuNew;

public class Main{
	public HashMap<SnakePart, Dir> SnakeDirections = new HashMap<SnakePart, Dir>();
	public Pomme pomme;
	static Main main;
	 static KeyListener listener ;
	 int Score;
	 static char k1= 'z';
	 static  char k2 = 's';
	 static char k3 = 'q';
	 static char k4 = 'd';
	 public int score_pomme= 3;
	 public int score_debut;
	
	public char getK1() {
		return k1;
	}
	public int getScore_pomme() {
		return score_pomme;
	}
	public void setScore_pomme(int score_pomme) {
		this.score_pomme = score_pomme;
	}
	public int getScore_debut() {
		return score_debut;
	}
	public void setScore_debut(int score_debut) {
		this.score_debut = score_debut;
	}
	public void setK1(char k1) {
		Main.k1 = k1;
	}
	public static char getK2() {
		return k2;
	}
	public static void setK2(char k2) {
		Main.k2 = k2;
	}
	public char getK3() {
		return k3;
	}
	public void setK3(char k3) {
		this.k3 = k3;
	}
	public char getK4() {
		return k4;
	}
	public void setK4(char k4) {
		this.k4 = k4;
	}
	public int getscore() {
		 return Score;
	 }
	 public void setscore(int s ) {
		 this.Score = Score;
	 }
	public HashMap<SnakePart, Dir> getSnakeDirections() {
		return SnakeDirections;
		
	}
	

	static Dir state = Dir.DROITE;
	static JFrame frame = new JFrame();
	public int speed = 8;
		
	
	
	
	
	
public ArrayList<SnakePart> snake = new ArrayList<SnakePart>();

	public static void main(String[] args) {
		
		frame.setContentPane(new MenuNew(new Main()));
         frame.setVisible(true);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(	12*40 , 12*30);
         frame.setLocationRelativeTo(null);
    
         
         
         
         MetalLookAndFeel.setCurrentTheme(new MyDefaultMetalTheme());
         try {  
        	 UIManager.setLookAndFeel(new MetalLookAndFeel());
         } catch (Exception e) {
             e.printStackTrace();
           }

           SwingUtilities.updateComponentTreeUI(frame);

           frame.setVisible(true);
         
         
         

         
         frame.setTitle("Snake V1.0.2");
         
         
         
         
         
         
     	KeyListener key = new KeyListener() {
    		
    		@Override
    		public void keyTyped(KeyEvent e) {
    			if(e.getKeyChar() == k2)			{
    		    	 if(state != Dir.HAUT) {
    		     setstate(Dir.BAS);
    		    	 }
    		     	
    		     }
    		     if(e.getKeyChar() == k1)	 {
    		    	 if(state != Dir.BAS) {
    		    		setstate(Dir.HAUT);
    		    	 }
    		      	
    		      }
    		     if(e.getKeyChar() == k4)			{
    		    	 if(state!= Dir.GAUCHE) {
    		    		 
    		    		 setstate(Dir.DROITE);
    		    	 }
    		      }
    		     if(e.getKeyChar() == k3)			{
    		    	 if(state!= Dir.DROITE) {
    		    		setstate(Dir.GAUCHE);
    		    	 }
    		      }
    		     }
 
    		@Override
    		public void keyPressed(KeyEvent e) {
    		
    		}

    		@Override
    		public void keyReleased(KeyEvent e) {
    			// TODO Auto-generated method stub
    		
    		}
    		     		};		
    		     	frame.addKeyListener(key);
    		     	frame.setFocusable(true);
    		     	
	}

public void drawNewPart() {
SnakePart last = snake.get(snake.size()-1);
SnakePart part = null;
if(last.getDirection() == Dir.BAS) {
	part = new SnakePart(last.getX() , last.getY()-speed , this, Dir.BAS);
}
if(last.getDirection() == Dir.HAUT) {
	part = new SnakePart(last.getX() , last.getY()+speed , this,Dir.HAUT);
}
if(last.getDirection() == Dir.DROITE) {
	part = new SnakePart(last.getX()-speed , last.getY(), this, Dir.DROITE);
}
if(last.getDirection() == Dir.GAUCHE) {
	part = new SnakePart(last.getX()+speed, last.getY(), this,Dir.GAUCHE);
}

snake.add(part);
	
	}
	public java.util.List<SnakePart> getsnake(){

	return snake;
}




public Dir getstate() {
	return state;
}



public boolean IsHead(SnakePart part) {
	if(getsnake().get(0) == part) {
		return true;
	}	
	return false;
}
public boolean IsColliding(int x  , int y , int radx , int fx , int fy) {
	for(int i  = 0 ;  i< radx ; i++) {
		if(x + i == fx) {
			for(int  a = 0; a < radx; a ++) {
				if(y+ a == fy) {
					return true;
				}
			}
		
			
		}
	}
				
		
		
return false;		
		
	}
public int getspeed() {
	return speed;
}
public JFrame getFrame() {
	return frame;
}
public Pomme getpomme() {
	return pomme;
}
public void setpomme(Pomme p) {
	pomme = p;
}
public KeyListener getListener() {
	return listener;
}
public static void setstate(Dir r) {
	state = r;
}
}
