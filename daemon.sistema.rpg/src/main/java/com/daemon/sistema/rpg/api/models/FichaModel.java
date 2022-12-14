package com.daemon.sistema.rpg.api.models;

import javax.persistence.*;
import java.io.Serializable;

import java.util.UUID;

@Entity
@Table(name = "FICHA")
public class FichaModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 200)
    private String nome;

    @Column(length = 50)
    private String classeSocialProfissao;

    @Column(nullable = false)
    private Integer nivel;

    private String dataNascimento;

    @Column(length = 100)
    private String localNascimento;

    @Column(length = 50)
    private String sexo;

    private Float altura;

    private Float peso;

    private Integer idadeAparente;

    private Integer idadeReal;

    @Column(length = 50)
    private String religiao;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

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

    public void setSexo(String orientacaoSexual) {
        this.sexo = orientacaoSexual;
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




