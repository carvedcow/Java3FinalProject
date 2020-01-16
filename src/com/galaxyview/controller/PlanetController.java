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
	
	@RequestMapping(value = "/planetList")
	public ModelAndView getPlanetList() {
		ModelAndView mv = new ModelAndView("PlanetList");
		
		List<Planet> planets = planetService.getPlanets();
		mv.addObject("planetList", planets);
		mv.addObject("planet", new Planet());
		return mv;
	}	
}
