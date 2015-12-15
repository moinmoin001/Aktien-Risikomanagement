import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class RisikorechnerA extends JFrame {

	private JPanel contentPane;
	private JTextField txtDepotwert;
	private JTextField txtRisikoIn;
	private JTextField txtAktienKurs;
	private JTextField txtStoploss;
	private JLabel lblGesammtAusgaben;
	private JLabel lblErgebnisse;
	private JLabel lblDepotwert;
	private JLabel MaxAnzahlAus;
	private JLabel RisikoEuAus;
	private JLabel GesamtKostenAus;

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
		setBounds(100, 100, 544, 456);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
			
		txtDepotwert = new JTextField();
		txtDepotwert.setBounds(10, 25, 86, 20);
		contentPane.add(txtDepotwert);
		txtDepotwert.setColumns(10);
		
		txtRisikoIn = new JTextField();
		txtRisikoIn.setBounds(10, 70, 86, 20);
		contentPane.add(txtRisikoIn);
		txtRisikoIn.setColumns(10);
		
		txtAktienKurs = new JTextField();
		txtAktienKurs.setBounds(10, 116, 86, 20);
		contentPane.add(txtAktienKurs);
		txtAktienKurs.setColumns(10);
		
		txtStoploss = new JTextField();
		txtStoploss.setBounds(10, 164, 86, 20);
		contentPane.add(txtStoploss);
		txtStoploss.setColumns(10);
		
		JButton berechnen = new JButton("Berechnen");
		berechnen.setBounds(10, 228, 101, 23);
		contentPane.add(berechnen);
		
		JLabel lblRisikoIn = new JLabel("Risiko in %");
		lblRisikoIn.setBounds(10, 56, 86, 14);
		contentPane.add(lblRisikoIn);
		
		JLabel iblRisikoEuAus = new JLabel("Risiko in \u20AC");
		iblRisikoEuAus.setBounds(183, 42, 86, 14);
		contentPane.add(iblRisikoEuAus);
		
		JLabel lblAktienkurs = new JLabel("Aktienkurs");
		lblAktienkurs.setBounds(10, 101, 86, 14);
		contentPane.add(lblAktienkurs);
		
		JLabel lblStoploss = new JLabel("StopLoss");
		lblStoploss.setBounds(10, 152, 86, 14);
		contentPane.add(lblStoploss);
		
		JLabel lblMaxAnzahl = new JLabel("Max Anzahl");
		lblMaxAnzahl.setBounds(183, 87, 86, 14);
		contentPane.add(lblMaxAnzahl);
		
		lblGesammtAusgaben = new JLabel("Gesammt Ausgaben");
		lblGesammtAusgaben.setBounds(183, 135, 121, 14);
		contentPane.add(lblGesammtAusgaben);
		
		lblErgebnisse = new JLabel("Ergebnisse");
		lblErgebnisse.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblErgebnisse.setBounds(183, 11, 121, 29);
		contentPane.add(lblErgebnisse);
		
		lblDepotwert = new JLabel("Depotwert");
		lblDepotwert.setBounds(10, 11, 86, 14);
		contentPane.add(lblDepotwert);
		
		JLabel lblDeveloperJanScheel = new JLabel("All Rights Reserved by Jan Scheel");
		lblDeveloperJanScheel.setBounds(10, 404, 203, 14);
		contentPane.add(lblDeveloperJanScheel);
		
		JLabel lblCopyright = new JLabel("\u00A9 Copyright 2015");
		lblCopyright.setBounds(384, 404, 134, 14);
		contentPane.add(lblCopyright);
		
		MaxAnzahlAus = new JLabel();
		MaxAnzahlAus.setBounds(183, 101, 121, 35);
		contentPane.add(MaxAnzahlAus);
		
		RisikoEuAus = new JLabel();
		RisikoEuAus.setBounds(183, 56, 121, 34);
		contentPane.add(RisikoEuAus);
		
		GesamtKostenAus = new JLabel();
		GesamtKostenAus.setBounds(183, 152, 121, 32);
		contentPane.add(GesamtKostenAus);
		
		
		
		event e = new event();
		berechnen.addActionListener(e);
	}

	public class event implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			
							//char[] array1 = txtAktienKurs.toCharArray(txtAktienKurs.getText);

			
			
				double Depotwert = Double.parseDouble(txtDepotwert.getText().replace(",", "."));
				double RisikoPro = Double.parseDouble(txtRisikoIn.getText().replace(",", "."));
				double Kurs = Double.parseDouble(txtAktienKurs.getText().replace(",", "."));
				double StopLoss = Double.parseDouble(txtStoploss.getText().replace(",", "."));
				
					double RisikoEu = (RisikoPro/100*Depotwert);
					double MaxAnzahl = (RisikoEu/(Kurs-StopLoss));
					double GesammtAusgaben =(MaxAnzahl*Kurs);
					
					MaxAnzahl = Math.round(MaxAnzahl);
					GesammtAusgaben = Math.round(GesammtAusgaben);
					

					
					
					RisikoEuAus.setText("" + RisikoEu);
					MaxAnzahlAus.setText("" + MaxAnzahl);
					GesamtKostenAus.setText("" + GesammtAusgaben);
					
		
			
			
		
		}
	}
}