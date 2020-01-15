package com.galaxyview.dao;

import java.util.List;

import com.galaxyview.model.Building;

//CRUD

public interface BuildingDao {

	// methods
	// Create
	public boolean insertBuilding(Building building);

	// Read
	public List<Building> getBuildings();
	
	public List<Building> getBuildingsByPlanetId(int planetId);

	public Building getBuildingById(int buildingId);

	// Update
	public boolean updateBuilding(Building building);

	// Delete
	public boolean deleteBuilding(int buildingId);
}
