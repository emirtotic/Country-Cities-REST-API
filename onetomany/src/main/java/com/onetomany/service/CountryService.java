package com.onetomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onetomany.entity.Country;
import com.onetomany.repository.CountryRepository;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepo;

	public Country addOrUpdate(Country country) {
		return countryRepo.save(country);
	}

	public boolean deleteById(int id) {
		countryRepo.deleteById(id);
		return true;
	}

	public List<Country> getAll() {

		return countryRepo.findAll();
	}

	public Country getById(int id) {

		Country country = countryRepo.findById(id).orElse(null);

		return country;
	}
}
