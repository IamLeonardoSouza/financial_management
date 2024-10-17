package com.example.financial_management.repository;

import com.example.financial_management.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
    List<Transacao> findByTipo(String tipo);
}
