/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class PerfilDAO extends DataBaseDAO {

    public PerfilDAO() throws Exception {
    }
    
    public ArrayList<Perfil> getListar() throws Exception{
        
        ArrayList<Perfil> lista = new ArrayList<Perfil>();
        String sql = "SELECT * FROM perfil";
        this.conectar();
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        while(rs.next()){
            Perfil p = new Perfil();
            p.setIdperfil(rs.getInt("idperfil"));
            p.setPerfil(rs.getString("perfil"));
            lista.add(p);
        }
        this.desconectar();
        return lista;
    }
    
    public boolean gravar (Perfil p){
        try{
            this.conectar();
            String sql;
            if(p.getIdperfil()==0){
                sql = "INSERT INTO perfil (perfil) VALUES (?)";  
            }else{
                sql = "UPDATE perfil SET perfil = ?  WHERE idperfil = ?";
            }
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1,p.getPerfil());
            if(p.getIdperfil()>0){
                pstm.setInt(2, p.getIdperfil());
            }
            pstm.execute();
            this.desconectar();
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
    
    public boolean deletar(Perfil p){
        try{
            this.conectar();
            String sql = "DELETE FROM perfil WHERE idperfil= ?";  
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, p.getIdperfil());
            pstm.execute();
            this.desconectar();
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    
    }
    
    public Perfil getCarregarPorId(int id) throws Exception{
        Perfil p = new Perfil();
        String sql = "SELECT * FROM perfil WHERE idperfil = ?";
        this.conectar();
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id);
        ResultSet rs = pstm.executeQuery();
        if(rs.next()){
            p.setIdperfil(rs.getInt("idperfil"));
            p.setPerfil(rs.getString("perfil"));
            p.setMenus(menusVinculados(id));
            p.setNaoMenus(menusNaoVinculados(id));
        }
        this.desconectar();
        return p;
    
    }
    
    public ArrayList<Menu> menusVinculados(int id) throws Exception{
         
        ArrayList<Menu> lista = new ArrayList<Menu>();
        String sql = "SELECT m.* FROM menu_perfil as mp, menu as m"
                + " WHERE mp.idmenu = m.idmenu AND mp.idperfil = ?";
        this.conectar();
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id);
        ResultSet rs =  pstm.executeQuery();
        while(rs.next()){
            Menu m = new Menu();
            m.setIdmenu(rs.getInt("idmenu"));
            m.setMenu(rs.getString("menu"));
            m.setLink(rs.getString("link"));
           
            lista.add(m);
        }
        this.desconectar();
        return lista;
    
    }
    
     public ArrayList<Menu> menusNaoVinculados(int id) throws Exception{
         
        ArrayList<Menu> lista = new ArrayList<Menu>();
        String sql = "SELECT * FROM menu"
                + " WHERE idmenu NOT IN "
                + "(SELECT idmenu FROM menu_perfil"
                + " WHERE idperfil = ?)";
        this.conectar();
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id);
        ResultSet rs =  pstm.executeQuery();
        while(rs.next()){
            Menu m = new Menu();
            m.setIdmenu(rs.getInt("idmenu"));
            m.setMenu(rs.getString("menu"));
            m.setLink(rs.getString("link"));
           
            lista.add(m);
        }
        this.desconectar();
        return lista;
    
    }
     
    public boolean vincular(int idperfil, int idmenu){
        
        try{
            String sql=" INSERT INTO menu_perfil (idperfil, idmenu) "
                    + " VALUES (?, ?)";
            this.conectar();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, idperfil);
            pstm.setInt(2, idmenu);
            pstm.execute();
            this.desconectar();
            return true;

        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    
    } 
    
     public boolean desvincular(int idperfil, int idmenu){
        
        try{
            String sql="DELETE FROM menu_perfil WHERE idperfil = ?"
                    + " AND idmenu = ? ";
                   
            this.conectar();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, idperfil);
            pstm.setInt(2, idmenu);
            pstm.execute();
            this.desconectar();
            return true;

        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    
    } 
    
   
    
    
    
}
