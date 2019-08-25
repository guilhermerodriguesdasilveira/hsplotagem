package model;

import java.util.Date;
import java.util.ArrayList;

public class Projeto {
    
    private int idprojeto;
    private String servico;
   
    private String descricao1;
    private String descricao2;
    private Date dataemissao;
    private boolean situacao;
    private int idusuario;
    private Usuario usuario;

    public int getIdprojeto() {
        return idprojeto;
    }

    public void setIdprojeto(int idprojeto) {
        this.idprojeto = idprojeto;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

   

    public String getDescricao1() {
        return descricao1;
    }

    public void setDescricao1(String descricao1) {
        this.descricao1 = descricao1;
    }

    public String getDescricao2() {
        return descricao2;
    }

    public void setDescricao2(String descricao2) {
        this.descricao2 = descricao2;
    }

    public Date getDataemissao() {
        return dataemissao;
    }

    public void setDataemissao(Date dataemissao) {
        this.dataemissao = dataemissao;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
    public ArrayList<Projeto> getListar() throws Exception{
        
        ProjetoDAO pDAO = new ProjetoDAO();
        return pDAO.getListar();
    
    }   
 
    
    
    public ArrayList<Projeto> getListar2() throws Exception{
        
        ProjetoDAO pDAO = new ProjetoDAO();
        return pDAO.getListar2();
    
    }
    
    public ArrayList<Projeto> getListar3() throws Exception{
        
        ProjetoDAO pDAO = new ProjetoDAO();
        return pDAO.getListar3();
    
    }   
    
    
    public boolean gravar() throws Exception{
        ProjetoDAO pDAO = new ProjetoDAO();
        return pDAO.gravar(this);
    }
    
    public boolean deletar() throws Exception{
        ProjetoDAO pDAO = new ProjetoDAO();
        return pDAO.deletar(this);
    }
    
    public Projeto getCarregaPorId(int idprojeto) throws Exception{
        ProjetoDAO pDAO = new ProjetoDAO();
        return pDAO.getCarregaPorId(idprojeto);
    }


   
   

  

  

    

   
    
    
    
    
    
    
}
