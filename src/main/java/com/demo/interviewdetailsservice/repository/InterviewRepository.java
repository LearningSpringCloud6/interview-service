package com.demo.interviewdetailsservice.repository;

import com.demo.interviewdetailsservice.entity.Interview;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface InterviewRepository extends JpaRepository<Interview,Long> {
    @Query(value = "select * from interview where candidate_employee_id=?1",nativeQuery = true)
    Interview findByCandidateId(String candidateId);
}
