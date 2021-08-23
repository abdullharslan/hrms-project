package com.odev.hrms.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="candidate_cv_experience")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class CandidateCvExperience {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")

    private int id;
    @NotNull
    @Column(name="work_place_name")
    private String workPlaceName;
    @NotNull
    @Column(name="start_date")
    private LocalDate startDate;

    @Column(name="quit_date")
    private LocalDate quitDate;

    @JsonIgnore
    @JoinColumn(name="candidates_id")
    @ManyToOne
    private Candidate candidate;
    @NotNull

    @JoinColumn(name="job_positions_id")
    @ManyToOne
    private JobPosition jobPositions;
}