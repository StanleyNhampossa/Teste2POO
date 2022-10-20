package main;

import controller.UsuarioController;
import dao.Conexao;
import model.Usuario;

import java.sql.Connection;
import java.util.Date;

public class Teste {

    public static void main(String[] args) {
//        Connection connection = new Conexao().getConexao();
//        if(connection != null){
//            System.out.println("Yes");
//        }else{
//            System.out.println("nop");
//        }
//        String c = new UsuarioController().criptografar("nhampossa");
//        System.out.println(c);
//
//        String d = new UsuarioController().decriptar(c);
//        System.out.println(d);
//        System.out.println("n".hashCode());
//        U
        new UsuarioController().registarUsuario("Stanley", "SCAN", "Nhampossastanley@gmail.com", new Date(), 847975781, "Sou Stanley","123" );
    }

}
