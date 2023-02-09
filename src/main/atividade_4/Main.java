package com.atividade_4;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora: "));
        int horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: "));
        FolhaPagamento folha = new FolhaPagamento(valorHora, horasTrabalhadas);
        folha.imprimirFolhaPagamento();
    }
}
