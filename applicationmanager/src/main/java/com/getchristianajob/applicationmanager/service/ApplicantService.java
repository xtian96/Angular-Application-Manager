package com.getchristianajob.applicationmanager.service;

import com.getchristianajob.applicationmanager.exception.UserNotFoundException;
import com.getchristianajob.applicationmanager.model.Applicant;
import com.getchristianajob.applicationmanager.repo.ApplicantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicantService {
    private final ApplicantRepo applicantRepo;
    @Autowired
    public ApplicantService(ApplicantRepo applicantRepo) {
        this.applicantRepo = applicantRepo;
    }

    public Applicant addApplicant(Applicant applicant) {
        return applicantRepo.save(applicant);
    }

    public List<Applicant> findAllApplicants(){
        return applicantRepo.findAll();
    }

    public Applicant updateApplicant(Applicant applicant) {
        return applicantRepo.save(applicant);
    }
    public Applicant findApplicantById(Long id){
        return applicantRepo.findApplicantById(id)
                .orElseThrow(() -> new UserNotFoundException("user by id " + id + " was not found"));
    }

    public void deleteEmployee(Long id){
        applicantRepo.deleteApplicantById(id);
    }
}
