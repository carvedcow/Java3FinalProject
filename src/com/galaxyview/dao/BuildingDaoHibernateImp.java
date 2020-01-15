package com.galaxyview.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.galaxyview.model.Building;
import com.galaxyview.model.Planet;

@Repository
public class BuildingDaoHibernateImp implements BuildingDao{

	// Values
	@Autowired
	private SessionFactory sessionFactory;
	
	// Methods
	@Override
	public boolean insertBuilding(Building building) {
		sessionFactory.getCurrentSession().save(building);
		return true;
	}

	@Override
	public List<Building> getBuildings() {
		return sessionFactory.getCurrentSession().createQuery("from Building", Building.class).list();
	}
	
	@Override
	public List<Building> getBuildingsByPlanetId(int planetId) {
		Planet fetchedPlanet = (Planet) sessionFactory.getCurrentSession().get(Planet.class, planetId);
		return fetchedPlanet.getBuildings();
	}

	@Override
	public Building getBuildingById(int buildingId) {
		return (Building) sessionFactory.getCurrentSession().get(Building.class, buildingId);
	}

	@Override
	public boolean updateBuilding(Building building) {
		sessionFactory.getCurrentSession().update(building);
		return true;
	}

	@Override
	public boolean deleteBuilding(int buildingId) {
		Building fetchedBuilding = getBuildingById(buildingId);
		sessionFactory.getCurrentSession().delete(fetchedBuilding);
		return true;
	}


}
