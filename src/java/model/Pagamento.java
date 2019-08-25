package model;

import java.sql.Date;
import java.util.ArrayList;

public class Pagamento {
    
    private int idpagamento;
    private Double valor;
    
    private String numerocartao;
    private String bandeira;
    private String validadecartao;
    private String nometitular;
    private int codigoseguraca;
    
    
    private Date dataemissao;
    private Date datapagamento;
    private boolean situacao;
    
    private int idprojeto;
    private int idusuario;
    
    private Projeto projeto;
    private Usuario usuario;
    

    public int getIdpagamento() {
        return idpagamento;
    }

    public void setIdpagamento(int idpagamento) {
        this.idpagamento = idpagamento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getNumerocartao() {
        return numerocartao;
    }

    public void setNumerocartao(String numerocartao) {
        this.numerocartao = numerocartao;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getValidadecartao() {
        return validadecartao;
    }

    public void setValidadecartao(String validadecartao) {
        this.validadecartao = validadecartao;
    }

    public String getNometitular() {
        return nometitular;
    }

    public void setNometitular(String nometitular) {
        this.nometitular = nometitular;
    }

    public int getCodigoseguraca() {
        return codigoseguraca;
    }

    public void setCodigoseguraca(int codigoseguraca) {
        this.codigoseguraca = codigoseguraca;
    }

    public Date getDataemissao() {
        return dataemissao;
    }

    public void setDataemissao(Date dataemissao) {
        this.dataemissao = dataemissao;
    }

    public Date getDatapagamento() {
        return datapagamento;
    }

    public void setDatapagamento(Date datapagamento) {
        this.datapagamento = datapagamento;
    }

    public boolean isSituacao() {
        return situacao;
    }

    public void setSituacao(boolean situacao) {
        this.situacao = situacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public int getIdprojeto() {
        return idprojeto;
    }

    public void setIdprojeto(int idprojeto) {
        this.idprojeto = idprojeto;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    
    public ArrayList<Pagamento> getListar() throws Exception{
        
        PagamentoDAO pDAO = new PagamentoDAO();
        return pDAO.getListar();
    
    }
    
    
    
     public ArrayList<Pagamento> getListar2() throws Exception{
        
        PagamentoDAO pDAO = new PagamentoDAO();
        return pDAO.getListar2();
    
    }
    
    public boolean gravar() throws Exception{
        PagamentoDAO pDAO = new PagamentoDAO();
        return pDAO.gravar(this);
    }
    
    public boolean deletar() throws Exception{
        PagamentoDAO pDAO = new PagamentoDAO();
        return pDAO.deletar(this);
    }
    
    public Pagamento getCarregaPorId(int idpagamento) throws Exception{
        PagamentoDAO pDAO = new PagamentoDAO();
        return pDAO.getCarregaPorId(idpagamento);
    
    
}
    
    
    
}
