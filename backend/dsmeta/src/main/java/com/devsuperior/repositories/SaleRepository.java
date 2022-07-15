package com.devsuperior.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmeta.entities.Sale;


public interface SaleRepository extends JpaRepository<Sale, Long> {

}
