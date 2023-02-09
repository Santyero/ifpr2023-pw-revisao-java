package com.atividade_3;

public class Main {
    public static void main(String[] args) {
        String str = javax.swing.JOptionPane.showInputDialog("Digite os valores separados por vírgula: ");
        System.out.println(Utils.sort(str));    
    }
}
