package com.example.phr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.phr.model.Prescription;
import com.example.phr.repository.PrescriptionRepository;

@Service
public class PrescriptionService {
    private final PrescriptionRepository repo;

    public PrescriptionService(PrescriptionRepository repo) {
        this.repo = repo;
    }

    public Prescription save(Prescription p) {
        return repo.save(p);
    }

    public List<Prescription> findAll() {
        return repo.findAll();
    }
}
