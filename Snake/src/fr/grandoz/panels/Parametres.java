package fr.grandoz.panels;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;

import fr.grandoz.snake.Main;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Parametres extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField txtGauche;
	private JLabel lblHautl;
	private JLabel lblBas;
	private JLabel lblDroite;
	private JLabel lblGauche;
	Main main;
	private JLabel lblParamtresDeJeu;
	private JLabel lblNombre;
	private JTextField score_debut;
	private JLabel lblScoreParPomme;
	private JTextField scorepomme;
	private JButton btnSauvegarderLesParamtres;

	/**
	 * Create the panel.
	 */
	@SuppressWarnings("static-access")
	public Parametres(Main main) {
		setBackground(Color.BLACK);
		this.main = main;
		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setColumns(10);
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setColumns(10);
		textField.setText(""+main.getK1());
		textField_1.setText(""+ main.getK2());
		textField_2.setText(""+main.getK4());
		textField_3.setText(""+main.getK3());
		
		JButton btnNewButton = new JButton("Sauvegrader les touches");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.setK1(textField.getText().charAt(0));
				main.setK2(textField_1.getText().charAt(0));
				main.setK4(textField_2.getText().charAt(0));
				main.setK3(textField_3.getText().charAt(0));
				main.getFrame().setContentPane(new MenuNew(main));
				main.getFrame().revalidate();
			}
		});
		
		txtGauche = new JTextField();
		txtGauche.setBackground(Color.DARK_GRAY);
		txtGauche.setText("Gauche");
		txtGauche.setColumns(10);
		
		lblHautl = new JLabel("Haut");
		lblHautl.setBackground(Color.RED);
		lblHautl.setForeground(Color.GRAY);
		
		lblBas = new JLabel("Bas");
		lblBas.setForeground(Color.GRAY);
		
		lblDroite = new JLabel("Droite");
		lblDroite.setForeground(Color.GRAY);
		
		lblGauche = new JLabel("Gauche");
		lblGauche.setForeground(Color.GRAY);
		
		lblParamtresDeJeu = new JLabel("Param\u00E8tres de jeu");
		lblParamtresDeJeu.setForeground(Color.GRAY);
		
		lblNombre = new JLabel("Score de d\u00E9part");
		lblNombre.setForeground(Color.GRAY);
		
		score_debut = new JTextField();
		score_debut.setBackground(Color.LIGHT_GRAY);
		score_debut.setColumns(10);
		score_debut.setText(main.getScore_debut()+"");
		
		lblScoreParPomme = new JLabel("Score par pomme");
		lblScoreParPomme.setForeground(Color.GRAY);
		
		scorepomme = new JTextField();
		scorepomme.setColumns(10);
		scorepomme.setBackground(Color.LIGHT_GRAY);
		scorepomme.setText(main.getScore_pomme()+"");
		
		btnSauvegarderLesParamtres = new JButton("Sauvegarder les param\u00E8tres");
		btnSauvegarderLesParamtres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				main.setScore_debut(Integer.parseInt(score_debut.getText()));
				main.setScore_pomme(Integer.parseInt(scorepomme.getText()));
				main.getFrame().setContentPane(new MenuNew(main));
				main.getFrame().revalidate();
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(48)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblHautl, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblBas))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textField, 0, 0, Short.MAX_VALUE)
								.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
							.addGap(34)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblDroite)
								.addComponent(lblGauche))
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(txtGauche, GroupLayout.PREFERRED_SIZE, 0, GroupLayout.PREFERRED_SIZE)
									.addGap(104))
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(23)
							.addComponent(lblNombre)
							.addGap(18)
							.addComponent(score_debut, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(lblScoreParPomme)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(scorepomme, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(174)
							.addComponent(lblParamtresDeJeu, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 430, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(btnSauvegarderLesParamtres, GroupLayout.PREFERRED_SIZE, 430, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblHautl, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDroite)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtGauche, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblBas)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblGauche)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnNewButton)
					.addGap(18)
					.addComponent(lblParamtresDeJeu)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(score_debut, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNombre)
						.addComponent(lblScoreParPomme)
						.addComponent(scorepomme, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnSauvegarderLesParamtres)
					.addContainerGap(121, Short.MAX_VALUE))
		);
		setLayout(groupLayout);

	}
}
