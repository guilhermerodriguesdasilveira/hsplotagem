/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Perfil;

/**
 *
 * @author Administrador
 */
public class GerenciarMenuPerfil extends HttpServlet {

   
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        String mensagem = "";
        String idperfil = request.getParameter("idperfil");
        
        String acao = request.getParameter("acao");
        
        try{
        
            if(acao.equals("gerenciar")){
                
                    Perfil p = new Perfil();
                    Perfil novo = new Perfil();
                    novo = p.getCarregarPorId(Integer.parseInt(idperfil));
                    if(novo.getIdperfil()>0){
                        RequestDispatcher disp = getServletContext().getRequestDispatcher("/form_menu_perfil.jsp");
                        request.setAttribute("perfil",novo);
                        disp.forward(request, response);
                    }else{
                        mensagem = "Perfil não encontrado";
                    }
                
            }
           
           if(acao.equals("desvincular")){
               
             
                   String idmenu = request.getParameter("idmenu");
                   if(idmenu.equals("")||idmenu.isEmpty()||idperfil.equals("")||idperfil.isEmpty()){
                       mensagem = "Campos obrigatórios devem ser preenchidos";
                   }else{
                       Perfil p = new Perfil();
                       if(p.desvincular(Integer.parseInt(idperfil),Integer.parseInt(idmenu))){
                           mensagem = "Desvinculado com sucesso";
                       }else{
                           mensagem = "Erro ao desvincular";
                       }
                   }
              
           } 
            
        }catch(Exception e){
            out.print(e);
        }
        out.println("<script type='text/javascript'>");
        out.println("alert('"+mensagem+"');");
        out.println("location.href='gerenciar_menu_perfil.do?acao=gerenciar&idperfil="+idperfil+"';");
        out.println("</script>");
        
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        String mensagem = "";
        String idperfil = request.getParameter("idperfil");
        String idmenu = request.getParameter("idmenu");
        
        try{
            
            if(idperfil.equals("")|| idperfil.isEmpty() || idmenu.equals("") || idmenu.isEmpty()){
                mensagem = "Campos obrigatórios devem ser preenchidos";
            }else{
                Perfil p = new Perfil();
                if(p.vincular(Integer.parseInt(idperfil), Integer.parseInt(idmenu))){
                    mensagem = "Vinculado com sucesso";
                }else{
                    mensagem = "Erro ao vincular";
                }
            }
            out.println("<script type='text/javascript'>");
            out.println("alert('"+mensagem+"');");
            out.println("location.href='gerenciar_menu_perfil.do?acao=gerenciar&idperfil="+idperfil+"';");
            out.println("</script>");
        }catch(Exception e){
            out.print(e);
        }
        
        
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
