package com.demo.interviewdetailsservice.controller;

import com.demo.interviewdetailsservice.entity.Feedback;
import com.demo.interviewdetailsservice.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/feedback/api")
public class FeedbackController {
    @Autowired
    FeedbackService feedbackService;

    @PostMapping("/hello")
    public ResponseEntity test(@RequestBody Feedback feedback) {
        System.out.printf("djfkdsfkjsjdkf");
//        if(feedback.getFeedbackNotes()==null) {
//            return new ResponseEntity("Please provide the feedback",HttpStatus.BAD_REQUEST);
//        }
//        Feedback fd = feedbackService.saveFeedback(feedback);
//        if(fd.getEmail().equals(feedback.getEmail())) {
//            return new ResponseEntity(fd, HttpStatus.OK);
//        } else {
//            return new ResponseEntity("Save is not successful. Please try again",HttpStatus.INTERNAL_SERVER_ERROR);
//        }
        return new ResponseEntity(null,null);
    }
    @PostMapping("/save-feedback")
    public ResponseEntity saveFeedback(@RequestBody Feedback feedback) {
        if(feedback.getFeedbackNotes()==null) {
            return new ResponseEntity("Please provide the feedback",HttpStatus.BAD_REQUEST);
        }
        Feedback fd = feedbackService.saveFeedback(feedback);
        if(fd.getEmail().equals(feedback.getEmail())) {
            return new ResponseEntity(fd, HttpStatus.OK);
        } else {
            return new ResponseEntity("Save is not successful. Please try again",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/get-feedback-history/{email}")
    public void getFeedbackHistoryByEmail(@PathVariable String email) {
        feedbackService.getFeedbackHistoryByEmail(email);
    }

    @PutMapping("/update-feedback/{id}")
    public void updateFeedbackById(@PathVariable Long id) {
        feedbackService.updateFeedbackById(id);
    }
}
