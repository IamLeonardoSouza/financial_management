package com.example.financial_management.controller;

import com.example.financial_management.model.Transacao;
import com.example.financial_management.repository.TransacaoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TransacaoViewController {

    private final TransacaoRepository transacaoRepository;

    // Injeta o repositório via construtor
    public TransacaoViewController(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;
    }

    @GetMapping("/transacoes/nova")
    public String novaTransacaoForm(Model model) {
        model.addAttribute("transacao", new Transacao());
        return "nova-transacao";
    }

    @PostMapping("/transacoes/adicionar")
    public String adicionarTransacao(Transacao transacao) {
        // Salva a transação no banco de dados
        transacaoRepository.save(transacao);
        return "redirect:/transacoes/listar"; // Redireciona para a lista de transações
    }

    @GetMapping("/transacoes/listar")
    public String listarTransacoes(Model model) {
        model.addAttribute("transacoes", transacaoRepository.findAll());
        return "listar-transacoes";
    }
}
