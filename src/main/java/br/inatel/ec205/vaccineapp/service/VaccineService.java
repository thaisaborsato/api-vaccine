package br.inatel.ec205.vaccineapp.service;

import br.inatel.ec205.vaccineapp.entity.Vaccine;
import br.inatel.ec205.vaccineapp.repository.VaccineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineService {

    @Autowired
    private VaccineRepository vaccineRepository;

    public Vaccine save(Vaccine vaccine) {
        return vaccineRepository.save(vaccine);
    }

    public Vaccine update(Vaccine vaccine, Long id) {
        vaccine.setId(id);
        return vaccineRepository.save(vaccine);
    }

    public Vaccine findById(Long id) {
        return vaccineRepository.findOne(id);
    }

    public List<Vaccine> findAll() {
        return vaccineRepository.findAll();
    }

    public void delete(Long id) {
        vaccineRepository.delete(id);
    }
}
