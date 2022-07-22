package com.tsa.DsVenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsa.DsVenda.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
