package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entities.User;
import com.example.demo.entities.UserDetails;
import com.example.demo.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	@GetMapping("/registration")
	public String showRegistrationFrom(@ModelAttribute("user") User user, @ModelAttribute("userdetails") UserDetails userdetails) {
		return "registration";
	}
	
	@PostMapping("/saveuser")
	public ModelAndView saveUser(@ModelAttribute ("user") User user, @ModelAttribute("userdetails") UserDetails userdetails) {
		user.setUserDetails(userdetails);
		ModelAndView mv = new ModelAndView();
		User usr = userService.addUser(user);
		mv.addObject("userData",usr);
		mv.setViewName("registration");
		
		return mv;
	}
	
	@GetMapping("/getall")
	public ModelAndView getalllist(@ModelAttribute ("user") User user, @ModelAttribute("userdetails") UserDetails userdetails) {
		
		ModelAndView mv = new ModelAndView();
		List<User> usr = userService.getallist();
		mv.addObject("usr",usr);
		mv.setViewName("getall");
		
		return mv;}
	
//	@GetMapping("/allusers")
//	public ModelAndView getAllUsers(@ModelAttribute ("userdetails") UserDetails userdetails) {
//		
//		ModelAndView mv = new ModelAndView();
//		List<UserDetails> usersList = userDetailsService.getUsersList();
//		mv.setViewName("userslist");
//		mv.addObject("usersList",usersList);
//		
//		
//		return mv;
//	}
//	
	
	
	
	
//	@DeleteMapping("/deleteUserById")
//	public ModelAndView deleteUserById(@RequestParam ("id") Long userId) {
//		ModelAndView mv = new ModelAndView();
//		User usr = userService.deleteUserById(userId);
//		
//		
//		return mv;
//		
//	}

}
