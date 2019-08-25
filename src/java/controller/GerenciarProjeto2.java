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

import model.Projeto;
import model.Usuario;

/**
 *
 * @author Administrador
 */
public class GerenciarProjeto2 extends HttpServlet {

    

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
                int idprojeto  = Integer.parseInt(request.getParameter("idprojeto"));
                Projeto p = new Projeto();
                if(request.getParameter("acao").equals("alterar")){  
                        Projeto novo = new Projeto();
                        novo = p.getCarregaPorId(idprojeto);
                        
                        if(novo.getIdprojeto()>0){
                            RequestDispatcher disp = getServletContext().getRequestDispatcher("/meu_novo_projeto.jsp");
                            request.setAttribute("projeto", novo);
                            disp.forward(request,response);
                        }else{
                            
                            mensagem = "Projeto não encontrado!";
                        }
                    
                }
                
             
                if(request.getParameter("acao").equals("deletar")){
                   p.setIdprojeto(idprojeto);
                        if(p.deletar()){
                            mensagem = "Excluído com sucesso!";
                        }else{
                            mensagem = "Erro ao excluir!";
                        }
                    
                }
                
                
                if(request.getParameter("acao").equals("visualizar")){
    
                    Projeto novo = new Projeto();
                    novo = p.getCarregaPorId(idprojeto);
                    if(novo.getIdprojeto()>0){
                        RequestDispatcher disp = getServletContext().getRequestDispatcher("/visualizar_projeto_cliente.jsp");
                        request.setAttribute("compra",novo);
                        disp.forward(request, response);
                    }else{
                            mensagem = "Erro ao Visualizar!";
                        }
                    
                }
                
            }catch(Exception e){
                out.print(e);
                
            }
            out.println("<script type='text/javascript'>");
            out.println("alert('"+mensagem+"');");
            out.println("location.href='meus_projetos.jsp';");
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
        String idprojeto = request.getParameter("idprojeto");
        String servico = request.getParameter("servico");
        String descricao1 = request.getParameter("descricao1");
        String descricao2 = request.getParameter("descricao2");
        String dataemissao = request.getParameter("dataemissao");
        String idusuario = request.getParameter("idusuario");
        
        try{
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            
            Projeto p = new Projeto();
            
            if(!idprojeto.isEmpty()){
                p.setIdprojeto(Integer.parseInt(idprojeto));
            }
            p.setServico(servico);
            
            p.setDescricao1(descricao1);
            
            p.setDescricao2(descricao2);
            
            p.setDataemissao( df.parse(dataemissao));
             
            Usuario u = new Usuario();
            u.setIdusuario(Integer.parseInt(idusuario));
            p.setUsuario(u);
            
            
            if(servico.equals("")||servico.isEmpty()||descricao1.equals("")|| descricao1.isEmpty()){
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
        out.println("location.href='meus_projetos.jsp';");
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
