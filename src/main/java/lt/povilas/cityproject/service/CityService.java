package lt.povilas.cityproject.service;

import lt.povilas.cityproject.repository.CityRepository;
import lt.povilas.cityproject.repository.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public List<City> getAllCities(){
        return (List<City>) cityRepository.findAll();
    }
    public City getCityById(Integer cityId){
        return cityRepository.findById(cityId).get();
    }
    public City getCityByName(String cityName){
        return cityRepository.findByCityName(cityName).get();
    }
    public List <City> getCityByNameLike (String cityName){
        return (List<City>)  cityRepository.findByCityNameLike(cityName);
    }
}
