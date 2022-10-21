package model;

import dao.UsuarioDAO;

import java.util.ArrayList;
import java.util.Date;

public class Usuario {

    private int id;
    private String nome;
    private String email;
    private String nomeUsuario;
    private String biografia;
    private String senha;
    private Date dataDeNascimento;
    private long contacto;

    public Usuario() {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public long getContacto() {
        return contacto;
    }

    public void setContacto(long contacto) {
        this.contacto = contacto;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", nomeUsuario='" + nomeUsuario + '\'' +
                ", biografia='" + biografia + '\'' +
                ", senha='" + senha + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                ", contacto=" + contacto +
                '}';
    }

    public boolean registarUsuario(Usuario usuario){
        return new UsuarioDAO().registarUsuario(usuario);
    }

    public ArrayList<Usuario> listarTodosUsuarios(){
        return new UsuarioDAO().listarTodosUsuarios();
    }

    public ArrayList<Usuario> pesquisarUsuario(String nome){
        return new UsuarioDAO().pesquisarUsuario(nome);
    }

    public boolean actualizarUsuario(Usuario usuario){
        return new UsuarioDAO().actualizarUsuario(usuario);
    }

    public boolean deletarUsuario(int id){
        return new UsuarioDAO().deletarUsuario(id);
    }
}
