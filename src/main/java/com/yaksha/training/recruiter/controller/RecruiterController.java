package com.yaksha.training.recruiter.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yaksha.training.recruiter.entity.Recruiter;

@Controller
@RequestMapping(value = { "/recruiter", "/" })
public class RecruiterController {

	@GetMapping(value = { "/list", "/" })
	public String listRecruiters(Model model) {
		return "";
	}

	@GetMapping("/addRecruiterForm")
	public String showFormForAdd(Model model) {
		return "";
	}

	@PostMapping("/saveRecruiter")
	public String saveRecruiter(@Valid @ModelAttribute("recruiter") Recruiter recruiter, BindingResult bindingResult) {
		return "";
	}

	@GetMapping("/updateRecruiterForm")
	public String showFormForUpdate(@RequestParam("recruiterId") Long id, Model model) {
		return "";
	}

	@GetMapping("/delete")
	public String deleteRecruiter(@RequestParam("recruiterId") Long id) {
		return "";
	}

	@PostMapping("/search")
	public String searchRecruiters(@RequestParam("theSearchName") String theSearchName, Model theModel) {
		return "";
	}
}
