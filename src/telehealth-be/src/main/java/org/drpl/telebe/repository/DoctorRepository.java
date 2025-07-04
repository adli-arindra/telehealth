package org.drpl.telebe.repository;

import org.drpl.telebe.dto.DoctorSpecializationType;
import org.drpl.telebe.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    List<Doctor> findBySpecialization(DoctorSpecializationType specialization);
}