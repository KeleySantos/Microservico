package br.com.tech4me.tech4microservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.tech4me.tech4microservice.view.model.Jogos;

public interface JogosRepository extends MongoRepository<Jogos, String>{
    
}
