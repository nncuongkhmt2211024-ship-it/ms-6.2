package cuong.com.patientservice.controller;

import cuong.com.patientservice.entity.Patient;
import cuong.com.patientservice.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/patients")
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient) {
        // Lưu thông tin bệnh nhân vào CSDL và trả về kết quả
        return patientRepository.save(patient);
    }
}