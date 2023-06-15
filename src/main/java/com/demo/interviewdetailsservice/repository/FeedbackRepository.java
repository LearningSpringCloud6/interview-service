package com.demo.interviewdetailsservice.repository;

import com.demo.interviewdetailsservice.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback,Long> {
    @Query(value = "select * from feedback where email=1",nativeQuery = true)
    List<Feedback> getReferenceByEmail(String email);
}
