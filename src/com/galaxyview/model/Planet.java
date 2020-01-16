package com.galaxyview.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "PLANETS")
public class Planet {
	//values
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int planetId;
	
	@Column(name = "planetName")
	private String planetName;
	
	@Column(name = "planetResource")
	private int planetResource;
	
	// The @OneToMany annotation is used to define the property in Building class 
	// that will be used to map the mappedBy variable.
	// In this case, planet represents the value "planet" inside the Building Class.
	@OneToMany //(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Building> buildings;
	
	//constructors
	public Planet() {
		
	}
	
	//methods
	public int getPlanetId() {
		return planetId;
	}

	public void setPlanetId(int planetId) {
		this.planetId = planetId;
	}

	public String getPlanetName() {
		return planetName;
	}

	public void setPlanetName(String planetName) {
		this.planetName = planetName;
	}

	public int getPlanetResource() {
		return planetResource;
	}

	public void setPlanetResource(int planetResource) {
		this.planetResource = planetResource;
	}

	public List<Building> getBuildings() {
		return buildings;
	}

	public void setBuildings(List<Building> buildings) {
		this.buildings = buildings;
	}
	
	
	
}
