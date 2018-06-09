package br.inatel.ec205.vaccineapp.service;

import br.inatel.ec205.vaccineapp.entity.User;
import br.inatel.ec205.vaccineapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }

    public User update(User user, Long id) {
        user.setId(id);
        return userRepository.save(user);
    }

    public User findById(Long id) {
        return userRepository.findOne(id);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public void delete(Long id) {
        userRepository.delete(id);
    }
}
