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
public class MenuDAO extends DataBaseDAO{

    public MenuDAO() throws Exception {
    }
    
    
    public ArrayList<Menu> getListar() throws Exception{
        
        this.conectar();
        ArrayList<Menu> lista = new ArrayList<Menu>();
        String sql = "SELECT * FROM menu";
        Statement stm = conn.createStatement();
        ResultSet rs = stm.executeQuery(sql);
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
    
    public boolean gravar(Menu m){
        try{
            String sql;
            this.conectar();
            if(m.getIdmenu()==0){
                sql = "INSERT INTO menu (menu, link) VALUES (?,?)";
            }else{
                sql = "UPDATE menu set menu = ?, link = ?  WHERE idmenu = ?";
            }
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1,m.getMenu());
            pstm.setString(2, m.getLink());
            
            if(m.getIdmenu()>0){
                pstm.setInt(3, m.getIdmenu());
            }
            pstm.execute();
            this.desconectar();
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    
    }
    
    public boolean deletar(Menu m){
        try{
            this.conectar();
            String sql = "DELETE FROM menu WHERE idmenu = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, m.getIdmenu());
            pstm.execute();
            this.desconectar();
            return true;
         }catch(Exception e){
            System.out.println(e);
            return false;
        }
    
    }
    
    public Menu getCarregaPorId(int id) throws Exception{
        Menu m = new Menu();
        String sql = "SELECT * FROM menu WHERE idmenu = ?";
        this.conectar();
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id);
        ResultSet rs = pstm.executeQuery();
        if(rs.next()){
            m.setIdmenu(id);
            m.setMenu(rs.getString("menu"));
            m.setLink(rs.getString("link"));
           
        }
        this.desconectar();
        return m;
    }
    
    
    
}
