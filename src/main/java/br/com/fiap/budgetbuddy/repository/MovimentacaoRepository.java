package br.com.fiap.budgetbuddy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.budgetbuddy.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Long> {
    
}
