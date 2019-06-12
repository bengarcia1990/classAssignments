package com.carshow.carstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.carshow.carstore.domain.Car;
import com.carshow.carstore.domain.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CarstoreApplication {
    private static final Logger log = LoggerFactory.getLogger(CarstoreApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(CarstoreApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(CarRepository repository) {
        return args -> {
            //save a couple cars
            repository.save(new Car("Mini", "Clubman"));
            repository.save(new Car("Mazda", "CX7"));
            repository.save(new Car("Honda", "Accord"));

            log.info("Inventory found with findAll(): ");
            log.info("---------------------------------");
            for(Car inventory : repository.findAll()){
                log.info(inventory.toString());
            }
            log.info("");

            //read an individual cust by ID
            repository.findById(1L)
                    .ifPresent(customer -> {
                        log.info("Customer found with findById(1L): ");
                        log.info("----------------------------------");
                        log.info(customer.toString());
                        log.info("");
                    });

            repository.findByModel("honda")
                            .forEach(customer -> {
                        log.info("Car found with findByModel(honda): ");
                        log.info("----------------------------------");
                        log.info(customer.toString());
                        log.info("");
                    });

        };
    }
}
