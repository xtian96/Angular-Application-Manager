package com.getchristianajob.applicationmanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.getchristianajob.applicationmanager.model.Applicant;

import java.util.Optional;

public interface ApplicantRepo extends JpaRepository<Applicant, Long> {

    void deleteApplicantById(Long id);

   Optional<Applicant> findApplicantById(Long id);

}
