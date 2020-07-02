package it.dstech.formazione.service;

import java.util.List;

import it.dstech.formazione.model.Messaggio;
import it.dstech.formazione.model.Persona;

public interface PersonaServiceDAO {
	
List<Persona> cercaUsernames();
	
	void sendMessaggio(String username, Messaggio message);
	
	Persona findPersona(String username);
	
	Persona createPersona(Persona persona);

}
