package com.bridgelabz.springbatch.repository;

import com.bridgelabz.springbatch.model.CandidateModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<CandidateModel,Long> {
}
