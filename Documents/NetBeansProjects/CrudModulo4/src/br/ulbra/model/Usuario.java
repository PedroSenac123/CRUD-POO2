
package br.ulbra.model;

public class Usuario {
    
    private int id;
    private String nome;
    private String login;
    private String senha;
    private boolean ativo;

    public Usuario() {
    }

    public Usuario(int id, String nome, String login, String senha, Boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.ativo = ativo;
    }

    public Usuario(int id, String nome, String login, Boolean ativo) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.ativo = ativo;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public Boolean isAtivo() {
        return ativo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    
}
