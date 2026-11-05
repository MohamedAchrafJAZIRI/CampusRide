package com.campusride;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.campusride.model.City;
import com.campusride.model.Student;
import com.campusride.repository.CityRepository;
import com.campusride.repository.StudentRepository;

@SpringBootApplication
public class CampusRideApplication {

    public static void main(String[] args) {
        SpringApplication.run(CampusRideApplication.class, args);
    }

    // Demo data so Postman works right away (ids 1,2,3 for cities, 1,2 for students)
    @Bean
    CommandLineRunner seed(CityRepository cities, StudentRepository students) {
        return args -> {
            if (cities.count() == 0) {
                for (String n : new String[] { "Tunis", "Sousse", "Sfax" }) {
                    City c = new City();
                    c.setName(n);
                    cities.save(c);
                }
            }
            if (students.count() == 0) {
                Student a = new Student();
                a.setName("Mhissen");
                a.setEmail("mhissen@esprit.tn");
                students.save(a);
                Student b = new Student();
                b.setName("Sara");
                b.setEmail("sara@esprit.tn");
                students.save(b);
            }
        };
    }
}
