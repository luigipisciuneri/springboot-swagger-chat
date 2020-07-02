package it.dstech.formazione.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.dstech.formazione.model.Messaggio;
import it.dstech.formazione.repository.MessaggioRepository;

@Service
public class MessaggioServiceDAOImpl implements MessaggioServiceDAO {

	@Autowired
	private MessaggioRepository messaggioRepos;
	
	@Override
	public Messaggio aggiungiMessaggio(Messaggio messaggio) {
		return messaggioRepos.save(messaggio);
	}

	@Override
	public void rimuoviMessaggio(Messaggio messaggio) {
		messaggioRepos.delete(messaggio);
		
	}

}
