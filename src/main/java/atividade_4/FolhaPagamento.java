package atividade_4;

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
