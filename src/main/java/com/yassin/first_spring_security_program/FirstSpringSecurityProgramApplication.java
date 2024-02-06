package com.yassin.first_spring_security_program;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@SpringBootApplication
public class FirstSpringSecurityProgramApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstSpringSecurityProgramApplication.class, args);
    }

}
