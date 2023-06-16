package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.Service.UserService;

@Controller
public class UsersController {
	private final UserService userService;
	@Autowired
	public UsersController(UserService userService) {
		this.userService = userService;
	}
	@GetMapping(value = "/")
	public String showAllUsers(ModelMap model) {
		model.addAttribute("users", userService.getAllUsers());
		return "users";
	}
	
}