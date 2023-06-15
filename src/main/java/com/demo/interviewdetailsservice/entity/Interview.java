package com.demo.interviewdetailsservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="interview")
public class Interview {
    @Column(name = "id")
    @Id
    private long id;
    @Column(name="interviewer_name")
    private String interviewerName;
    @Column(name="organizer_name")
    private String organizerName;
    @Column(name="candidate_name")
    private long candidateName;
    @Column(name = "feedback")
    private String feedBack;
    @Column(name = "round_number")
    private int roundNumber;
    @Column(name = "candidate_employee_id")
    private String candidateEmployeeId;
    @Column(name = "interviewer_employee_id")
    private String interviewerEmployeeId;
}
