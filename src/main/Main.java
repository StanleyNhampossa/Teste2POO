/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import controller.CurrentUserController;
import model.CurrentUser;
import view.TelaCriarNovaConta;
import view.TelaLogin;
import view.TelaMenuPrincipal;

/**
 *
 * @author Stanley
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CurrentUser user = new CurrentUserController().recuperar();
        if(user != null){
            if(user.isLembrarMe()){
                TelaMenuPrincipal telaMenuPrincipal = new TelaMenuPrincipal(user);
                telaMenuPrincipal.setVisible(true);
            }
            else new TelaLogin().setVisible(true);
        }else{
            new TelaCriarNovaConta().setVisible(true);
        }
    }
    
}
