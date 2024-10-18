package ee.gert.decathlon.repository;

import ee.gert.decathlon.entity.Athlete;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResultRepository extends JpaRepository<Athlete, Long> {

}
