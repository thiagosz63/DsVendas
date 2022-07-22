package com.tsa.DsVenda.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsa.DsVenda.dto.SellerDTO;
import com.tsa.DsVenda.entities.Seller;
import com.tsa.DsVenda.repositories.SellerRepository;

@Service
public class SellerService {

	@Autowired
	SellerRepository sellerRepository;

	public List<SellerDTO> findAll() {

		List<Seller> result = sellerRepository.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
}
