package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
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

	@GetMapping("/{id}/edit")
	public String edit(ModelMap model, @PathVariable("id") int id) {
		model.addAttribute("user", userService.getUser(id));
		return "edit";
	}

	@PatchMapping("/{id}")
	public String update(@ModelAttribute("user") User user, @PathVariable("id") int id) {
		userService.updateUser(id, user);
		return "redirect:/";
	}

	@DeleteMapping("/{id}")
	public String delete(@PathVariable("id") int id) {
		userService.removeUserById(id);
		return "redirect:/";
	}
}