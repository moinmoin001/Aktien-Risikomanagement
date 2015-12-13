import java.awt.BorderLayout;
import java.awt.EventQueue;

import java.lang.Math;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RisikorechnerA extends JFrame {

	private JPanel contentPane;
	private JTextField txtDepotwert;
	private JTextField txtRisikoIn;
	private JTextField txtAktienKurs;
	private JTextField txtStoploss;
	private JTextField txtRisikoIn_1;
	private JTextField txtMaxAnzahl;
	private JTextField txtGesamtKosten;
	private JTextField RisikoEuAus;
	private JTextField MaxAnzahlAus;
	private JTextField GesamtKostenAus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RisikorechnerA frame = new RisikorechnerA();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public RisikorechnerA() {
		setTitle("RisikoRechner");
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
			
		txtDepotwert = new JTextField();
		txtDepotwert.setText("Depotwert");
		txtDepotwert.setBounds(10, 11, 86, 20);
		contentPane.add(txtDepotwert);
		txtDepotwert.setColumns(10);
		
		txtRisikoIn = new JTextField();
		txtRisikoIn.setText("Risiko in %");
		txtRisikoIn.setBounds(10, 42, 86, 20);
		contentPane.add(txtRisikoIn);
		txtRisikoIn.setColumns(10);
		
		txtAktienKurs = new JTextField();
		txtAktienKurs.setText("Aktien Kurs");
		txtAktienKurs.setBounds(10, 73, 86, 20);
		contentPane.add(txtAktienKurs);
		txtAktienKurs.setColumns(10);
		
		txtStoploss = new JTextField();
		txtStoploss.setText("StopLoss");
		txtStoploss.setBounds(10, 104, 86, 20);
		contentPane.add(txtStoploss);
		txtStoploss.setColumns(10);
		
		JButton berechnen = new JButton("Berechnen");
		berechnen.setBounds(10, 135, 101, 23);
		contentPane.add(berechnen);
		
		txtRisikoIn_1 = new JTextField();
		txtRisikoIn_1.setEditable(false);
		txtRisikoIn_1.setText("Risiko in \u20AC");
		txtRisikoIn_1.setBounds(99, 42, 86, 20);
		contentPane.add(txtRisikoIn_1);
		txtRisikoIn_1.setColumns(10);
		
		txtMaxAnzahl = new JTextField();
		txtMaxAnzahl.setEditable(false);
		txtMaxAnzahl.setText("Max Anzahl");
		txtMaxAnzahl.setBounds(99, 73, 86, 20);
		contentPane.add(txtMaxAnzahl);
		txtMaxAnzahl.setColumns(10);
		
		txtGesamtKosten = new JTextField();
		txtGesamtKosten.setEditable(false);
		txtGesamtKosten.setText("Ausgaben");
		txtGesamtKosten.setBounds(99, 104, 86, 20);
		contentPane.add(txtGesamtKosten);
		txtGesamtKosten.setColumns(10);
		
		RisikoEuAus = new JTextField();
		RisikoEuAus.setEditable(false);
		RisikoEuAus.setBounds(183, 42, 86, 20);
		contentPane.add(RisikoEuAus);
		RisikoEuAus.setColumns(10);
		
		MaxAnzahlAus = new JTextField();
		MaxAnzahlAus.setEditable(false);
		MaxAnzahlAus.setColumns(10);
		MaxAnzahlAus.setBounds(183, 73, 86, 20);
		contentPane.add(MaxAnzahlAus);
		
		GesamtKostenAus = new JTextField();
		GesamtKostenAus.setEditable(false);
		GesamtKostenAus.setColumns(10);
		GesamtKostenAus.setBounds(183, 104, 86, 20);
		contentPane.add(GesamtKostenAus);
		
		
		
		event e = new event();
		berechnen.addActionListener(e);
	}

	public class event implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			
			try 
			{
				double Depotwert = Double.parseDouble(txtDepotwert.getText());
				double RisikoPro = Double.parseDouble(txtRisikoIn.getText());
				double Kurs = Double.parseDouble(txtAktienKurs.getText());
				double StopLoss = Double.parseDouble(txtStoploss.getText());
				
					double RisikoEu = (Depotwert*RisikoPro);
					double MaxAnzahl = (RisikoEu/Kurs-StopLoss);
					double GesammtAusgaben =(MaxAnzahl*Kurs);
					
					MaxAnzahl = Math.round(MaxAnzahl);
					
					RisikoEuAus.setText("" +RisikoEu);
					MaxAnzahlAus.setText("" + MaxAnzahl);
					GesamtKostenAus.setText("" + GesammtAusgaben);
					
			} catch (Exception e) {
				JOptionPane.showInternalMessageDialog(null, "ERROR!");	
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}
}
