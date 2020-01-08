package fr.grandoz.panels;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import javax.swing.JComboBox;
import javax.swing.JSplitPane;
import java.awt.CardLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import fr.grandoz.snake.Dir;
import fr.grandoz.snake.Main;
import fr.grandoz.snake.SnakePart;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class MenuNew extends JPanel {
Main main;
	/**
	 * Create the panel.
	 */
	public MenuNew(Main main) {
		setBackground(Color.BLACK);
		this.main =main;
		JButton btnNewButton = new JButton("Rejouer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.getFrame().setContentPane(new SnakeFrame(main));
				  main.getFrame().setSize(	12*50 , 12*50);
				  main.getFrame().setLocationRelativeTo(null);
				  main.getsnake().clear();
				  main.getsnake().add(new SnakePart(0,0, main, Dir.DROITE));
				  
			
			}
		});
		
		JButton btnNewButton_1 = new JButton("Param\u00E8tres");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.getFrame().setContentPane(new Parametres(main));
				main.getFrame().revalidate();
			}
		});
		
		JButton btnNewButton_2 = new JButton("Quitter");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JLabel lblNewLabel = new JLabel("By grandoz V1.0.2");
		lblNewLabel.setForeground(Color.GRAY);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap(66, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE)
							.addGap(64))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 320, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 319, GroupLayout.PREFERRED_SIZE))
							.addGap(63))))
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addContainerGap(351, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(100)
					.addComponent(btnNewButton)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_1)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton_2)
					.addPreferredGap(ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
					.addComponent(lblNewLabel))
		);
		setLayout(groupLayout);

	}
}
