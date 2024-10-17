package com.example.financial_management.service;

import com.example.financial_management.model.Transacao;
import com.example.financial_management.repository.TransacaoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TransacaoService {

    private final TransacaoRepository repository;

    public TransacaoService(TransacaoRepository repository) {
        this.repository = repository;
    }

    public List<Transacao> listarTodas() {
        return repository.findAll();
    }

    public List<Transacao> listarPorTipo(String tipo) {
        return repository.findByTipo(tipo);
    }

    public Transacao salvar(Transacao transacao) {
        return repository.save(transacao);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
