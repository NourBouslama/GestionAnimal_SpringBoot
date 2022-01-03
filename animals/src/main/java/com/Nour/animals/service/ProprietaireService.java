package com.Nour.animals.service;

import java.util.List;

import com.Nour.animals.entities.Animal;
import com.Nour.animals.entities.Proprietaire;

public interface ProprietaireService {
	Proprietaire saveProprietaire(Proprietaire p);
	Proprietaire updateProprietaire(Proprietaire p);
	void deleteProprietaire(Proprietaire p);
	 void deleteProprietaireById(Long id);
	 Proprietaire getProprietaire(Long id);
	List<Proprietaire> getAllProprietaires();

	

}
