package atividade_6;

public class Pessoa {
    private static int count = 0;
    private int id;
    private String nome;
    private String cpf;
    private String rg;
    private String telefone;
    private String email;
    private Endereco[] enderecos;

    public Pessoa() {
        this.enderecos = new Endereco[10];
    }

    public Pessoa(int id, String nome, String cpf, String rg, String telefone, String email) {
        this.id = ++count;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.telefone = telefone;
        this.email = email;
        this.enderecos = new Endereco[10];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addEndereco(Endereco endereco) {
        this.enderecos[endereco.getId()] = endereco;
    }

    public String getEnderecosAtivos() {
        String texto = "Endereços ativos:";
        for (Endereco endereco : enderecos) {
            if (endereco != null && endereco.isAtivo()) {
                texto += "\n " + endereco.toString();
            }
        }
        return texto;
    }

    public String getEnderecosInativos() {
        String texto = "Endereços inativos:";
        for (Endereco endereco : enderecos) {
            if (endereco != null && !endereco.isAtivo()) {
                texto += "\n " + endereco.toString();
            }
        }
        return texto;
    }

    public String getEnderecos() {
        String texto = "Endereços:";
        for (Endereco endereco : enderecos) {
            if (endereco != null) {
                texto += "\n " + endereco.toString();
            }
        }
        return texto;
    }

    public int getQuantidadeEnderecosAtivos() {
        int quantidade = 0;
        for (Endereco endereco : enderecos) {
            if (endereco != null && endereco.isAtivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public int getQuantidadeEnderecosInativos() {
        int quantidade = 0;
        for (Endereco endereco : enderecos) {
            if (endereco != null && !endereco.isAtivo()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public Endereco[] getEndereco() {
        return enderecos;
    }

    public int getQuantidadeEnderecos() {
        return enderecos.length;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", endereco=" + getEnderecos() +
                '}';
    }    
}
