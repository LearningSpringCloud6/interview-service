package com.demo.interviewdetailsservice.service.impl;

import com.demo.interviewdetailsservice.entity.Feedback;
import com.demo.interviewdetailsservice.repository.FeedbackRepository;
import com.demo.interviewdetailsservice.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FeedbackServiceImpl implements FeedbackService {
    @Autowired
    FeedbackRepository feedbackRepository;

    @Override
    public Feedback saveFeedback(Feedback feedback) {
        Feedback fd =  feedbackRepository.save(feedback);
        return fd;
    }

    @Override
    public void getFeedbackHistoryByEmail(String email) {
        feedbackRepository.getReferenceByEmail(email);
    }

    @Override
    public void updateFeedbackById(Long id) {
        Optional<Feedback> feedback = feedbackRepository.findById(id);
        feedbackRepository.save(feedback.get());
    }
}
