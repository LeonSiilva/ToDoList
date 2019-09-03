package com.example.leonpsilva.todo_list.modelos;

public class Tarefa {

    private String id;
    private String nome;
    private Boolean status;
    private String descricao;


    public Tarefa(String id, String nome, String descricao, Boolean status) {
        this.id = id;
        this.nome = nome;
        this.status = status;
        this.descricao = descricao;

    }

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

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
