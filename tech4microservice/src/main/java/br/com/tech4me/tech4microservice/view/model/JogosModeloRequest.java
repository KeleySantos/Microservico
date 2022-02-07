package br.com.tech4me.tech4microservice.view.model;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class JogosModeloRequest {
    
    @NotBlank(message = "O nome não pode estar vázio")
    private String nome;
    @NotBlank(message = "O genero não pode estar vázio")
    private String genero;
    @NotBlank(message = "O criador não pode estar vázio")
    private String criador;
    @NotBlank(message = "A empresa desenvolvedora não pode estar vázia")
    private String empresaDesenvolvedora;
    @Size(message = "A data de lançamento não pode conter menos de 4 números")
    @Positive(message = "A data não pode estar zerada!")
    private LocalDate dataLancamento;
    @NotBlank(message = "A plataforma não pode estar vázia!")
    private String plataforma;
    @Size(message = "A classificação não pode conter menos de 4 números")
    @Positive(message = "A data não pode estar zerada!")
    private int classificacao;
   
    public String getNome() {
        return nome;
    }
   
    public void setNome(String nome) {
        this.nome = nome;
    }
   
    public String getGenero() {
        return genero;
    }
   
    public void setGenero(String genero) {
        this.genero = genero;
    }
   
    public String getCriador() {
        return criador;
    }
   
    public void setCriador(String criador) {
        this.criador = criador;
    }
    
    public String getEmpresaDesenvolvedora() {
        return empresaDesenvolvedora;
    }
   
    public void setEmpresaDesenvolvedora(String empresaDesenvolvedora) {
        this.empresaDesenvolvedora = empresaDesenvolvedora;
    }
    
    public LocalDate getDataLancamento() {
        return dataLancamento;
    }
   
    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
   
    public String getPlataforma() {
        return plataforma;
    }
   
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
   
    public int getClassificacao() {
        return classificacao;
    }
    
    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    
}
