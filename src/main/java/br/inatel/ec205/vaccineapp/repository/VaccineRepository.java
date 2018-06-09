package br.inatel.ec205.vaccineapp.repository;


import br.inatel.ec205.vaccineapp.entity.Vaccine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccineRepository extends JpaRepository<Vaccine, Long> {
}
