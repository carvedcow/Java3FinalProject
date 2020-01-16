package com.galaxyview.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.galaxyview.dao.PlanetDao;
import com.galaxyview.model.Planet;

@Service
@Transactional
public class PlanetServiceImp implements PlanetService{
	
	// Values
	@Autowired
	PlanetDao planetDao;
	
	@Override
	public boolean addPlanet(Planet planet) {
		return planetDao.insertPlanet(planet);
	}

	@Override
	public List<Planet> getPlanets() {
		return planetDao.getPlanets();
	}

	@Override
	public Planet getPlanetById(int planetId) {
		return planetDao.getPlanetById(planetId);
	}

	@Override
	public boolean updatePlanet(Planet planet) {
		return planetDao.updatePlanet(planet);
	}

	@Override
	public boolean deletePlanet(int planetId) {
		return planetDao.deletePlanet(planetId);
	}

}
