package com.dasafioapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dasafioapi.domain.model.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
    
}
