package com.gustavo.casorio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gustavo.casorio.model.Convidado;

@Repository
public interface ConvidadoRepository extends JpaRepository<Convidado, Long>{
	

}
