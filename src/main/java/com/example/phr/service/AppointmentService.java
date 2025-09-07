package com.example.phr.service;
import com.example.phr.model.Appointment; import com.example.phr.model.Patient; import com.example.phr.model.Doctor;
import com.example.phr.repository.AppointmentRepository; import com.example.phr.repository.PatientRepository; import com.example.phr.repository.DoctorRepository;
import org.springframework.stereotype.Service; import org.springframework.transaction.annotation.Transactional; import java.util.List;
@Service @Transactional
public class AppointmentService {
    private final AppointmentRepository appointmentRepository; private final PatientRepository patientRepository; private final DoctorRepository doctorRepository;
    public AppointmentService(AppointmentRepository appointmentRepository, PatientRepository patientRepository, DoctorRepository doctorRepository){
        this.appointmentRepository=appointmentRepository; this.patientRepository=patientRepository; this.doctorRepository=doctorRepository;
    }
    public Appointment create(Appointment appt){
        Patient p = patientRepository.findById(appt.getPatient().getId()).orElseThrow(() -> new IllegalArgumentException("Invalid patient"));
        Doctor d = doctorRepository.findById(appt.getDoctor().getId()).orElseThrow(() -> new IllegalArgumentException("Invalid doctor"));
        appt.setPatient(p); appt.setDoctor(d); appt.setStatus("BOOKED"); return appointmentRepository.save(appt);
    }
    public List<Appointment> byPatient(Long pid){ return appointmentRepository.findByPatientId(pid); }
    public List<Appointment> byDoctor(Long did){ return appointmentRepository.findByDoctorId(did); }
}
