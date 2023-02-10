
package atividade_1;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
        JOptionPane.showMessageDialog(null, pessoa.classificarIdade());    
    }    
}

