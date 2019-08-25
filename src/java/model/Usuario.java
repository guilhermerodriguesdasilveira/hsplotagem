/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Usuario {
    private int idusuario;
    private String nome;
    private String login;
    private String senha;
    
    private String cpf;
    private String endereco;
    private String estado;
    private String cep;
    private String telefone;
    private String celular;
    private String email;
    private ArrayList<Projeto> projetos;
    private ArrayList<Pagamento> pagamentos;
 
    
    private Perfil perfil;
    
    public Usuario() {
    }

    public Usuario(int idusuario, String nome, String login, String senha, String cpf, String endereco, String estado, String cep, String telefone, String celular, String email, Perfil perfil) {
        this.idusuario = idusuario;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.cpf = cpf;
        this.endereco = endereco;
        this.estado = estado;
        this.cep = cep;
        this.telefone = telefone;
        this.celular = celular;
        this.email = email;
       
        this.perfil = perfil;
    }

    



    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(ArrayList<Projeto> projetos) {
        this.projetos = projetos;
    }

    public ArrayList<Pagamento> getPagamentos() {
        return pagamentos;
    }

    public void setPagamentos(ArrayList<Pagamento> pagamentos) {
        this.pagamentos = pagamentos;
    }

   
    

    @Override
    public String toString() {
        return getNome();
    }
    
    public ArrayList<Usuario> getListar() throws Exception{
        
        UsuarioDAO uDAO = new UsuarioDAO();
        return uDAO.getListar();
    
    }
    
      public ArrayList<Usuario> getListar2() throws Exception{
        
        UsuarioDAO uDAO = new UsuarioDAO();
        return uDAO.getListar2();
    
    }
    
      public ArrayList<Usuario> getListar3() throws Exception{
        
        UsuarioDAO uDAO = new UsuarioDAO();
        return uDAO.getListar3();
    
    }
    
    public boolean gravar() throws Exception{
        UsuarioDAO uDAO = new UsuarioDAO();
        return uDAO.gravar(this);
    }
    
    public boolean deletar() throws Exception{
        UsuarioDAO uDAO = new UsuarioDAO();
        return uDAO.deletar(this);
    }
    
    public Usuario getCarregaPorId(int idusuario) throws Exception{
        UsuarioDAO uDAO = new UsuarioDAO();
        return uDAO.getCarregaPorId(idusuario);
    }
    
    public Usuario getRecuperarUsuario(String login) throws Exception{
        UsuarioDAO uDAO = new UsuarioDAO();
        return uDAO.getRecuperarUsuario(login);
    }

   
    
    
}
