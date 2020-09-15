package Archaether.RestServiceSpring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {
    
    private static final Logger log = 
    LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new 
            Employee("Bilbo Baggins", "burglar")));
            log.info("Preloading " + repository.save (new 
            Employee("Frodo Baggins", "thief")));
        };
    }
}
/*  Spring Boot will run all CommandLineRunner beans when the
    context is loaded.

    This runner will request a copy of the EmployeeRepository

    It will create the two entities: Bilbo and Frodo

*/