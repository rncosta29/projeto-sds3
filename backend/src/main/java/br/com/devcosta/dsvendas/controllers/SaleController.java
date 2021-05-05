package br.com.devcosta.dsvendas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devcosta.dsvendas.dto.SaleDTO;
import br.com.devcosta.dsvendas.dto.SaleSuccessDTO;
import br.com.devcosta.dsvendas.dto.SaleSumDTO;
import br.com.devcosta.dsvendas.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService service;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
		Page<SaleDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/amount-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amounGroupedBySaler() {
		List<SaleSumDTO> list = service.amounGroupedBySaler();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/success-by-seller")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySaler() {
		List<SaleSuccessDTO> list = service.successGroupedBySaler();
		return ResponseEntity.ok(list);
	}
}
