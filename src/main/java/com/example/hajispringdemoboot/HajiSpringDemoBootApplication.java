package com.example.hajispringdemoboot;

import com.example.hajispringdemoboot.model.Employee;
import com.example.hajispringdemoboot.model.Leaders;
import com.example.hajispringdemoboot.service.EmployeeService;
import com.example.hajispringdemoboot.service.LeadersService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.HashMap;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class HajiSpringDemoBootApplication implements CommandLineRunner {

    private final EmployeeService employeeService;
    private final LeadersService leadersService;

    public static void main(String[] args) {
       SpringApplication.run(HajiSpringDemoBootApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
