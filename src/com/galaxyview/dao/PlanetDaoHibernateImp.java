package com.galaxyview.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.galaxyview.model.Planet;

public class PlanetDaoHibernateImp implements PlanetDao{

	// Values
	@Autowired
	private SessionFactory sessionFactory;
	
	// Methods
	@Override
	public boolean insertPlanet(Planet planet) {
		sessionFactory.getCurrentSession().save(planet);
		return true;
	}

	@Override
	public List<Planet> getPlanets() {
		//Student is not the table name => it is the class name(@Entity)
		return sessionFactory.getCurrentSession().createQuery("from Planet", Planet.class).list();
	}

	@Override
	public Planet getPlanetById(int planetId) {
		return (Planet) sessionFactory.getCurrentSession().get(Planet.class, planetId);
	}

	@Override
	public boolean updatePlanet(Planet planet) {
		sessionFactory.getCurrentSession().update(planet);
		return true;
	}

	@Override
	public boolean deletePlanet(int planetId) {
		Planet fetchedPlanet = getPlanetById(planetId);
		sessionFactory.getCurrentSession().delete(fetchedPlanet);
		return true;
	}

}
