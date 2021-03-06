package com.galaxyview.service;

import java.util.List;

import com.galaxyview.model.Building;

//CRUD

public interface BuildingService {

	// methods
	// Create
	public boolean addBuilding(Building building);

	// Read
	public List<Building> getBuildings();
	
	public List<Building> getBuildingsByPlanetId(int planetId);

	public Building getBuildingById(int buildingId);

	// Update
	public boolean updateBuilding(Building building);

	// Delete
	public boolean deleteBuilding(int buildingId);
}
