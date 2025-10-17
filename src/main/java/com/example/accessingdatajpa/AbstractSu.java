package com.example.accessingdatajpa;

import jakarta.persistence.*;

@Entity
@Table(name = "SU")
@Inheritance(strategy = InheritanceType.JOINED)
public class AbstractSu {

    @Id
    @Column(name = "SU_ID")
    private Long suId;

    @Column(name = "TYPE", nullable = false)
    protected String type;

    public Long getSuId() {
        return suId;
    }

    public void setSuId(Long subjectId) {
        this.suId = subjectId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
