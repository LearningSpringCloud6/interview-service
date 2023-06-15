package com.demo.interviewdetailsservice.service;

import com.demo.interviewdetailsservice.entity.Feedback;

public interface FeedbackService {
    Feedback saveFeedback(Feedback feedback);

    void getFeedbackHistoryByEmail(String email);

    void updateFeedbackById(Long id);
}
