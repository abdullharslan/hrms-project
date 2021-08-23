package com.odev.hrms.model;
import javax.persistence.*;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name="employers")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@PrimaryKeyJoinColumn(name="employers_id")
public class Employer extends User{


    @Column(name="first_name")
    private String firstName;
    @Column(name="last_name")
    private String lastName;
    @Column(name="company_name")
    private String companyName;
    @Column(name="web_address")
    private String webAdress;
    @Column(name="phone_number")
    private String phoneNumber;
    @Column(name="is_activated")
    private boolean isActivated;

    @OneToMany(mappedBy = "employer")
    private List<JobAdvertisement> jobAdvertisements;


}
