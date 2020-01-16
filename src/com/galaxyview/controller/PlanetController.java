package com.galaxyview.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.galaxyview.model.Planet;
import com.galaxyview.service.PlanetService;


@Controller
@RequestMapping("/planets")
public class PlanetController {
	@Autowired
	PlanetService planetService;
		
	// PLANET LIST PAGE
	@RequestMapping(value = "/planetList")
	public ModelAndView getPlanetList() {
		ModelAndView mv = new ModelAndView("PlanetList");
		
		List<Planet> planets = planetService.getPlanets();
		mv.addObject("planetList", planets);
		mv.addObject("planet", new Planet());
		return mv;
	}
	
	// ADDING PLANETS PAGE
	@RequestMapping(value = "/addPlanet")
	public ModelAndView getAddPlanet() {
		ModelAndView mv = new ModelAndView("addPlanet");
		mv.addObject("planet", new Planet());
		return mv;
	}
	
	// ADDING PLANETS ACTION
	@RequestMapping(value = "/addingPlanet")
	public String addingPlanet(Planet planet) {
		String returnString = "redirect:/planets/planetList";
		
		planetService.addPlanet(planet);
		
		return returnString;
	}
	
	// ADDING RESOURCES ACTION
	@RequestMapping(value = "/collectingResource")
	public String collectingResource(int planetId) {
		String returnString = "redirect:/planets/planetList";
		
		Planet fetchedPlanet = planetService.getPlanetById(planetId);
		
		int resource = fetchedPlanet.getPlanetResource();
		resource += 10;
		fetchedPlanet.setPlanetResource(resource);
		
		planetService.updatePlanet(fetchedPlanet);
		
		
		return returnString;
	}
	
	// DELETE PLANET ACTION
	@RequestMapping(value = "/deletingPlanet")
	public String deletingPlanet(int planetId) {
		String returnString = "redirect:/planets/planetList";
		
		planetService.deletePlanet(planetId);
		
		return returnString;
	}
}
