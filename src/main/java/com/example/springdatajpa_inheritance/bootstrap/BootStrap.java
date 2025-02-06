package com.example.springdatajpa_inheritance.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.springdatajpa_inheritance.domain.jointable.ElectricGuitar;
import com.example.springdatajpa_inheritance.repositories.ElectricGuitarRepository;

@Component
public class BootStrap implements CommandLineRunner {

    private final ElectricGuitarRepository electricGuitarRepository;

    public BootStrap(ElectricGuitarRepository electricGuitarRepository) {
        this.electricGuitarRepository = electricGuitarRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        
        var electric_guitar = new ElectricGuitar();
        electric_guitar.setNumberOfStrings(6);
        electric_guitar.setNumberOfPickups(2);

        electricGuitarRepository.save(electric_guitar);
        
    }
    
}
