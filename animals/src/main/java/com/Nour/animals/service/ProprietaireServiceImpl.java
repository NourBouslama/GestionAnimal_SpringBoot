package com.Nour.animals.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Nour.animals.entities.Proprietaire;
import com.Nour.animals.repos.ProprietaireRepository;

@Service
public class ProprietaireServiceImpl implements ProprietaireService{

	@Autowired
	private ProprietaireRepository proprietaireRepository;

	@Override
	public Proprietaire saveProprietaire(Proprietaire p) {
		return proprietaireRepository.save(p);
	}

	@Override
	public Proprietaire updateProprietaire(Proprietaire p) {
		return proprietaireRepository.save(p);
	}

	@Override
	public void deleteProprietaire(Proprietaire p) {
		proprietaireRepository.delete(p);
		
	}

	@Override
	public void deleteProprietaireById(Long id) {
		proprietaireRepository.deleteById(id);
		
	}

	@Override
	public Proprietaire getProprietaire(Long id) {
		return proprietaireRepository.findById(id).get();
	}

	@Override
	public List<Proprietaire> getAllProprietaires() {
		return proprietaireRepository.findAll();
	}


}
