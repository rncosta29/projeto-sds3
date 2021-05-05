package br.com.devcosta.dsvendas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.devcosta.dsvendas.dto.SaleDTO;
import br.com.devcosta.dsvendas.dto.SaleSuccessDTO;
import br.com.devcosta.dsvendas.dto.SaleSumDTO;
import br.com.devcosta.dsvendas.entities.Sale;
import br.com.devcosta.dsvendas.repositories.SaleRepository;
import br.com.devcosta.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		// Se houver muitos seller nao é recomendado essa pratica, Ela serve para armazenar em memória o seller
		// Assim o hibernate não faz diversas consultas
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amounGroupedBySaler() {
		return repository.amounGroupedBySaler();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySaler() {
		return repository.successGroupedBySaler();
	}
}
