package com.tsa.DsVenda.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tsa.DsVenda.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
