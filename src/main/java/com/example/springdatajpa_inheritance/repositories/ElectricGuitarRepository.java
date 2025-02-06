package com.example.springdatajpa_inheritance.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springdatajpa_inheritance.domain.jointable.ElectricGuitar;

public interface ElectricGuitarRepository extends JpaRepository<ElectricGuitar, Long>{
    
}
