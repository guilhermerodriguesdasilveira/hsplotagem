/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class UsuarioDAO extends DataBaseDAO{

    public UsuarioDAO() throws Exception {
    }

    
    public ArrayList<Usuario> getListar() throws Exception{
        
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        String sql = "SELECT *, p.perfil FROM usuario u INNER JOIN perfil p ON "
                + "p.idperfil = u.idperfil";
        this.conectar();
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        while(rs.next()){
            Usuario u = new Usuario();
            u.setIdusuario(rs.getInt("idusuario"));
            u.setNome(rs.getString("nome"));
            u.setLogin(rs.getString("login"));
            u.setSenha(rs.getString("senha"));
            u.setCpf(rs.getString("cpf"));
            u.setEndereco(rs.getString("endereco"));
            u.setEstado(rs.getString("estado"));
            u.setCep(rs.getString("cep"));
            u.setTelefone(rs.getString("telefone"));
            u.setCelular(rs.getString("celular"));
            u.setEmail(rs.getString("email"));
            
            
            Perfil p = new Perfil();
            p.setIdperfil(rs.getInt("u.idperfil"));
            p.setPerfil(rs.getString("p.perfil"));
            
            u.setPerfil(p);
            lista.add(u);
      
        }
        this.desconectar();
        return lista;
    }
    
    
        
    public ArrayList<Usuario> getListar2() throws Exception{
        
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        String sql = "SELECT * FROM usuario WHERE idperfil = 2 ";
               
        this.conectar();
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        while(rs.next()){
            Usuario u = new Usuario();
            u.setIdusuario(rs.getInt("idusuario"));
            u.setNome(rs.getString("nome"));
            u.setLogin(rs.getString("login"));
            u.setSenha(rs.getString("senha"));
            u.setCpf(rs.getString("cpf"));
            u.setEndereco(rs.getString("endereco"));
            u.setEstado(rs.getString("estado"));
            u.setCep(rs.getString("cep"));
            u.setTelefone(rs.getString("telefone"));
            u.setCelular(rs.getString("celular"));
            u.setEmail(rs.getString("email"));
            
            
           
            lista.add(u);
      
        }
        this.desconectar();
        return lista;
    }
    
    
        public ArrayList<Usuario> getListar3() throws Exception{
        
        ArrayList<Usuario> lista = new ArrayList<Usuario>();
        String sql = "SELECT * FROM usuario WHERE idperfil = 3 ";
               
        this.conectar();
        PreparedStatement pstm = conn.prepareStatement(sql);
        ResultSet rs = pstm.executeQuery();
        while(rs.next()){
            Usuario u = new Usuario();
            u.setIdusuario(rs.getInt("idusuario"));
            u.setNome(rs.getString("nome"));
            u.setLogin(rs.getString("login"));
            u.setSenha(rs.getString("senha"));
            u.setCpf(rs.getString("cpf"));
            u.setEndereco(rs.getString("endereco"));
            u.setEstado(rs.getString("estado"));
            u.setCep(rs.getString("cep"));
            u.setTelefone(rs.getString("telefone"));
            u.setCelular(rs.getString("celular"));
            u.setEmail(rs.getString("email"));
            
            
           
            lista.add(u);
      
        }
        this.desconectar();
        return lista;
    }
    
    
    public boolean gravar (Usuario u){
        try{
            this.conectar();
            String sql;
            if(u.getIdusuario()==0){
                sql = "INSERT INTO usuario (nome, login, senha, cpf, endereco, estado, cep,"
                        + " telefone, celular, email, idperfil) VALUES (?,?,?,?,?,?,?,?,?,?,?)";  
            }else{
                sql = "UPDATE usuario SET nome=?, login=?, senha=?, cpf=?, endereco=?, estado=?, cep=?,"
                        + " telefone=?, celular=?, email=?,  idperfil=?  "
                        + "WHERE idusuario = ?";
            }
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1,u.getNome());
            pstm.setString(2,u.getLogin());
            pstm.setString(3, u.getSenha());
            
            pstm.setString(4, u.getCpf());
            pstm.setString(5, u.getEndereco());
            pstm.setString(6, u.getEstado());
            pstm.setString(7, u.getCep());
            pstm.setString(8, u.getTelefone());
            pstm.setString(9, u.getCelular());
            pstm.setString(10, u.getEmail());
            
            pstm.setInt(11, u.getPerfil().getIdperfil());
            if(u.getIdusuario()>0){
                
                pstm.setInt(12, u.getIdusuario());
            }
            pstm.execute();
            this.desconectar();
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    }
    
    public boolean deletar(Usuario u){
        try{
            this.conectar();
            String sql = "DELETE FROM usuario WHERE idusuario= ?";  
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setInt(1, u.getIdusuario());
            pstm.execute();
            this.desconectar();
            return true;
        }catch(Exception e){
            System.out.println(e);
            return false;
        }
    
    }
    
    public Usuario getCarregaPorId(int id) throws Exception{
        Usuario u = new Usuario();
        String sql = "SELECT *, p.perfil FROM usuario u INNER JOIN perfil p"
                + " ON p.idperfil = u.idperfil WHERE idusuario = ?";
        this.conectar();
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id);
        ResultSet rs = pstm.executeQuery();
        if(rs.next()){
            u.setIdusuario(rs.getInt("idusuario"));
            u.setNome(rs.getString("nome"));
            u.setLogin(rs.getString("login"));
            u.setSenha(rs.getString("senha"));
            
            u.setCpf(rs.getString("cpf"));
            u.setEndereco(rs.getString("endereco"));
            u.setEstado(rs.getString("estado"));
            u.setCep(rs.getString("cep"));
            u.setTelefone(rs.getString("telefone"));
            u.setCelular(rs.getString("celular"));
            u.setEmail(rs.getString("email"));
 
            
            Perfil p = new Perfil();
            p.setIdperfil(rs.getInt("u.idperfil"));
            p.setPerfil(rs.getString("p.perfil"));
            
            u.setPerfil(p);
        }
        this.desconectar();
        return u;
    
    }
    
    public Usuario getRecuperarUsuario(String login) throws Exception{
        Usuario u = new Usuario();
        String sql = "SELECT *, p.perfil FROM usuario u INNER JOIN perfil p"
                + " ON p.idperfil = u.idperfil WHERE login = ?";
        try{
            this.conectar();
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, login);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                u.setIdusuario(rs.getInt("u.idusuario"));
                u.setNome(rs.getString("u.nome"));
                u.setLogin(rs.getString("u.login"));
                u.setSenha(rs.getString("u.senha"));

                u.setCpf(rs.getString("u.cpf"));
                u.setEndereco(rs.getString("u.endereco"));
                u.setEstado(rs.getString("u.estado"));
                u.setCep(rs.getString("u.cep"));
                u.setTelefone(rs.getString("u.telefone"));
                u.setCelular(rs.getString("u.celular"));
                u.setEmail(rs.getString("u.email"));
               
                
                Perfil p = new Perfil();                   
                u.setPerfil(p.getCarregarPorId(rs.getInt("u.idperfil")));
            }
            this.desconectar();
            return u;
        }catch(Exception e){
            System.out.print(e);
            return null;
        }
    
    }

    
    
    public ArrayList<Projeto> projetosVinculados(int id) throws Exception{
         
        ArrayList<Projeto> lista = new ArrayList<Projeto>();
        String sql = "SELECT * FROM projeto WHERE idusuario = ?)";
        this.conectar();
        PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.setInt(1, id);
        ResultSet rs =  pstm.executeQuery();
        while(rs.next()){
            Projeto p =new Projeto();
            p.setServico(rs.getString("servico"));
            p.setDescricao1(rs.getString("descricao1"));
           
            lista.add(p);
        }
        this.desconectar();
        return lista;
    
    }
    
    
}
