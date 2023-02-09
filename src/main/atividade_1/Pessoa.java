package com.atividade_1;

public class Pessoa {
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String classificarIdade() {
        if (this.idade < 12) {
            return "Criança";
        } 
        if (this.idade < 18) {
            return "Adolescente";
        } 
        if (this.idade < 60) {
            return "Adulto";
        }
        return "Idoso";
    }
}
