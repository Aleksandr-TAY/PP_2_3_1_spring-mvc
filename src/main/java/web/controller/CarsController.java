package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarServiceImpl;

@Controller
@RequestMapping("/cars")
public class CarsController {
	private final CarServiceImpl carService;
	@Autowired
	public CarsController(CarServiceImpl carService) {
		this.carService = carService;
	}

	@GetMapping()
	public String showAllCars(Model model) {
		model.addAttribute("cars", carService.showAllCars());
		return "cars";
	}

	@GetMapping(value = "/{count}")
	public String showFromOneTillFourCars(@RequestParam(value ="count", defaultValue = "5") int count, ModelMap model) {
		model.addAttribute("getCars", carService.showFromOneTillFourCars(count));
		return "cars";
	}
	
}