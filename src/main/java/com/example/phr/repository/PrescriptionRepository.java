package com.example.phr.repository;
import com.example.phr.model.Prescription; import org.springframework.data.jpa.repository.JpaRepository;
public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {}
