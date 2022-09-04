package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entities.Role;
import com.example.demo.service.RoleService;

@Controller
public class RoleController {
	
	@Autowired
	private RoleService roleService;
	
	@GetMapping("/roleform")
	public String showRoles(@ModelAttribute("role") Role role) {
		return "roles";
	}
	@PostMapping("/saverole")
	public ModelAndView saveRole(@ModelAttribute("role") Role role) {
		
		Role rol = roleService.addRole(role);
		ModelAndView mv = new ModelAndView();
		mv.addObject("roleData",rol);
		mv.setViewName("roles");
		return mv;
	}
	
}
