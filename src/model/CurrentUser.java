/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dao.CurrentUserDAO;

/**
 *
 * @author Stanley
 */
public class CurrentUser {

    private int id;
    private String nome;
    private String senha;
    private String metodoDeRecuperacao;
    private String resposta;

    public CurrentUser() {
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getMetodoDeRecuperacao() {
        return metodoDeRecuperacao;
    }

    public void setMetodoDeRecuperacao(String metodoDeRecuperacao) {
        this.metodoDeRecuperacao = metodoDeRecuperacao;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public boolean registarCurrentUser(CurrentUser currentUser){
        return new CurrentUserDAO().registarNewUser(currentUser);
    }

    public CurrentUser recuperar(){
        return new CurrentUserDAO().recuperar();
    }
    
    public boolean actualizarSenha(String senha){
        return new CurrentUserDAO().actualizarSenha(senha);
    }
}
