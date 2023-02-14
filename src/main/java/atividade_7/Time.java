package atividade_7;

public class Time {
    
    private String nome;
    private int qtdJogos;
    private int vitorias;
    private int empates;
    private int derrotas;
    private int golsPro;
    private int golsContra;

    public Time() {
    }

    public Time(String nome, int qtdJogos, int vitorias, int empates, int derrotas, int golsPro, int golsContra) {
        this.nome = nome;
        this.qtdJogos = qtdJogos;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
        this.golsPro = golsPro;
        this.golsContra = golsContra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdJogos() {
        return qtdJogos;
    }

    public void setQtdJogos(int qtdJogos) {
        this.qtdJogos = qtdJogos;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getGolsPro() {
        return golsPro;
    }

    public void setGolsPro(int golsPro) {
        this.golsPro = golsPro;
    }

    public int getGolsContra() {
        return golsContra;
    }

    public void setGolsContra(int golsContra) {
        this.golsContra = golsContra;
    }

    public double getPontos() {
        return (vitorias * 3) + empates;
    }

    public double getAproveitamento() { 
        return (double) this.getPontos() / (qtdJogos * 3);
    }

    public int getSaldoGols() {
        return golsPro - golsContra;
    }

    public int CompareTo(Time time) {
        if (this.getPontos() > time.getPontos()) {
            return 1;
        } else if (this.getPontos() < time.getPontos()) {
            return -1;
        } else {
            if (this.getSaldoGols() > time.getSaldoGols()) {
                return 1;
            } else if (this.getSaldoGols() < time.getSaldoGols()) {
                return -1;
            } else {
                if (this.getGolsPro() > time.getGolsPro()) {
                    return 1;
                } else if (this.getGolsPro() < time.getGolsPro()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }

    public String toString() {
        return String.format("\n TIME[ "+
            "\n nome: " + nome + 
            ",\n qtdJogos " + qtdJogos + 
            ",\n vitorias " + vitorias + 
            ",\n empates " + empates + 
            ",\n derrotas " + derrotas + 
            ",\n golsPro " + golsPro + 
            ",\n golsContra " + golsContra + 
            ",\n pontos " + this.getPontos() + 
            ",\n aproveitamento " + this.getAproveitamento() + 
            ",\n saldoGols " + this.getSaldoGols() + 
            "]"
        );
    }

    


}
