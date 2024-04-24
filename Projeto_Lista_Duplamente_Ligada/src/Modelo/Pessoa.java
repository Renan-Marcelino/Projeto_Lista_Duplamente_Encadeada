/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author renan.mssouza
 */
public class Pessoa { //TAD
    private String nome;
    private int idade;
    private int id;
    private static int contador=1;
    
    public Pessoa(){}
    
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.id = contador++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome: " + nome + ", idade: " + idade + ", id: " + id + '}';
    }
    
}
