package com.fabricy.zoologico.model;

public class Animal {

    private String nome;
    private int id, idade;
    private Especie especie;

    public Animal(){


    }

    public Animal(String nome, int id, int idade, Especie especie) {
        this.nome = nome;
        this.id = id;
        this.idade = idade;
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) { this.especie = especie; }

    @Override
    public String toString() {return nome;

    }
}
