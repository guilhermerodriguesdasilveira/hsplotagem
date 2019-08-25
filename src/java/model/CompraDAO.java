package model;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CompraDAO extends DataBaseDAO{
    
    public CompraDAO() throws Exception {
    }
    
    public ArrayList<Compra> getListar() throws Exception{
        
        this.conectar();
        ArrayList<Compra> listar = new ArrayList<Compra>();
        String sql = "SELECT * FROM compra";
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        while(rs.next()){
            Compra c = new Compra();
            c.setIdcompra(rs.getInt("idcompra"));
            c.setNotafiscal(rs.getString("notafiscal"));
            c.setDatacompra(rs.getDate("datacompra"));
            c.setValor(rs.getDouble("valor"));
            listar.add(c);
        }
        this.desconectar();
        return listar;
    }
    
    
     
    public boolean gravar(Compra c){
        try{
            String sql;
            this.conectar();
            if(c.getIdcompra()==0){
                sql = "INSERT INTO compra (notafiscal,datacompra,valor) VALUES (?,?,?)";
            }else{
                sql = "UPDATE compra set notafiscal=?, datacompra=?, valor=?  WHERE idcompra = ?";
            }
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1,c.getNotafiscal());
            pstm.setDate(2,new Date(c.getDatacompra().getTime()));
            pstm.setDouble(3,c.getValor());
            if(c.getIdcompra()>0){
                pstm.setInt(4, c.getIdcompra());
            }
            pstm.execute();
            this.desconectar();
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    
    }
    
    
     public Compra getCarregaPorId(int id) throws Exception{
        Compra c = new Compra();
        String sql = "SELECT * FROM compra WHERE idcompra = ?";
        this.conectar();
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id);
        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            c.setIdcompra(rs.getInt("idcompra"));
            c.setNotafiscal(rs.getString("notafiscal"));
            c.setDatacompra(rs.getDate("datacompra"));
            c.setValor(rs.getDouble("valor"));
            
        }
        this.desconectar();
        return c;
    }


     
     
}

  