package com.nehajha.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nehajha.entity.Company;
import com.nehajha.entity.Sector;
import com.nehajha.repository.SectorRepository;

@Service
public class SectorService {
	@Autowired
	private SectorRepository repository;
	
	public List<Sector> getAllSectors() {
		return repository.findAll();
	}
	
	public Sector getSectorById(int id) {
		Optional<Sector> sectorOptional = repository.findById(id);
		if(sectorOptional.isPresent()) {
			return sectorOptional.get();
		}
		return null;
	}
	
	public Sector createSector(Sector sector) {
		return repository.save(sector);
	}
	
	public List<Company> getCompaniesBySector(int id) {
		Optional<Sector> sector = repository.findById(id);
		if(sector.isPresent()) {
			return sector.get().getCompanies();
		}
		return null;
	}
	
}
