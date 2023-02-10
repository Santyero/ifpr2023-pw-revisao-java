package atividade_5.enums;

public enum Imc {
    ABAIXO_DO_PESO("Abaixo do peso"),
    PESO_IDEAL("Peso ideal"),
    MARGINALMENTE_ACIMA_DO_PESO("Marginalmente acima do peso"),
    ACIMA_DO_PESO_IDEAL("Acima do peso ideal"),
    OBESO("Obeso");

    private final String descricao;

    Imc(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
