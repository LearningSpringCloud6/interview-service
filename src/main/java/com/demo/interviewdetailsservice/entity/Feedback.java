package com.demo.interviewdetailsservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="feedback")
public class Feedback {
    @Id
    @GeneratedValue
    @Column(name="id")
    private long id;
    @Column(name="panel_name")
    private String panelName;
    @Column(name="candidate_name")
    private String candidateName;
    @Column(name="email")
    private String email;
    @Column(name="experience")
    private Integer experience;
    @Column(name="skills")
    private String skills;
    @Column(name="feedback_notes")
    private String feedbackNotes;
    @Column(name="final_verdict")
    private String finalVerdict;
    @Column(name="date")
    private Date date;
    @Column(name="time")
    private Time time;
    @Column(name="hr_name")
    private String hrName;
    @Column(name="code_snippets")
    private String codeSnippets;
    @Column(name="screenshots")
    private String screenshots;
}
