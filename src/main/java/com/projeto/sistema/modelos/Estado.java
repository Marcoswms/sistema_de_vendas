package com.projeto.sistema.modelos;
//JPA - Conjunto de regras que facilita as interações com o Banco de Dados.
//Hebernate - Quem execura as regras do JPA.

import jakarta.persistence.*;

import java.io.Serializable;

@Entity//Identifica como representação do Banco de Dados.
@Table(name = "estado")//Adiciona o nome no Banco de Dados
public class Estado implements Serializable {
    private static final long serialVersionUID = 1L;//Geração de ID automático
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String sigla;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}