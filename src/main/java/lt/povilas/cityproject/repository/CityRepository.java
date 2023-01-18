package lt.povilas.cityproject.repository;

import lt.povilas.cityproject.repository.model.City;
import org.springframework.data.repository.CrudRepository;

public interface CityRepository extends CrudRepository<City, Integer> {
    
}
