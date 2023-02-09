package com.example.demo.atividade_6;

import javax.swing.JOptionPane;

// Implemente uma solução para gestão de dados de clientes, que deverá contemplar as seguintes regras:
// - Deverá ter classes para cliente e uma para endereço. Um cliente pode ter vários endereços, como representar? Você definirá os atributos de cada classe.
// - Incluir um campo ID para todas as classes, que deverá ser gerado de forma automática;
// - Implementar métodos para incluir clientes e endereços. Onde devemos colocar esses métodos?
// - Adicione o toString na classe cliente para mostrar as informações dos atributos da classe e sua associação;
// - Deverá ter um método para retornar a quantidade de endereços ativos do cliente;
// - Incluir um método para exibir todos os endereços, os ativos e inativos do cliente;
// - Não é necessário interface gráfica. Incluir uma classe principal para executar e testar as classes e métodos criados.


public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setCpf("123.456.789-00");
        pessoa.setRg("12.345.678-9");
        pessoa.setTelefone("11 99999-9999");
        pessoa.setEmail("aa@gg.co");
        pessoa.addEndereco(new Endereco(1, "Rua 1", "Bairro 1", "Cidade 1", "Estado 1", "12345-678", true));
        pessoa.addEndereco(new Endereco(2, "Rua 2", "Bairro 2", "Cidade 2", "Estado 2", "12345-678", true));
        pessoa.addEndereco(new Endereco(3, "Rua 3", "Bairro 3", "Cidade 3", "Estado 3", "12345-678", false));
        
        JOptionPane.showMessageDialog(null, pessoa.toString());
        JOptionPane.showMessageDialog(null, "Quantidade de endereços ativos:" + pessoa.getQuantidadeEnderecosAtivos());
        JOptionPane.showMessageDialog(null, "Quantidade de endereços inativos:" + pessoa.getQuantidadeEnderecosInativos());
        JOptionPane.showMessageDialog(null, pessoa.getEnderecos());
        JOptionPane.showMessageDialog(null, pessoa.getEnderecosAtivos());
        JOptionPane.showMessageDialog(null, pessoa.getEnderecosInativos());
    }    
}
