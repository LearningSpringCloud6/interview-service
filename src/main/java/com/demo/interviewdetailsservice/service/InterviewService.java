package com.demo.interviewdetailsservice.service;

import com.demo.interviewdetailsservice.entity.Interview;

import java.util.List;

public interface InterviewService {
     List<Interview> getAllInterviewDetails();

    Interview getInterviewDetailsByCandidateEmpId(String candidateId);
}
