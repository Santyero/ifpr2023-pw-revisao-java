// Implemente uma classe que deverá, quando executada, solicitar valores separados por vírgula e apresentar esses valores na ordem inversa.
// A inversão dos valores deverá ser feita em um método separado.
// Solicitar as informações ao usuário utilizando um JoptionPane.showInputDialog. 
package com.atividade_2;

public class Main {
    public static void main(String[] args) {
        String str = javax.swing.JOptionPane.showInputDialog("Digite os valores separados por vírgula: ");
        System.out.println(Utils.reverse(str));    
    }
}
