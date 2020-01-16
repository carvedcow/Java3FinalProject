package com.galaxyview.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.galaxyview.model.Building;
import com.galaxyview.model.Planet;
import com.galaxyview.service.BuildingService;
import com.galaxyview.service.PlanetService;

@Controller
@RequestMapping("/buildings")
public class BuildingController {

	@Autowired
	PlanetService planetService;

	@Autowired
	BuildingService buildingService;

	// PLANET LIST PAGE
	@RequestMapping(value = "/buildingList")
	public ModelAndView getBuildingList(int planetId, String planetName, int planetResource) {
		ModelAndView mv = new ModelAndView("BuildingList");

		List<Building> Buildings = buildingService.getBuildings();
		List<Building> validBuildings = new ArrayList<Building>();
		
		for (Building b : Buildings) {
			if (b.getPlanetId() == planetId) {
				validBuildings.add(b);
			}
		}
		
		mv.addObject("buildingList", validBuildings);
		mv.addObject("building", new Building());
		return mv;
	}

	// ADDING BUILDINGS PAGE
	@RequestMapping(value = "/addBuilding")
	public ModelAndView getAddBuilding(int planetId) {
		ModelAndView mv = new ModelAndView("addBuilding");
		mv.addObject("building", new Building(planetId));
		
		return mv;
	}

	// ADDING BUILDINGS ACTION
	@RequestMapping(value = "/addingBuilding")
	public String addingBuilding(Building building) {
		
		String returnString = "redirect:/planets/planetList";
		building.setBuildingCost(10);
		building.setBuildingLevel(1);
		buildingService.addBuilding(building);

		return returnString;
	}
	
	// UPGRADING BUILDING ACTION
		@RequestMapping(value = "/upgradingBuilding")
		public String upgradingBuilding(int planetId, int buildingId) {
			String returnString = "redirect:/planets/planetList";
			
			Planet fetchedPlanet = planetService.getPlanetById(planetId);
			Building fetchedBuilding = buildingService.getBuildingById(buildingId);
			
			int resource = fetchedPlanet.getPlanetResource();
			int cost = fetchedBuilding.getBuildingCost();
			int currentLevel = fetchedBuilding.getBuildingLevel();
			
			if(resource >= cost) {
				resource = resource - cost;
				cost *= 2;
				currentLevel += 1;
			}
			
			fetchedPlanet.setPlanetResource(resource);
			fetchedBuilding.setBuildingCost(cost);
			fetchedBuilding.setBuildingLevel(currentLevel);
			
			planetService.updatePlanet(fetchedPlanet);
			buildingService.updateBuilding(fetchedBuilding);
			
			
			return returnString;
		}
		
		// DELETE BUILDING ACTION
		@RequestMapping(value = "/deletingBuilding")
		public String deletingPlanet(int buildingId) {
			String returnString = "redirect:/planets/planetList";
			
			buildingService.deleteBuilding(buildingId);
			
			return returnString;
		}
}