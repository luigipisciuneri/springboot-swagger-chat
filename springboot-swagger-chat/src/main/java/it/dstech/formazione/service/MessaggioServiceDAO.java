package it.dstech.formazione.service;

import it.dstech.formazione.model.Messaggio;

public interface MessaggioServiceDAO {
	
	public Messaggio aggiungiMessaggio(Messaggio messaggio);
	
	public void rimuoviMessaggio(Messaggio messaggio);

}
