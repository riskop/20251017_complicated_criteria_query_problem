package com.example.accessingdatajpa;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "PR")
public class Pr {

    @Id
    @Column(name = "PR_ID")
    private Long prId;

    @Column(name = "PR_NUM", length = 10, nullable = false)
    private Long prNum;

    @OneToMany(mappedBy = "pr", fetch = FetchType.LAZY)
    private Set<PrPa> pas;

    public Long getPrId() {
        return prId;
    }

    public void setPrId(Long prId) {
        this.prId = prId;
    }

    public Long getPrNum() {
        return prNum;
    }

    public void setPrNum(Long prNum) {
        this.prNum = prNum;
    }

    public Set<PrPa> getPas() {
        return pas;
    }

    public void setPas(Set<PrPa> pas) {
        this.pas = pas;
    }
}
