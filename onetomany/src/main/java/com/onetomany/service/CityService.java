package com.onetomany.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onetomany.entity.City;
import com.onetomany.repository.CityRepository;

@Service
public class CityService {

	@Autowired
	private CityRepository cityRepository;

	public City addOrUpdate(City city) {
		return cityRepository.save(city);
	}

	public boolean deleteById(int id) {
		cityRepository.deleteById(id);
		return true;
	}

	public List<City> getAll() {
		return cityRepository.findAll();
	}

	public City getById(int id) {
		return cityRepository.findById(id).orElse(null);
	}

	public List<City> findAllByCountryId(int c_id) {

		return cityRepository.findAllByContryId(c_id);
	}
}
