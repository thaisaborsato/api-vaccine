package br.inatel.ec205.vaccineapp.repository;

import br.inatel.ec205.vaccineapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User, Long> {
}

