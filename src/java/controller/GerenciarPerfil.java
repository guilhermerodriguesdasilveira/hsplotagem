/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Perfil;

/**
 *
 * @author Administrador
 */
@WebServlet(name="GerenciarPerfil", urlPatterns={"/gerenciar_perfil.do"})
public class GerenciarPerfil extends HttpServlet {

     
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
            try{
                int idperfil = Integer.parseInt(request.getParameter("idperfil"));
                Perfil p = new Perfil();
                if(request.getParameter("acao").equals("deletar")){
                    if(idperfil>0){
                        p.setIdperfil(idperfil);
                        if(p.deletar()){
                            mensagem = "Excluido com sucesso!";
                        }else{
                            mensagem = "Erro ao excluir!";
                        }
                    }
                }//fecha if deletar
                if(request.getParameter("acao").equals("alterar")){
                   Perfil novo = new Perfil();
                   novo = p.getCarregaPorId(idperfil);
                   if(novo.getIdperfil()>0){
                       RequestDispatcher disp = getServletContext().getRequestDispatcher("/form_perfil.jsp");
                       request.setAttribute("perfil", novo);
                       disp.forward(request, response);
                   }else{
                       mensagem = "Perfil não encontrado!";
                   }
                   
                }
                    
            }catch(Exception e){
                out.print(e);
                mensagem = "Erro ao acessar o banco "+e;
            }
            out.println("<script type='text/javascript'>");
            out.println("alert('"+mensagem+"')");
            out.println("location.href='listar_perfil.jsp';");
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
        String idperfil = request.getParameter("idperfil");
        String perfil = request.getParameter("perfil");
        String mensagem = "";
        Perfil p = new Perfil();
        if(!idperfil.isEmpty()){
            p.setIdperfil(Integer.parseInt(idperfil));
        }
        p.setPerfil(perfil);
        try{
            if(perfil.equals("") || perfil.isEmpty() ){
                    mensagem = "Campo obrigatório deverá ser preecnhido!";
            }else{
                  if(p.gravar()){
                    mensagem = "Gravado com sucesso!";
                  }else{
                    mensagem = "Erro ao gravar no banco";  
                  }
            }
        
        }catch(Exception e){
            out.print(e);
            mensagem = "Erro ao gravar no banco!";
        }
        out.println("<script type='text/javascript'>");
        out.println("alert('"+mensagem+"')");
        out.println("location.href='listar_perfil.jsp';");
        out.println("</script>");
        
        
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
