package com.daemon.sistema.rpg.api.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class FichaDto {

    @NotBlank
    @Size(max = 200)
    private String nome;

    @Size(max = 50)
    private String classeSocialProfissao;

    @NotNull
    private Integer nivel;

    private String dataNascimento;

    @Size(max = 100)
    private String localNascimento;

    @Size(max = 50)
    private String sexo;

    private Float altura;

    private Float peso;

    private Integer idadeAparente;

    private Integer idadeReal;

    @Size(max = 50)
    private String religiao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasseSocialProfissao() {
        return classeSocialProfissao;
    }

    public void setClasseSocialProfissao(String classeSocialProfissao) {
        this.classeSocialProfissao = classeSocialProfissao;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    public Integer getIdadeAparente() {
        return idadeAparente;
    }

    public void setIdadeAparente(Integer idadeAparente) {
        this.idadeAparente = idadeAparente;
    }

    public Integer getIdadeReal() {
        return idadeReal;
    }

    public void setIdadeReal(Integer idadeReal) {
        this.idadeReal = idadeReal;
    }

    public String getReligiao() {
        return religiao;
    }

    public void setReligiao(String religiao) {
        this.religiao = religiao;
    }
}
