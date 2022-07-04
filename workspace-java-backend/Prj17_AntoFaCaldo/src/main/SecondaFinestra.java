package main;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Color;

public class SecondaFinestra extends JFrame {
	
	private JTextField numeroDaIndovinare;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JTextPane textPane;
	
	private int numeroSegreto;
	
	public void nuovaPartita() {
		
		this.numeroSegreto = (int)(Math.random() * 100) + 1;//num casuale da 1 a 100
		System.out.println("inizia una nuova partita");
	}
	
	public void restart() throws InterruptedException {
		Thread.sleep(3000);
		textPane.setText("ricomincia il gioco");
		nuovaPartita();
	}
	
	public void valutazione() {
		
		int numeroScelto;
		String messaggio = "";

		try {
			numeroScelto = Integer.parseInt(numeroDaIndovinare.getText());
			
			
			if (numeroScelto > numeroSegreto) {
				messaggio = "Troppo grande! Prova ancora.";
				textPane.setText(messaggio);
			}
			else if (numeroScelto < numeroSegreto) {
				messaggio = "Troppo piccolo! Prova ancora.";
				textPane.setText(messaggio);
			}
			else {
				messaggio = "Giusto! Complimenti, hai vinto.";
				textPane.setText(messaggio);
				
				restart();
				
			}
		
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			messaggio = "Ehi, ti ho beccato! \nInserisci un numero intero tra 1 e 100.";
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		numeroDaIndovinare.requestFocus();
		numeroDaIndovinare.selectAll();
		
		
		
		
		
	}
	
	public SecondaFinestra() {
		getContentPane().setBackground(new Color(189, 183, 107));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Corso Java Back-end");
		lblNewLabel.setForeground(new Color(47, 79, 79));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Sitka Text", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 11, 414, 28);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Inserisci un numero tra 1 e 100");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setBounds(26, 76, 253, 22);
		getContentPane().add(lblNewLabel_1);
		
		numeroDaIndovinare = new JTextField();
		numeroDaIndovinare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valutazione();
				System.out.println("hai premuto enter");
			}
		});
		numeroDaIndovinare.setHorizontalAlignment(SwingConstants.CENTER);
		numeroDaIndovinare.setBounds(289, 77, 96, 20);
		getContentPane().add(numeroDaIndovinare);
		numeroDaIndovinare.setColumns(10);
		
		btnNewButton = new JButton("Indovina");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				valutazione();
				System.out.println("hai premuto il bottone");
			}
		});
		btnNewButton.setBounds(289, 108, 96, 23);
		getContentPane().add(btnNewButton);
		
		textPane = new JTextPane();
		textPane.setBounds(26, 152, 359, 70);
		getContentPane().add(textPane);
	}

	public static void main(String[] args) {
		SecondaFinestra finestra = new SecondaFinestra();
		finestra.nuovaPartita();
		finestra.setSize(500, 400);
		finestra.setVisible(true);

	}
}
