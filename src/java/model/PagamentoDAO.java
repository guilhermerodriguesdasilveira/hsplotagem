package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PagamentoDAO extends DataBaseDAO {
    
     public PagamentoDAO() throws Exception {
    }

    public ArrayList<Pagamento> getListar() throws Exception{
        
        ArrayList<Pagamento> lista = new ArrayList<Pagamento>();
        String sql = "SELECT * FROM pagamento p INNER JOIN usuario u ON \n" +
"               p.idusuario = u.idusuario";
        this.conectar();
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        while(rs.next()){
            Pagamento p = new Pagamento();
  
            p.setIdpagamento(rs.getInt("idpagamento"));
            p.setValor(rs.getDouble("valor"));
            p.setDataemissao(rs.getDate("dataemissao"));
            p.setSituacao(rs.getBoolean("situacao"));
            
            p.setIdprojeto(rs.getInt("idprojeto"));
            
            Usuario u = new Usuario();
            u.setNome(rs.getString("nome"));
            p.setUsuario(u);
            
            lista.add(p);
      
        }
        this.desconectar();
        return lista;
    }
    
    
        
    public ArrayList<Pagamento> getListar2() throws Exception{
        
        ArrayList<Pagamento> lista = new ArrayList<Pagamento>();

    
        String sql = "SELECT * FROM pagamento where idusuario= 7";
        this.conectar();
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        while(rs.next()){
           Pagamento p = new Pagamento();
  
            p.setIdpagamento(rs.getInt("idpagamento"));
            p.setValor(rs.getDouble("valor"));
            p.setDataemissao(rs.getDate("dataemissao"));
            p.setSituacao(rs.getBoolean("situacao"));
            
            p.setIdprojeto(rs.getInt("idprojeto"));
            
            
            
            
            lista.add(p);

      
        }
        this.desconectar();
        return lista;
    }
    
    
    
    
    public boolean gravar (Pagamento p){
        try{
            this.conectar();
            String sql;
            if(p.getIdpagamento()==0){
                sql = "INSERT INTO usuario (valor, dataemissao, idprojeto, idusuario"
                        + " ) VALUES (?,?,?,?)";  
            }else{
                sql = "UPDATE usuario SET valor=?, dataemissao=?, idprojeto=?,"
                        + " idusuario=? WHERE idpagamento = ?";
            }
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setDouble(1,p.getValor());
            pstm.setDate(2,p.getDataemissao());
            
            pstm.setInt(3, p.getIdprojeto());
            
            pstm.setInt(4, p.getIdusuario());
            if(p.getIdpagamento()>0){
                
                pstm.setInt(5, p.getIdpagamento());
            }
            pstm.execute();
            this.desconectar();
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
    
    public boolean deletar(Pagamento p){
        try{
            this.conectar();
            String sql = "DELETE FROM pagamento WHERE idpagamento = ?";  
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, p.getIdusuario());
            pstm.execute();
            this.desconectar();
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    
    }
    
    public Pagamento getCarregaPorId(int id) throws Exception{
        Pagamento p = new Pagamento();
        String sql = "SELECT * FROM pagamento p INNER JOIN usuario u ON \n" +
"               p.idusuario = u.idusuario WHERE idpagamento = ?";
        this.conectar();
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id);
        ResultSet rs = pstm.executeQuery();
        if(rs.next()){
            p.setIdpagamento(rs.getInt("idpagamento"));
            p.setValor(rs.getDouble("valor"));
            p.setDataemissao(rs.getDate("dataemissao"));
            p.setSituacao(rs.getBoolean("situacao"));
            
            p.setIdprojeto(rs.getInt("idprojeto"));
            
            Usuario u = new Usuario();
            u.setNome(rs.getString("nome"));
            p.setUsuario(u);
            
          
        }
        this.desconectar();
        return p;
    
    }

    
    
    
   
    
}
