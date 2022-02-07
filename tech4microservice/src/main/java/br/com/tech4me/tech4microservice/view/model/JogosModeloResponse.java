package br.com.tech4me.tech4microservice.view.model;

import java.time.LocalDate;

public class JogosModeloResponse {
    
    private Integer id;
    private String nome;
    private String genero;
    private String criador;
    private String empresaDesenvolvedora;
    private LocalDate dataLancamento;
    private String plataforma;
    private int classificacao;
    
    public Integer getId() {
        return id;
    }
   
    public void setId(Integer id) {
        this.id = id;
    }
  
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
