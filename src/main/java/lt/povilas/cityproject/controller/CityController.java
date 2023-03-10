package lt.povilas.cityproject.controller;

import lt.povilas.cityproject.repository.model.City;
import lt.povilas.cityproject.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(path = "/citymapping")
public class CityController {
    @Autowired
    private CityService cityService;

    // http://localhost:8080/citymapping/city/all
    @GetMapping(path = "/city/all")
    public @ResponseBody List<City> getAllCities() {
        return cityService.getAllCities();
    }

    // http://localhost:8080/citymapping/city/112
    @GetMapping(path = "/city/{id}")
    public @ResponseBody City getCityById(@PathVariable int id) {
        return cityService.getCityById(id);
    }

    // http://localhost:8080/citymapping/city/like/Odessa
    @GetMapping(path = "/city/like/{name}")
    public @ResponseBody List<City> getCityByNameLike(@PathVariable String name) {
        return cityService.getCityByNameLike("%" + name + "%");
    }
}


