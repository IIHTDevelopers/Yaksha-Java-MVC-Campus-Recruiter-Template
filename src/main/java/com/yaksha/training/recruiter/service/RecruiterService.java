package com.yaksha.training.recruiter.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.yaksha.training.recruiter.entity.Recruiter;

@Service
public class RecruiterService {

	public List<Recruiter> getRecruiters() {
		// write your logic here
		return null;
	}

	public Recruiter saveRecruiter(Recruiter recruiter) {
		// write your logic here
		return null;
	}

	public Recruiter getRecruiter(Long id) {
		// write your logic here
		return null;
	}

	public boolean deleteRecruiter(Long id) {
		// write your logic here
		return false;
	}

	public Page<Recruiter> searchRecruiters(String theSearchName, Pageable pageable) {
		// write your logic here
		return null;
	}
}
