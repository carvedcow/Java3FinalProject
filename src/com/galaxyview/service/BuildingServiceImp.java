package com.galaxyview.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.galaxyview.dao.BuildingDao;
import com.galaxyview.model.Building;

@Service
@Transactional
public class BuildingServiceImp implements BuildingService{
	
	// Values
	@Autowired
	BuildingDao buildingDao;
	
	// Methods
	@Override
	public boolean addBuilding(Building building) {
		return buildingDao.insertBuilding(building);
	}

	@Override
	public List<Building> getBuildings() {
		return buildingDao.getBuildings();
	}

	@Override
	public List<Building> getBuildingsByPlanetId(int planetId) {
		return buildingDao.getBuildingsByPlanetId(planetId);
	}
	
	@Override
	public Building getBuildingById(int buildingId) {
		return buildingDao.getBuildingById(buildingId);
	}

	@Override
	public boolean updateBuilding(Building building) {
		return buildingDao.updateBuilding(building);
	}

	@Override
	public boolean deleteBuilding(int buildingId) {
		return buildingDao.deleteBuilding(buildingId);
	}

}
