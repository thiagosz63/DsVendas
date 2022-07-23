package com.tsa.DsVenda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tsa.DsVenda.dto.SaleDTO;
import com.tsa.DsVenda.dto.SaleSuccessDTO;
import com.tsa.DsVenda.dto.SaleSumDTO;
import com.tsa.DsVenda.entities.Sale;
import com.tsa.DsVenda.repositories.SaleRepository;
import com.tsa.DsVenda.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	SaleRepository saleRepository;

	@Autowired
	SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> result = saleRepository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller(){
		return saleRepository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller(){
		return saleRepository.successGroupedBySeller();
	}
}
