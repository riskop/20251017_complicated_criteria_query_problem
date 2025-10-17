package com.example.accessingdatajpa;

import jakarta.persistence.*;

@Entity
@Table(name = "PE")
public class Pe extends AbstractSu {

    @Column(name = "K", length = 32, nullable = false)
    private String k;

    public String getK() {
        return k;
    }

    public void setK(String k) {
        this.k = k;
    }
}
