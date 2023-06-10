package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarServiceImpl;

@Controller
public class CarsController {
	private final CarServiceImpl carService;
	@Autowired
	public CarsController(CarServiceImpl carService) {
		this.carService = carService;
	}


	@GetMapping(value = "/cars")
	public String showAllCars(@RequestParam(value ="count", defaultValue = "5") int count, ModelMap model) {
		model.addAttribute("getCars", carService.showCars());
		return "cars";
	}
	
}