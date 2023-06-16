package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import web.Service.UserService;
import web.models.User;

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
	@GetMapping("/{id}")
	public String showOneUser(@PathVariable("id") int id1, ModelMap model) {
		model.addAttribute("user", userService.getUser(id1));
		return "user";
	}

	@GetMapping("/new")
	public String newUser(@ModelAttribute("user") User user) {
		return "new";
	}
	@PostMapping()
	public String create(@ModelAttribute("user") User user) {
		userService.addUser(user);
		return "redirect:/";
	}
}