package com.dev.DeclarationOnImpots.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dev.DeclarationOnImpots.Entity.DeclarationImpots;
import com.dev.DeclarationOnImpots.Entity.Exercice;
import org.springframework.stereotype.Repository;

@Repository
public interface DeclarationImpotsRepository extends JpaRepository<DeclarationImpots,Long>{
	
	 @Query("select c from DeclarationImpots c where c.IdDeclarationImpots = ?1")
	 DeclarationImpots findOne(Long IdDeclarationImpots);

}
