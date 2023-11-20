package com.example.hajispringdemoboot.service;

import com.example.hajispringdemoboot.model.Employee;
import com.example.hajispringdemoboot.model.Leaders;
import com.example.hajispringdemoboot.repository.LeadersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LeadersService {
    private final LeadersRepository leadersRepository;

    public void insert(Leaders leaders){
        leadersRepository.save(leaders);
    }
}
