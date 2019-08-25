package model;


import controller.GerenciarLogin;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ProjetoDAO extends DataBaseDAO{
    
    public ProjetoDAO() throws Exception {
    }
    
    public ArrayList<Projeto> getListar() throws Exception{
        
        this.conectar();
        ArrayList<Projeto> listar = new ArrayList<Projeto>();
        String sql = "SELECT * FROM projeto p"
                + " INNER JOIN usuario u ON "
                + "p.idusuario = u.idusuario";
        
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        while(rs.next()){
            Projeto p = new Projeto();
            p.setIdprojeto(rs.getInt("idprojeto"));
            p.setServico(rs.getString("servico"));
            
            p.setDescricao1(rs.getString("descricao1"));
            p.setDescricao2(rs.getString("descricao2"));
            p.setDataemissao(rs.getDate("dataemissao")); 
            p.setSituacao(rs.getBoolean("situacao"));
            
            p.setIdusuario(rs.getInt("idusuario"));
           
            Usuario u = new Usuario();
            u.setNome(rs.getString("nome"));
            p.setUsuario(u);
           
         
            listar.add(p);
            
            
            
        }
        this.desconectar();
        return listar;
    }
    
    
    public ArrayList<Projeto> getListar2() throws Exception{
        
        this.conectar();
        ArrayList<Projeto> listar = new ArrayList<Projeto>();
        String sql = "SELECT * FROM projeto where situacao= true";
        
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        while(rs.next()){
            Projeto p = new Projeto();
            p.setIdprojeto(rs.getInt("idprojeto"));
            p.setServico(rs.getString("servico"));
            
            p.setDescricao1(rs.getString("descricao1"));
            p.setDescricao2(rs.getString("descricao2"));
            p.setDataemissao(rs.getDate("dataemissao")); 
            p.setSituacao(rs.getBoolean("situacao"));
            
            p.setIdusuario(rs.getInt("idusuario"));
           
         
         
            listar.add(p);
            
            
            
        }
        this.desconectar();
        return listar;
    }
    

    public ArrayList<Projeto> getListar3() throws Exception{
        
       this.conectar();
        ArrayList<Projeto> listar = new ArrayList<Projeto>();
        String sql = "SELECT * FROM projeto where idusuario= 11";
        
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        while(rs.next()){
            Projeto p = new Projeto();
            p.setIdprojeto(rs.getInt("idprojeto"));
            p.setServico(rs.getString("servico"));
            
            p.setDescricao1(rs.getString("descricao1"));
            p.setDescricao2(rs.getString("descricao2"));
            p.setDataemissao(rs.getDate("dataemissao")); 
            p.setSituacao(rs.getBoolean("situacao"));
            
            p.setIdusuario(rs.getInt("idusuario"));

            listar.add(p);
            
            
            
        }
        this.desconectar();
        return listar;
        
       /*
       
       this.conectar();
        ArrayList<Projeto> listar = new ArrayList<Projeto>();
        String sql = "SELECT * FROM projeto where idusuario= 11";
        
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(sql);
        while(rs.next()){
            Projeto p = new Projeto();
            p.setIdprojeto(rs.getInt("idprojeto"));
            p.setServico(rs.getString("servico"));
            
            p.setDescricao1(rs.getString("descricao1"));
            p.setDescricao2(rs.getString("descricao2"));
            p.setDataemissao(rs.getDate("dataemissao")); 
            p.setSituacao(rs.getBoolean("situacao"));
            
            p.setIdusuario(rs.getInt("idusuario"));

            listar.add(p);
            
            
            
        }
        this.desconectar();
        return listar;
       
       */
    }
    
     
    public boolean gravar(Projeto p){
        try{
            String sql;
            this.conectar();
            if(p.getIdprojeto()==0){
                sql = "INSERT INTO projeto (servico, descricao1, descricao2, dataemissao, idusuario) VALUES (?,?,?,?,?)";
            }else{
                sql = "UPDATE projeto set servico=?, descricao1=?, descricao2=?,  dataemissao=? , idusuario=?  WHERE idprojeto = ?";
            }
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1,p.getServico());
            pstm.setString(2,p.getDescricao1());
            pstm.setString(3,p.getDescricao2());
                  
            pstm.setDate(4,new Date(p.getDataemissao().getTime()));
            
            pstm.setInt(5, p.getUsuario().getIdusuario());
            
           
            
            if(p.getIdprojeto()>0){
                pstm.setInt(6, p.getIdprojeto());
            }
            pstm.execute();
            this.desconectar();
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    
    }

    public boolean deletar(Projeto p){
        try{
            this.conectar();
            String sql = "DELETE FROM projeto WHERE idprojeto= ?";  
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, p.getIdprojeto());
            pstm.execute();
            this.desconectar();
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    
    }
    
    
     public Projeto getCarregaPorId(int id) throws Exception{
        Projeto p = new Projeto();
        String sql = "SELECT * FROM projeto WHERE idprojeto = ?";
        this.conectar();
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id);
        ResultSet rs = pstm.executeQuery();
        if (rs.next()) {
            p.setIdprojeto(rs.getInt("idprojeto"));
            p.setServico(rs.getString("servico"));
            
            p.setDescricao1(rs.getString("descricao1"));
            p.setDescricao2(rs.getString("descricao2"));
            p.setDataemissao(rs.getDate("dataemissao"));
            p.setSituacao(rs.getBoolean("situacao"));
            
          
            Usuario u = new Usuario();
            u.setIdusuario(rs.getInt("idusuario"));
            
            p.setUsuario(u);
            
            
           
        }
        this.desconectar();
        return p;
    }
    
    
}
