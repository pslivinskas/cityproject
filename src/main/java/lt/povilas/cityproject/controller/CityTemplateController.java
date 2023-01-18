package lt.povilas.cityproject.controller;

import lt.povilas.cityproject.repository.model.City;
import lt.povilas.cityproject.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping (path = "/citytemplate")
public class CityTemplateController {
    @Autowired
    private CityService cityService;
    // http://localhost:8080/citytemplate/test
    @GetMapping(path = "/test")
    public String getTestPage(){
        return "/test/test_page";
    }
//@GetMapping(path = "/firstpage/city/{id}")
//public String getCityFirstPage(Model model, @PathVariable int id) {
//
//    City city = cityService.getCityById(id);
//    model.addAttribute("id", city.getCityId());
//    model.addAttribute("city_name", city.getCityName());
//    model.addAttribute("city_country_code", city.getCityCountryCode());
//
//    return "/test/firstpage";

}

