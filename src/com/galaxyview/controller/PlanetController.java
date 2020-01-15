package com.galaxyview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.galaxyview.service.PlanetService;

@Controller
@RequestMapping("/planets")
public class PlanetController {
	@Autowired
	PlanetService planetService;
}
