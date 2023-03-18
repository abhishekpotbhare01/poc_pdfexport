package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.City;
import com.example.demo.respository.CityRepository;
@Service
public class CityServiceImpl implements ICityService {
	
	@Autowired
	private CityRepository cityRepository;

	@Override
	public List<City> findAllCities() {
		// TODO Auto-generated method stub
		return cityRepository.findAll();
	}

}
