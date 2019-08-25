    package model;

import java.util.Date;
import java.util.ArrayList;

public class Compra {
    
    private int idcompra;
    private String notafiscal;
    private Date datacompra;
    private double valor;



    public int getIdcompra() {
        return idcompra;
    }

    public void setIdcompra(int idcompra) {
        this.idcompra = idcompra;
    }

    public String getNotafiscal() {
        return notafiscal;
    }

    public void setNotafiscal(String notafiscal) {
        this.notafiscal = notafiscal;
    }

    public Date getDatacompra() {
        return datacompra;
    }

    public void setDatacompra(Date datacompra) {
        this.datacompra = datacompra;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    
    public ArrayList<Compra> getListar() throws Exception{
        
        CompraDAO cDAO = new CompraDAO();
        return cDAO.getListar();
    
    }
    
  
    
    public boolean gravar() throws Exception{
        CompraDAO cDAO = new CompraDAO();
        return cDAO.gravar(this);
    }
    
    public Compra getCarregaPorId(int idcompra) throws Exception{
        CompraDAO cDAO = new CompraDAO();
        return cDAO.getCarregaPorId(idcompra);
    }

   
    
  
    


}
