package com.yaksha.training.recruiter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.yaksha.training.recruiter.entity.Recruiter;

public interface RecruiterRepository extends JpaRepository<Recruiter, Long> {

	List<Recruiter> findByRecruiterCompanyName(@Param("keyword") String keyword);
}
