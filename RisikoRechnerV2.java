import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RisikoRechnerV2 extends JFrame {

	JLabel AusDepot;
	JLabel AusRisikoEu;
	JLabel AusRisikoPro;
	JLabel AusAktienKurs;
	JLabel AusStopLoss;
	JLabel AusMaxAnzahl;
	JLabel AusGesamtAusgaben;
	
	private JTextField DepotWertInt;
	private JTextField RisikoProInt;
	private JTextField AktienKursDouble;
	private JTextField StopLossKursDouble;
	
	
	//Fragen
	private JTextField FraDepotwert;
	private JTextField FraRisiko;
	private JTextField FraKurs;
	private JTextField FraStopLoss;
	
	
	
	
	public RisikoRechnerV2() {
		super("RisikoRechnerV2");
		
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400, 400);
		setTitle("RisikoRechner");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		AusDepot = new JLabel("Depotwert: " + FraDepotwert + "€");
		AusRisikoEu = new JLabel("Risiko €: " + AusRisikoEu + "€");
		AusRisikoPro = new JLabel("Risiko %: " + RisikoProInt +"%");
		AusAktienKurs = new JLabel("Aktueller Aktienkurs: " + FraKurs + "€");
		AusStopLoss = new JLabel("StopLosskurs: " + FraStopLoss + "€");
		AusMaxAnzahl = new JLabel("");
		AusGesamtAusgaben = new JLabel("Depotwert: " + FraDepotwert + "€");
		
	//Aussagen
		DepotWertInt = new JTextField("Depotwert");
		add(DepotWertInt);
		DepotWertInt.setBounds(30, 30, 60, 20);
		DepotWertInt.setEditable(true);
		
		RisikoProInt = new JTextField("Risiko %");
		add(RisikoProInt);
		RisikoProInt.setBounds(30, 60, 60, 20);
		RisikoProInt.setEditable(true);

		AktienKursDouble = new JTextField("Kurs");
		add(AktienKursDouble);
		AktienKursDouble.setBounds(30, 90, 60, 20);
		AktienKursDouble.setEditable(true);
		
		StopLossKursDouble = new JTextField("StopLoss");
		add(StopLossKursDouble);
		StopLossKursDouble.setBounds(30, 120	, 60, 20);
		StopLossKursDouble.setEditable(true);
		
		
		//Ausgaben
		FraDepotwert = new JTextField("Depotwert");
		add(FraDepotwert);
		FraDepotwert.setBounds(100, 30, 60, 20);
		FraDepotwert.setEditable(false);
		
		RisikoProInt = new JTextField("Risiko %");
		add(RisikoProInt);
		RisikoProInt.setBounds(100, 60, 60, 20);
		RisikoProInt.setEditable(false);
		
		RisikoProInt = new JTextField("Risiko €");
		add(RisikoProInt);
		RisikoProInt.setBounds(100, 90, 60, 20);
		RisikoProInt.setEditable(false);

		FraKurs = new JTextField("Kurs");
		add(FraKurs);
		FraKurs.setBounds(100, 120, 60, 20);
		FraKurs.setEditable(false);
		
		FraStopLoss = new JTextField("StopLoss");
		add(FraStopLoss);
		FraStopLoss.setBounds(100, 150	, 60, 20);
		FraStopLoss.setEditable(false);
	
	}	
}

/*
 * 
 * FraDepotwert = new JTextField("Depotwert");
		add(FraDepotwert);
		FraDepotwert.setBounds(x, y, width, height);
		FraDepotwert.setEditable(true);
		
		FraDepotwert = new JTextField("Depotwert");
		add(FraDepotwert);
		FraDepotwert.setBounds(x, y, width, height);
		FraDepotwert.setEditable(true);
		
		FraDepotwert = new JTextField("Depotwert");
		add(FraDepotwert);
		FraDepotwert.setBounds(x, y, width, height);
		FraDepotwert.setEditable(true);
		
		FraDepotwert = new JTextField("Depotwert");
		add(FraDepotwert);
		FraDepotwert.setBounds(x, y, width, height);
		FraDepotwert.setEditable(true);
		
		FraDepotwert = new JTextField("Depotwert");
		add(FraDepotwert);
		FraDepotwert.setBounds(x, y, width, height);
		FraDepotwert.setEditable(true);

		FraDepotwert = new JTextField("Depotwert");
		add(FraDepotwert);
		FraDepotwert.setBounds(x, y, width, height);
		FraDepotwert.setEditable(true);
*/
/*add(AusDepot);
add(AusRisikoEu);
add(AusRisikoPro);
add(AusAktienKurs);
add(AusStopLoss);
add(AusMaxAnzahl);
add(AusGesamtAusgaben);*/

/*JLabel FraDepotwert;
JLabel FraRisiko;
JLabel FraDepotAus;
JLabel FraKurs;
JLabel FraStopLoss;
JLabel AusDepot;
JLabel AusRisikoEu;
JLabel AusRisikoPro;
JLabel AusAktienKurs;
JLabel AusStopLoss;
JLabel AusMaxAnzahl;
JLabel AusGesamtAusgaben;*/

/*private JTextField DepotWertInt;
private JTextField RisikoProInt;
private JTextField AktienKursDouble;
private JTextField StopLossKursDouble;
*/
/*
AusDepot = new JLabel("Depotwert: " + Depotwert + "€");
AusRisikoEu = new JLabel("Risiko €: " + RisikoEu + "€");
AusRisikoPro = new JLabel("Risiko %: " + RisikoPro +"%");
AusAktienKurs = new JLabel("Aktueller Aktienkurs: " + AkKurs + "€");
AusStopLoss = new JLabel("StopLosskurs: " + StopLoss + "€");
AusMaxAnzahl = new JLabel("");
AusGesamtAusgaben = new JLabel("Depotwert: " + Depotwert + "€");*/