package com.example.phr.repository;
import com.example.phr.model.Bill; import org.springframework.data.jpa.repository.JpaRepository;
public interface BillRepository extends JpaRepository<Bill, Long> {}
