package com.demo.interviewdetailsservice.service.impl;

import com.demo.interviewdetailsservice.entity.Interview;
import com.demo.interviewdetailsservice.repository.InterviewRepository;
import com.demo.interviewdetailsservice.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterviewServiceImpl implements InterviewService {
    @Autowired
    InterviewRepository interviewRepository;

    @Override
    public List<Interview> getAllInterviewDetails() {
        return interviewRepository.findAll();
    }

    @Override
    public Interview getInterviewDetailsByCandidateEmpId(String candidateId) {
        return interviewRepository.findByCandidateId(candidateId);
    }
}
