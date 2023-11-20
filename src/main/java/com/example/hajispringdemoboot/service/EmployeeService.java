package com.example.hajispringdemoboot.service;

import com.example.hajispringdemoboot.model.Employee;
import com.example.hajispringdemoboot.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public List<Employee> getALlEmployees(){
        return (List<Employee>) employeeRepository.findAll();
    }
    public Optional<Employee> getEmployeeById(int id){
        return Optional.ofNullable(employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("id not found")));
    }

    public void insert(Employee employee){
        employeeRepository.save(employee);
    }

    public void update(Employee employee){
        employeeRepository.save(employee);
    }

    public void delete(int id){
        employeeRepository.deleteById(id);
    }
    public List<Employee> getEmployeeByName(String name){
        return employeeRepository.findByName(name);
    }


}
