/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Pagamento;

import model.Projeto;
import model.Usuario;

/**
 *
 * @author Administrador
 */
public class GerenciarPagamento2 extends HttpServlet {

    

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
                int idpagamento  = Integer.parseInt(request.getParameter("idpagamento"));
                
                Pagamento p = new Pagamento();
                
               
                
             
               
                if(request.getParameter("acao").equals("efetuar")){
    
                    Pagamento novo = new Pagamento();
                    novo = p.getCarregaPorId(idpagamento);
                    if(novo.getIdpagamento()>0){
                        RequestDispatcher disp = getServletContext().getRequestDispatcher("/efetuar_pagamento.jsp");
                        request.setAttribute("compra",novo);
                        disp.forward(request, response);
                    }else{
                            mensagem = "Erro ao efetuar pagamento!";
                        }
                    
                }
                
                
                
            }catch(Exception e){
                out.print(e);
                
            }
            out.println("<script type='text/javascript'>");
            out.println("alert('"+mensagem+"');");
            out.println("location.href='meus_pagamentos.jsp';");
            out.println("</script>");
        
        
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
}