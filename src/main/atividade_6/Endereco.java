// Implemente uma solução para gestão de dados de clientes, que deverá contemplar as seguintes regras:
// - Deverá ter classes para cliente e uma para endereço. Um cliente pode ter vários endereços, como representar? Você definirá os atributos de cada classe.
// - Incluir um campo ID para todas as classes, que deverá ser gerado de forma automática;
// - Implementar métodos para incluir clientes e endereços. Onde devemos colocar esses métodos?
// - Adicione o toString na classe cliente para mostrar as informações dos atributos da classe e sua associação;
// - Deverá ter um método para retornar a quantidade de endereços ativos do cliente;
// - Incluir um método para exibir todos os endereços, os ativos e inativos do cliente;
// - Não é necessário interface gráfica. Incluir uma classe principal para executar e testar as classes e métodos criados.

package com.atividade_6;

public class Endereco {
    private int id;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private boolean ativo;

    public Endereco(int id, String rua, String bairro, String cidade, String estado, String cep, boolean ativo) {
        this.id = id;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.ativo = ativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    @Override
    public String toString() {
        return "Endereco [bairro=" + bairro + ", cep=" + cep + ", cidade=" + cidade + ", estado=" + estado + ", id=" + id
                + ", rua=" + rua + "]";
    }
}
