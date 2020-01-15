package com.galaxyview.dao;

import java.util.List;

import com.galaxyview.model.Planet;

//CRUD

public interface PlanetDao {

	// methods
	// Create
	public boolean insertPlanet(Planet planet);

	// Read
	public List<Planet> getPlanets();

	public Planet getPlanetById(int planetId);

	// Update
	public boolean updatePlanet(Planet planet);

	// Delete
	public boolean deletePlanet(int planetId);
}
