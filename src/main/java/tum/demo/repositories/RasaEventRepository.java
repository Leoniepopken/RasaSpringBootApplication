package tum.demo.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tum.demo.entites.RasaEvent;

@Repository
public interface RasaEventRepository extends CrudRepository<RasaEvent, Long> {
}
