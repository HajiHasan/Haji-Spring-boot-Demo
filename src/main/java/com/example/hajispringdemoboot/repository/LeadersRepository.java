package com.example.hajispringdemoboot.repository;

import com.example.hajispringdemoboot.model.Leaders;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeadersRepository  extends CrudRepository<Leaders, Integer> {

}
