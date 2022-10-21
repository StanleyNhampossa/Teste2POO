/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.CurrentUser;

/**
 *
 * @author Stanley
 */
public class CurrentUserController {

    public boolean registarCurrentUser(String nome, String senha, String metodo, String resposta){
        if(nome != null){
            CurrentUser currentUser = new CurrentUser();
            currentUser.setNome(nome);
            currentUser.setSenha(senha);
            currentUser.setMetodoDeRecuperacao(metodo);
            currentUser.setResposta(resposta);
            return currentUser.registarCurrentUser(currentUser);

        }

        return false;
    }

    public CurrentUser recuperar(){
        return new CurrentUser().recuperar();
    }

    public void actualizarLembrarMe(boolean lembrarMe){
        new CurrentUser().actualizarLembrarMe(lembrarMe);
    }
    
    public boolean actualizarSenha(String senha){
        return new CurrentUser().actualizarSenha(senha);
    }
}
