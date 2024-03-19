package br.com.fiap.budgetbuddy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.budgetbuddy.model.Locacao;

public interface LocacaoRepository extends JpaRepository<Locacao, Long> {

}