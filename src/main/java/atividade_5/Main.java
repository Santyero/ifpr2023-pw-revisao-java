package atividade_5;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setPeso(JOptionPane.showInputDialog("Digite seu peso: "));
        pessoa.setAltura(JOptionPane.showInputDialog("Digite sua altura: "));
        pessoa.setSexo(JOptionPane.showInputDialog("Digite seu sexo: "));
        JOptionPane.showMessageDialog(null, pessoa.getImc());
        
    }
}
