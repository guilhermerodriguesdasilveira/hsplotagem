/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Administrador
 */
public class Menu {
    private int idmenu;
    private String menu;
    private String link;
    

    public Menu() {
    }

    public Menu(int idmenu, String menu, String link) {
        this.idmenu = idmenu;
        this.menu = menu;
        this.link = link;
       
    }

    public int getIdmenu() {
        return idmenu;
    }

    public void setIdmenu(int idmenu) {
        this.idmenu = idmenu;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    
    
    @Override
    public String toString() {
        return getMenu();
    }
    
    public ArrayList<Menu> getListar()throws Exception{
    
        MenuDAO mDAO = new MenuDAO();
        return mDAO.getListar();
    }
    
    public boolean gravar() throws Exception{
        MenuDAO mDAO = new MenuDAO();
        return mDAO.gravar(this);
    }
    
    public boolean deletar() throws Exception{
        MenuDAO mDAO = new MenuDAO();
        return mDAO.deletar(this);
    }
    
    public Menu getCarregaPorId(int idmenu) throws Exception{
        MenuDAO mDAO = new MenuDAO();
        return mDAO.getCarregaPorId(idmenu);
    }
    
}
