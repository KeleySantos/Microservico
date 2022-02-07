package br.com.tech4me.tech4microservice.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4me.tech4microservice.shared.JogosDto;

public interface JogosService {
    
    JogosDto cadastrarJogo(JogosDto jogos);
    List<JogosDto> obterTodos();
    void excluirJogo(String id);
    JogosDto atualizarJogo(String id, JogosDto jogo);
    JogosDto salvarJogo(JogosDto jogo);
    Optional<JogosDto> obterJogoPorId(String id);
}
