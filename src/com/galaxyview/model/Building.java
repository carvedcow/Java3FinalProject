package com.galaxyview.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BUILDINGS")
public class Building {
	
	//values
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "buildingId")
	private int buildingId;
	
	@Column(name = "buildingName")
	private String buildingName;
	
	@Column(name = "buildingCost")
	private int buildingCost;
	
	@Column(name = "buildingLevel")
	private int buildingLevel;
	
//	@Column(name = "planetId")
//	private int planetId;
	
	@ManyToOne
	@JoinColumn(name="planetId", nullable=false)
	private Planet planet;
	
	//constructors
	public Building() {
		
	}
	
//	public Building(int planetId) {
//		this.planetId = planetId;
//	}
	
//	public Building(Planet planet) {
//		this.planet = planet;
//	}
	
	//methods
	public int getBuildingId() {
		return buildingId;
	}
	public void setBuildingId(int buildingId) {
		this.buildingId = buildingId;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public int getBuildingCost() {
		return buildingCost;
	}
	public void setBuildingCost(int buildingCost) {
		this.buildingCost = buildingCost;
	}
	public int getBuildingLevel() {
		return buildingLevel;
	}
	public void setBuildingLevel(int buildingLevel) {
		this.buildingLevel = buildingLevel;
	}

//	public int getPlanetId() {
//		return planetId;
//	}
//
//	public void setPlanetId(int planetId) {
//		this.planetId = planetId;
//	}

	
	public Planet getPlanet() {
		return planet;
	}
	public void setPlanet(Planet planet) {
		this.planet = planet;
	}
	
	
}
