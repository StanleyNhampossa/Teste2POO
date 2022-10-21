package controller;

import model.Usuario;

import java.util.ArrayList;
import java.util.Date;

public class UsuarioController {

    private final int KEY = 10;

    public boolean registarUsuario(String nome, String nomeUsuario, String email, Date dataDeNascimento,
                                   long contacto, String biografia, String senha){
        if(nome != null){
            Usuario usuario = new Usuario();
            usuario.setNome(nome);
            usuario.setNomeUsuario(nomeUsuario);
            usuario.setEmail(email);
            usuario.setDataDeNascimento(dataDeNascimento);
            usuario.setBiografia(biografia);
            usuario.setContacto(contacto);
            usuario.setSenha(senha);
            return usuario.registarUsuario(usuario);

        }


        return false;
    }


    public ArrayList<Usuario> listarTodos(){
        return new Usuario().listarTodosUsuarios();
    }

    public ArrayList<Usuario> pesquisar(String nome){
        return new Usuario().pesquisarUsuario(nome);
    }

    public boolean actualizarUsuario(int id, String nome, String nomeUsuario, String email, Date dataDeNascimento,
                                   long contacto, String biografia, String senha){
        if(nome != null){
            Usuario usuario = new Usuario();
            usuario.setId(id);
            usuario.setNome(nome);
            usuario.setNomeUsuario(nomeUsuario);
            usuario.setEmail(email);
            usuario.setDataDeNascimento(dataDeNascimento);
            usuario.setBiografia(biografia);
            usuario.setContacto(contacto);
            usuario.setSenha(senha);
            return usuario.actualizarUsuario(usuario);

        }

        return false;
    }

    public boolean deletarUsuario(int id){
        return new Usuario().deletarUsuario(id);
    }

    public String criptografar(String senha){
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        String criptografada = "";

        for(int i = 0; i < senha.length(); i++){
            int indiceDaLetra = (String.valueOf(senha.charAt(i)).hashCode() - "a".hashCode() +26+ KEY) % 26;
            criptografada += alfabeto.charAt(indiceDaLetra);
        }

        return criptografada;
    }

    public String decriptar(String senhaCriptografada){
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        String decriptografada = "";

        for(int i = 0; i < senhaCriptografada.length(); i++){
            int indiceDaLetra = (String.valueOf(senhaCriptografada.charAt(i)).hashCode() - "a".hashCode() + 26 - KEY) % 26;
            decriptografada += alfabeto.charAt(indiceDaLetra);
        }

        return decriptografada;
    }
    public boolean validarEmail(String email){
        return email.matches("^[A-Za-z0-9+.-]+@(.+)$");

    }
    
    public boolean in(String caracter1, String caracter2){
        for(int i = 0; i <= caracter1.length() - caracter2.length(); i++){
            if(caracter2.equalsIgnoreCase(caracter1.substring(i, i + caracter2.length() ))){
                return true;
            }
        }
        return false;
    }

}
