package br.com.tech4me.tech4microservice.view.model;

import java.time.LocalDate;

public class Jogos {

    private String id;
    private String nome;
    private String genero;
    private String criador;
    private String empresaDesenvolvedora;
    private LocalDate dataLancamento;
    private String plataforma;
    private int classificacao;
   
    public String getId() {
        return id;
    }

    public void setId(String id) {
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
    /**
     * @param empresaDesenvolvedora the empresaDesenvolvedora to set
     */
    public void setEmpresaDesenvolvedora(String empresaDesenvolvedora) {
        this.empresaDesenvolvedora = empresaDesenvolvedora;
    }
    /**
     * @return the dataLancamento
     */
    public LocalDate getDataLancamento() {
        return dataLancamento;
    }
    /**
     * @param dataLancamento the dataLancamento to set
     */
    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
    /**
     * @return the plataforma
     */
    public String getPlataforma() {
        return plataforma;
    }
    /**
     * @param plataforma the plataforma to set
     */
    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
    /**
     * @return the classificacao
     */
    public int getClassificacao() {
        return classificacao;
    }
    /**
     * @param classificacao the classificacao to set
     */
    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    @Override
    public String toString() {
        return "Jogos [id=" + id + ", nome=" + nome + ", genero=" + genero + ", Classificação=" + classificacao;
    }

    
    
    
}
