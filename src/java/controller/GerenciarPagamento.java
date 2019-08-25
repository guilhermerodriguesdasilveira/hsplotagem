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
public class GerenciarPagamento extends HttpServlet {

    

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
                
                if(request.getParameter("acao").equals("alterar")){  
                        Pagamento novo = new Pagamento();
                        novo = p.getCarregaPorId(idpagamento);
                        
                        if(novo.getIdpagamento()>0){
                            RequestDispatcher disp = getServletContext().getRequestDispatcher("/form_pagamento.jsp");
                            request.setAttribute("Pagamento", novo);
                            disp.forward(request,response);
                        }else{
                            
                            mensagem = "Pagamento não encontrado!";
                        }
                    
                }
                
             
                if(request.getParameter("acao").equals("deletar")){
                    p.setIdpagamento(idpagamento);
                        if(p.deletar()){
                            mensagem = "Excluído com sucesso!";
                        }else{
                            mensagem = "Erro ao excluir!";
                        }
                    
                }
                
            }catch(Exception e){
                out.print(e);
                
            }
            out.println("<script type='text/javascript'>");
            out.println("alert('"+mensagem+"');");
            out.println("location.href='listar_pagamento.jsp';");
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
        
        String idpagamento = request.getParameter("idpagamento");
        
        String valor = request.getParameter("valor");
        
        String dataemissao = request.getParameter("dataemissao");

        String idprojeto = request.getParameter("idprojeto");
        
        String idusuario = request.getParameter("idusuario");
        
        try{
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            
            Pagamento p = new Pagamento();
            
            if(!idpagamento.isEmpty()){
                p.setIdpagamento(Integer.parseInt(idpagamento));
            }
            
            double novototal = 0;
            if(!valor.isEmpty())
                novototal = Double.parseDouble(valor.replace(".","").replace(",","."));
            p.setValor(novototal);
            
            
             p.setDataemissao((Date) df.parse(dataemissao));
                    
            Projeto proj = new Projeto();
            proj.setIdprojeto(Integer.parseInt(idprojeto));
            p.setProjeto(proj);
            
            Usuario u = new Usuario();
            u.setIdusuario(Integer.parseInt(idusuario));
            p.setUsuario(u);
            
            
            if(valor.equals("")||valor.isEmpty()||dataemissao.equals("")|| dataemissao.isEmpty()){
                mensagem = "Campos obrigatórios devem ser preenchidos";
            }else{
                
                if(p.gravar()){
                    mensagem = "Gravado com sucesso";
                }else{
                    mensagem = "Erro ao gravar no banco";
                }
            }
        
        }catch(Exception e){
            out.print(e);
            mensagem = "Erro ao gravar no banco !";
        }
        out.println("<script type='text/javascript'>");
        out.println("alert('"+mensagem+"');");
        out.println("location.href='listar_pagamento.jsp';");
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
