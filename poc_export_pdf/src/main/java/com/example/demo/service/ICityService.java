package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.City;
import com.example.demo.respository.CityRepository;

public interface ICityService {	
	
	List<City> findAllCities();
}
