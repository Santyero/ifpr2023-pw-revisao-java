package atividade_5;

public class Pessoa extends IMC{
    private String sexo;
    private String peso;
    private String altura;
    
    public Pessoa() {
    }

    public Pessoa(String sexo, String peso, String altura) {
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getImc() {
        return calcularIMC(sexo, peso, altura).getDescricao();
    }
}
