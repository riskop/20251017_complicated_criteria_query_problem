package com.example.accessingdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PrSearchRepo extends JpaRepository<Pr, Long>, PrSearchRepoCustom {

	Pr findById(long id);

}
