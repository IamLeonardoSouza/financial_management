package com.example.financial_management.controller;

import com.example.financial_management.model.Usuario;
import com.example.financial_management.service.UsuarioService;
import com.example.financial_management.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private JwtUtil jwtUtil;  // Injeção do JwtUtil

    @PostMapping("/signup")
    public Usuario signup(@RequestBody Usuario usuario) {
        return usuarioService.save(usuario);
    }

    @PostMapping("/login")
    public String login(@RequestBody Usuario usuario) {
        Optional<Usuario> user = usuarioService.findByEmail(usuario.getEmail());
        if (user.isPresent() && user.get().getSenha().equals(usuario.getSenha())) {
            return jwtUtil.generateToken(user.get().getEmail());
        }
        throw new RuntimeException("Credenciais inválidas!");
    }
}
