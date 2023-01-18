package lt.povilas.cityproject.bootstrap;

import lt.povilas.cityproject.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public void run(String... args) throws Exception {
        cityRepository.findAll().forEach(System.out::println);
        System.out.println("\n==============================\n");
        System.out.println(cityRepository.findById(1));
        System.out.println("\n==============================\n");

    }
}
