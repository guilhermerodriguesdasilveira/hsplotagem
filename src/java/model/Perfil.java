package model;

import java.util.ArrayList;




/**
 *
 * @author Administrador
 */
public class Perfil {
    private int idperfil;
    private String perfil;
    private ArrayList<Menu> menus;
    private ArrayList<Menu> naoMenus;

    public Perfil() {
    }
        
    public Perfil(int idperfil, String perfil) {
        this.idperfil = idperfil;
        this.perfil = perfil;
    }

    public int getIdperfil() {
        return idperfil;
    }

    public void setIdperfil(int idperfil) {
        this.idperfil = idperfil;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return getPerfil();
    }
    
     public ArrayList<Perfil> getListar() throws Exception{
        
        PerfilDAO pDAO = new PerfilDAO();
        return pDAO.getListar();
    
    }
    
    public ArrayList<Menu> getMenus() {
        return menus;
    }

    public void setMenus(ArrayList<Menu> menus) {
        this.menus = menus;
    }

    public ArrayList<Menu> getNaoMenus() {
        return naoMenus;
    }

    public void setNaoMenus(ArrayList<Menu> naoMenus) {
        this.naoMenus = naoMenus;
    }
    
    
    
 
    public boolean gravar() throws Exception{
        PerfilDAO pDAO = new PerfilDAO();
        return pDAO.gravar(this);
    }
    
    public boolean deletar() throws Exception{
        PerfilDAO pDAO = new PerfilDAO();
        return pDAO.deletar(this);
    }
    
    public Perfil getCarregaPorId(int idperfil) throws Exception{
        PerfilDAO pDAO = new PerfilDAO();
        return pDAO.getCarregarPorId(idperfil);
    }
    
    
    public boolean vincular(int idperfil, int idmenu) throws Exception{
        PerfilDAO pDAO = new PerfilDAO();
        return pDAO.vincular(idperfil,idmenu);
    }
    public boolean desvincular(int idperfil, int idmenu) throws Exception{
        PerfilDAO pDAO = new PerfilDAO();
        return pDAO.desvincular(idperfil,idmenu);
    }

    public Perfil getCarregarPorId(int idperfil) throws Exception {
        PerfilDAO pDAO = new PerfilDAO();
        return pDAO.getCarregarPorId(idperfil);
         }

    
}
