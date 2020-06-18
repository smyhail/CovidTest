package com.aub.CovidTest.repositories;

import com.aub.CovidTest.entities.Persons;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CovidRepository extends JpaRepository<Persons, Integer> {

}