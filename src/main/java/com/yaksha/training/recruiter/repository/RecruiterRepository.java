package com.yaksha.training.recruiter.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.yaksha.training.recruiter.entity.Recruiter;

public interface RecruiterRepository extends JpaRepository<Recruiter, Long> {

	// write your logic here
	Page<Recruiter> findByRecruiterCompanyNameAndRequiredExperience(@Param("keyword") String keyword,
			Pageable pageable);

}
