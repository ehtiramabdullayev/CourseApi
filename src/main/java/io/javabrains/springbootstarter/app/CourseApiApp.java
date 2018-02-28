package io.javabrains.springbootstarter.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


/**
 *
 * @author Master
// */
@SpringBootApplication(scanBasePackages={"io.javabrains"})
@EnableJpaRepositories("io.javabrains.springbootstarter.repository")
@EntityScan("io.javabrains.springbootstarter.bean")
public class CourseApiApp {
    
    public static void main(String[] args) {
        SpringApplication.run(CourseApiApp.class, args);
    }
    
    
}
