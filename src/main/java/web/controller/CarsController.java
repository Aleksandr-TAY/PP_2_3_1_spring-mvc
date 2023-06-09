package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

	@GetMapping(value = "/cars")
	public String createCars(ModelMap model) {
		model.addAttribute("color", "black");
		model.addAttribute("engine", "V8");
		model.addAttribute("doors", "5");
		return "cars";
	}
	
}