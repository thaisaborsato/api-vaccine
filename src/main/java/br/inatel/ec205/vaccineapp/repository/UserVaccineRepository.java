package br.inatel.ec205.vaccineapp.repository;

import br.inatel.ec205.vaccineapp.entity.UserVaccine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserVaccineRepository extends JpaRepository<UserVaccine, Long> {
    UserVaccine findByUserIdAndVaccineId(Long userId, Long vaccineId);
}
