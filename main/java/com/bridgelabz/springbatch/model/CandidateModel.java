package com.bridgelabz.springbatch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "candidate_details")
@AllArgsConstructor
@NoArgsConstructor
public class CandidateModel {

    @Id
    private Long id;
    private String candidateName;
    private String dateOfBirth;
    private String mobileNumber;
    private String city;
}
