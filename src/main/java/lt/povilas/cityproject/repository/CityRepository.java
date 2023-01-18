package lt.povilas.cityproject.repository;

import lt.povilas.cityproject.repository.model.City;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CityRepository extends CrudRepository<City, Integer> {
//    Optional<City> findbyCityId (int id);
    Optional<City> findByCityName (String cityName);
    Iterable<City> findByCityNameLike (String cityName);

}
