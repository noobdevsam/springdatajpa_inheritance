package com.example.springdatajpa_inheritance.domain.tableperclass;

import jakarta.persistence.Entity;

@Entity
public class Dolphin extends Mammal {
    
    private Boolean hasSpot;

    public Boolean getHasSpot() {
        return hasSpot;
    }

    public void setHasSpot(Boolean hasSpot) {
        this.hasSpot = hasSpot;
    }

}
