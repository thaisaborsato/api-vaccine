package br.inatel.ec205.vaccineapp.service;

import br.inatel.ec205.vaccineapp.entity.UserVaccine;
import br.inatel.ec205.vaccineapp.entity.Vaccine;
import br.inatel.ec205.vaccineapp.repository.UserVaccineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserVaccineService {

    @Autowired
    private UserVaccineRepository userVaccineRepository;

    @Autowired
    private VaccineService vaccineService;

    public UserVaccine takeVaccine(Long userId, Long vaccineId) {
        UserVaccine userVaccine = userVaccineRepository.findByUserIdAndVaccineId(userId, vaccineId);

        if (userVaccine != null) {
            userVaccine.incrementDose();
        } else {
            userVaccine = new UserVaccine(userId, vaccineId, 1);
        }

        UserVaccine saved = userVaccineRepository.save(userVaccine);
        if (saved != null) {
            Vaccine vaccine = vaccineService.findById(vaccineId);
            vaccine.decrementQuantity();
            vaccineService.save(vaccine);
        }
        return saved;
    }

    public Integer countDoseByUserIdAndVaccineId(Long userId, Long vaccineId) {
        UserVaccine userVaccine = userVaccineRepository.findByUserIdAndVaccineId(userId, vaccineId);
        return userVaccine.getDose();
    }

}
