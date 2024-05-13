package com.yaksha.training.recruiter.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yaksha.training.recruiter.entity.Recruiter;

import jakarta.validation.Valid;

@Controller
@RequestMapping(value = { "/recruiter", "/" })
public class RecruiterController {

	@GetMapping(value = { "/list", "/", "/search" })
	public String listDonors(@RequestParam(value = "theSearchName", required = false) String theSearchName,
			@PageableDefault(size = 5) Pageable pageable, Model theModel) {
		// write your logic here
		return "";
	}

	@GetMapping("/addRecruiterForm")
	public String showFormForAdd(Model model) {
		// write your logic here
		return "";
	}

	@PostMapping("/saveRecruiter")
	public String saveRecruiter(@Valid @ModelAttribute("recruiter") Recruiter recruiter, BindingResult bindingResult) {
		// write your logic here
		return "";
	}

	@GetMapping("/updateRecruiterForm")
	public String showFormForUpdate(@RequestParam("recruiterId") Long id, Model model) {
		// write your logic here
		return "";
	}

	@GetMapping("/delete")
	public String deleteRecruiter(@RequestParam("recruiterId") Long id) {
		// write your logic here
		return "";
	}
}
