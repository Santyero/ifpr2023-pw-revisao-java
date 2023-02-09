// Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita).
// O Salário Líquido corresponde ao Salário Bruto menos os descontos.
// O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês. 
// Crie uma classe que permita criar várias instâncias da folha de pagamento.
// Desconto do IR:
// - Salário Bruto até 900 (inclusive) - isento
// - Salário Bruto até 1500 (inclusive) - desconto de 5%
// - Salário Bruto até 2500 (inclusive) - desconto de 10%
// - Salário Bruto acima de 2500 - desconto de 20% 
// Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.
//         Salário Bruto: (5 * 220)        : R$ 1100,00
//         (-) IR (5%)                     : R$   55,00  
//         (-) INSS ( 10%)                 : R$  110,00
//         FGTS (11%)                      : R$  121,00
//         Total de descontos              : R$  165,00
//         Salário Líquido                 : R$  935,00

package com.atividade_4;

import javax.swing.JOptionPane;

public class FolhaPagamento {
    private double valorHora;
    private int horasTrabalhadas;
    private double salarioBruto;
    private double salarioLiquido;
    private double descontoIR;
    private double descontoINSS;
    private double descontoSindicato;
    private double descontoFGTS;

    public FolhaPagamento(double valorHora, int horasTrabalhadas) {
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
        this.salarioBruto = this.valorHora * this.horasTrabalhadas;
        this.descontoIR = this.calcularIR();
        this.descontoINSS = this.calcularINSS();
        this.descontoSindicato = this.calcularSindicato();
        this.descontoFGTS = this.calcularFGTS();
        this.salarioLiquido = this.calcularSalarioLiquido();
    }

    public double calcularIR() {
        if (this.salarioBruto <= 900) {
            return 0;
        }
        if (this.salarioBruto <= 1500) {
            return this.salarioBruto * 0.05;
        }
        if (this.salarioBruto <= 2500) {
            return this.salarioBruto * 0.1;
        }
        return this.salarioBruto * 0.2;
    }

    public double calcularINSS() {
        return this.salarioBruto * 0.1;
    }

    public double calcularSindicato() {
        return this.salarioBruto * 0.03;
    }

    public double calcularFGTS() {
        return this.salarioBruto * 0.11;
    }

    public double calcularSalarioLiquido() {
        return this.salarioBruto - this.descontoIR - this.descontoINSS - this.descontoSindicato;
    }

    public double getValorHora() {
        return this.valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getSalarioBruto() {
        return this.salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioLiquido() {
        return this.salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public double getDescontoIR() {
        return this.descontoIR;
    }

    public void setDescontoIR(double descontoIR) {
        this.descontoIR = descontoIR;
    }

    public double getDescontoINSS() {
        return this.descontoINSS;
    }

    public void setDescontoINSS(double descontoINSS) {
        this.descontoINSS = descontoINSS;
    }

    public double getDescontoSindicato() {
        return this.descontoSindicato;
    }

    public void imprimirFolhaPagamento() {
        JOptionPane.showMessageDialog(null, 
            "Salário Bruto: (" + this.valorHora + " * " + this.horasTrabalhadas + ") : R$ " + this.salarioBruto + 
            "\n (-) IR (" + this.descontoIR + "%) : R$ " + this.descontoIR +
            "\n (-) INSS (" + this.descontoINSS + "%) : R$ " + this.descontoINSS +
            "\n (-) Sindicato (" + this.descontoSindicato + "%) : R$ " + this.descontoSindicato +
            "\n FGTS (" + this.descontoFGTS + "%) : R$ " + this.descontoFGTS +
            "\n Total de descontos : R$ " + (this.descontoIR + this.descontoINSS + this.descontoSindicato) +
            "\n Salário Líquido : R$ " + this.salarioLiquido
        );
    }
}
