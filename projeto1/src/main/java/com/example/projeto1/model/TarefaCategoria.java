package com.example.projeto1.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tarefas_categoria")
public class TarefaCategoria {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


}
