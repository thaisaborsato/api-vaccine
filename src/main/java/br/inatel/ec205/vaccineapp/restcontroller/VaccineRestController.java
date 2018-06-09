package br.inatel.ec205.vaccineapp.restcontroller;

import br.inatel.ec205.vaccineapp.entity.Vaccine;
import br.inatel.ec205.vaccineapp.service.VaccineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vaccines")
public class VaccineRestController {

    @Autowired
    private VaccineService vaccineService;

    @RequestMapping(method = RequestMethod.POST)
    public Vaccine create(@RequestBody Vaccine vaccine) {
        return vaccineService.save(vaccine);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Vaccine> readAll() {
        return vaccineService.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Vaccine readById(@PathVariable Long id) {
        return vaccineService.findById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public Vaccine update(@RequestBody Vaccine vaccine, @PathVariable Long id) {
        return vaccineService.update(vaccine, id);
    }

    @RequestMapping(method = RequestMethod.DELETE,  value = "/{id}")
    public void delete(@PathVariable Long id) {
        vaccineService.delete(id);
    }
}
