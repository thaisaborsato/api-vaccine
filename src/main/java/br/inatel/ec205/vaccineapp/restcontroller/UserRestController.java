package br.inatel.ec205.vaccineapp.restcontroller;

import br.inatel.ec205.vaccineapp.entity.User;
import br.inatel.ec205.vaccineapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserRestController {

    @Autowired
    private UserService userService;

    @RequestMapping(method = RequestMethod.POST)
    public User create(@RequestBody User user) {
        return userService.save(user);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> readAll() {
        return userService.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public User readById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public User update(@RequestBody User user, @PathVariable Long id) {
        return userService.update(user, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }
}