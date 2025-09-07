package com.example.phr.repository;
import com.example.phr.model.Patient; import org.springframework.data.jpa.repository.JpaRepository;
public interface PatientRepository extends JpaRepository<Patient, Long> {}
