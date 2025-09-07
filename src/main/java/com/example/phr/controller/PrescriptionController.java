package com.example.phr.controller;

import com.example.phr.model.Prescription;
import com.example.phr.service.PrescriptionService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/prescriptions")
@CrossOrigin(origins = "*")
public class PrescriptionController {
	private final PrescriptionService service;

	public PrescriptionController(PrescriptionService service) {
		this.service = service;
	}

	@PostMapping
	public Prescription save(@RequestBody Prescription p) {
		return service.save(p);
	}

	@GetMapping
	public List<Prescription> all() {
		return service.findAll();
	}
}
