package fr.grandoz.panels;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import fr.grandoz.snake.Dir;
import fr.grandoz.snake.Main;
import fr.grandoz.snake.Pomme;
import fr.grandoz.snake.SnakePart;

public class SnakeFrame extends JPanel{
Main main;
	public SnakeFrame(Main main) {
		this.main  = main;
		this.setSize(50*12, 50*12);
	setBackground(Color.BLACK);
main.setpomme(new Pomme() );
	Thread t = new Thread(new Runnable() {
		@Override
		public void run() {
			while(true) {
repaint();				
try {
	Thread.sleep(1000/30l);
} catch (InterruptedException e) {
	e.printStackTrace();
}
		}
		}
	});
	t.start();
	}
		

@Override
protected void paintComponent(Graphics g) {
	super.paintComponent(g);
	
	
	
	g.drawString("Score :"+main.getsnake().size(), 10, 10);
	main.getpomme().DrawApple(g);
	g.setColor(Color.WHITE);
	

	
	for(int i =0 ; i<main.getsnake().size() ; i++) {
		SnakePart part = main.getsnake().get(i);
		part.move(g);
		
	
	}
	
	if(main.IsColliding(main.getsnake().get(0).getX(), main.getsnake().get(0).getY(), 21	,main.getpomme().getX(), main.getpomme().getY())) {
		for(int i = 0 ; i< main.getScore_pomme() ; i++) {
		main.drawNewPart();
		}
		main.setpomme(new Pomme());
		
		
		
		
	}

	
	
	
	
	
	
	
}
	
	

}
