package com.example.accessingdatajpa;

import jakarta.persistence.*;

@Entity
@Table(name = "PR_PA")
public class PrPa {

    @Id
    @Column(name = "PA_ID")
    private Long paId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PR_ID")
    private Pr pr;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "SU_ID")
    private AbstractSu su;

    @Column(name = "PR_ROLE", nullable = false)
    private String prRole;

    public Long getPaId() {
        return paId;
    }

    public void setPaId(Long paId) {
        this.paId = paId;
    }

    public Pr getProvision() {
        return pr;
    }

    public void setProvision(Pr pr) {
        this.pr = pr;
    }

    public AbstractSu getSu() {
        return su;
    }

    public void setSu(AbstractSu su) {
        this.su = su;
    }

    public String getPrRole() {
        return prRole;
    }

    public void setPrRole(String prRole) {
        this.prRole = prRole;
    }
}
