package br.com.devcosta.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.devcosta.dsvendas.entities.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {

}
