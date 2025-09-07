package com.example.phr.repository;
import com.example.phr.model.Doctor; import org.springframework.data.jpa.repository.JpaRepository;
public interface DoctorRepository extends JpaRepository<Doctor, Long> {}
