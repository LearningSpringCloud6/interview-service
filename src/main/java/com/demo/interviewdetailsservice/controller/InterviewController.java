package com.demo.interviewdetailsservice.controller;

import com.demo.interviewdetailsservice.entity.Interview;
import com.demo.interviewdetailsservice.service.InterviewService;
import com.demo.interviewdetailsservice.service.impl.InterviewServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/interview/api")
public class InterviewController {
    @Autowired
    InterviewServiceImpl interviewService;

    @GetMapping("/interview-details")
    public List<Interview> getAllInterviewDetails() {
        return interviewService.getAllInterviewDetails();
    }

    @GetMapping("/interview-details/{candidateId}")
    public Interview getInterviewDetailsByEmployeeId(@PathVariable String candidateId) {
        return interviewService.getInterviewDetailsByCandidateEmpId(candidateId);
    }
}
