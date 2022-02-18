package br.molina;


public class Pessoa {

    private String nome;

    private String endereco;

    private String telefone;


    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getNome() {
        return nome;
    }

    protected void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    protected String getEndereco() {
        return endereco;
    }

    protected void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    protected String getTelefone() {
        return telefone;
    }

}

