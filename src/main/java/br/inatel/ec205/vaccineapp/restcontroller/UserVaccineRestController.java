package br.inatel.ec205.vaccineapp.restcontroller;

import br.inatel.ec205.vaccineapp.entity.UserVaccine;
import br.inatel.ec205.vaccineapp.entity.Vaccine;
import br.inatel.ec205.vaccineapp.service.UserVaccineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users/{userId}/vaccines/{vaccineId}")
public class UserVaccineRestController {

    @Autowired
    private UserVaccineService userVaccineService;

    @RequestMapping(method = RequestMethod.POST)
    public UserVaccine takeVaccine(@PathVariable Long userId, @PathVariable Long vaccineId) {
        return userVaccineService.takeVaccine(userId, vaccineId);
    }

    @RequestMapping(method = RequestMethod.GET)
    public Integer countDose(@PathVariable Long userId, @PathVariable Long vaccineId) {
        return userVaccineService.countDoseByUserIdAndVaccineId(userId, vaccineId);
    }
}
