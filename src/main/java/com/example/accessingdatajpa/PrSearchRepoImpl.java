package com.example.accessingdatajpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.*;

import com.example.accessingdatajpa.Pr_;

import java.util.ArrayList;
import java.util.List;

public class PrSearchRepoImpl implements PrSearchRepoCustom {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Pr> searchPr() {
        CriteriaBuilder builder = em.getCriteriaBuilder();
        CriteriaQuery<Pr> query = builder.createQuery(Pr.class);
        Root<Pr> root = query.from(Pr.class);
        query.select(root);
        List<Predicate> predicateList = new ArrayList<>();
        predicateList.add(builder.equal(root.get(Pr_.PR_ID), 222L));

        Predicate[] predicates = new Predicate[predicateList.size()];
        predicateList.toArray(predicates);

        Join<Pr, PrPa> participantsJoin = root.join(Pr_.pas);
        Join<PrPa, AbstractSu> abstractSubjectJoin = participantsJoin.join(PrPa_.su);
        Path<Pe> subjectPerson = builder.treat(abstractSubjectJoin, Pe.class);

        //
        query.where(predicates);
        List<Pr> result = em.createQuery(query).getResultList();

        return result;
    }

}
