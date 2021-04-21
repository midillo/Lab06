package it.polito.tdp.meteo.model;

import java.time.Month;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import it.polito.tdp.meteo.DAO.MeteoDAO;

public class Model {
	
	private final static int COST = 100;
	private final static int NUMERO_GIORNI_CITTA_CONSECUTIVI_MIN = 3;
	private final static int NUMERO_GIORNI_CITTA_MAX = 6;
	private final static int NUMERO_GIORNI_TOTALI = 15;
	
	private MeteoDAO modello;
	private Map<String, Citta> listaCitta;
	
	public Model() {
		modello = new MeteoDAO();
		listaCitta = new HashMap<String, Citta>();
	}

	// of course you can change the String output with what you think works best
	public String getUmiditaMedia(int mese) {
		
		String risultato = new String();
		Map<String, Double> rilevamenti = this.modello.getRilevamentiLocalitaMese(mese);
		for(String s: rilevamenti.keySet()) {
			risultato += s + ": " + rilevamenti.get(s)+" umidità media\n";
		}
		
		return risultato;
	}
	
	// of course you can change the String output with what you think works best
	public String trovaSequenza(int mese) {
		return "TODO!";
	}
	
	private void cercaSequenza(List<Citta> sequenza, Integer tot) {
		
	}
	

}
