package com.example.financial_management.controller;

import com.example.financial_management.model.Transacao;
import com.example.financial_management.service.TransacaoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transacoes")
public class TransacaoController {

    private final TransacaoService service;

    public TransacaoController(TransacaoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Transacao> listarTodas() {
        return service.listarTodas();
    }

    @GetMapping("/{tipo}")
    public List<Transacao> listarPorTipo(@PathVariable String tipo) {
        return service.listarPorTipo(tipo);
    }

    @PostMapping
    public Transacao salvar(@RequestBody Transacao transacao) {
        return service.salvar(transacao);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
