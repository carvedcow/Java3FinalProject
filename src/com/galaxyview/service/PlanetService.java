package com.galaxyview.service;

import java.util.List;

import com.galaxyview.model.Planet;

//CRUD

public interface PlanetService {

	// methods
	// Create
	public boolean addPlanet(Planet planet);

	// Read
	public List<Planet> getPlanets();

	public Planet getPlanetById(int planetId);

	// Update
	public boolean updatePlanet(Planet planet);

	// Delete
	public boolean deletePlanet(int planetId);
}
