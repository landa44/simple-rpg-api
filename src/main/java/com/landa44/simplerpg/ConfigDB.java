package com.landa44.simplerpg;

import com.landa44.simplerpg.models.Hero;
import com.landa44.simplerpg.repositories.HeroRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ConfigDB {
    @Bean
    CommandLineRunner commandLineRunner(HeroRepository repository){
        return args -> {
            Hero fuco = new Hero(
                "fuco",
                100,
                30,
                20
            );

            Hero axes = new Hero(
                    "axes",
                    100,
                    30,
                    20
            );

            repository.saveAll(
                    List.of(fuco, axes)
            );
        };
    }
}
