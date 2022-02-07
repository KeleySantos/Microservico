package br.com.tech4me.tech4microservice.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tech4me.tech4microservice.repository.JogosRepository;
import br.com.tech4me.tech4microservice.shared.JogosDto;
import br.com.tech4me.tech4microservice.view.model.Jogos;

@Service
public class JogosServiceImpl implements JogosService{
    
    @Autowired
    public JogosRepository repo;

    @Override
    public JogosDto cadastrarJogo(JogosDto jogo) {
        return salvarJogo(jogo);
    }

    @Override
    public List<JogosDto> obterTodos() {
        List<Jogos> jogo = repo.findAll();

        return jogo.stream()
            .map(jogos -> new ModelMapper().map(jogo, JogosDto.class))
            .collect(Collectors.toList());
    }

    @Override
    public Optional<JogosDto> obterJogoPorId(String id) {
       Optional<Jogos> jogo = repo.findById(id);

        
       if(jogo.isPresent()) {
        JogosDto dto = new ModelMapper().map(jogo.get(), JogosDto.class);
           return Optional.of(dto);
       }

       return Optional.empty();
    }

    @Override
    public void excluirJogo(String id) {
        repo.deleteById(id);
    }

    @Override
    public JogosDto atualizarJogo(String id, JogosDto jogo) {
        jogo.setId(id);
        return salvarJogo(jogo);
    }

    @Override
    public JogosDto salvarJogo(JogosDto jogo) {
        ModelMapper mapper = new ModelMapper();
        Jogos jogoEntidade = mapper.map(jogo, Jogos.class);
        jogoEntidade = repo.save(jogoEntidade);

        return mapper.map(jogoEntidade, JogosDto.class);
    }

    

   

    
    

    
}

