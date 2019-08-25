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
import model.Compra;

/**
 *
 * @author Administrador
 */
public class GerenciarCompra extends HttpServlet {

    

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
                int idcompra  = Integer.parseInt(request.getParameter("idcompra"));
                Compra c = new Compra();
                if(request.getParameter("acao").equals("alterar")){  
                        Compra nova = new Compra();
                        nova = c.getCarregaPorId(idcompra);
                        //out.print(nova.getIdcompra());
                        if(nova.getIdcompra()>0){
                            RequestDispatcher disp = getServletContext().getRequestDispatcher("/form_compra.jsp");
                            request.setAttribute("compra", nova);
                            disp.forward(request,response);
                        }else{
                            
                            mensagem = "Compra não encontrado!";
                        }
                    
                }
                
             
                if(request.getParameter("acao").equals("visualizar")){
    
                    Compra novo = new Compra();
                    novo = c.getCarregaPorId(idcompra);
                    if(novo.getIdcompra()>0){
                        RequestDispatcher disp = getServletContext().getRequestDispatcher("/visualizar_compra.jsp");
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
            out.println("location.href='listar_compra.jsp';");
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
        String idcompra = request.getParameter("idcompra");
        String notafiscal = request.getParameter("notafiscal");
        String datacompra = request.getParameter("datacompra");
        String valor = request.getParameter("valor");
        
        try{
            SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            
            Compra c = new Compra();
            
            if(!idcompra.isEmpty()){
                c.setIdcompra(Integer.parseInt(idcompra));
            }
            c.setNotafiscal(notafiscal);
            
            c.setDatacompra( df.parse(datacompra) );
            
           
            double novototal = 0;
            if(!valor.isEmpty())
                novototal = Double.parseDouble(valor.replace(".","").replace(",","."));
            c.setValor(novototal);
            
            
            if(datacompra.equals("")||datacompra.isEmpty()||valor.equals("")||
                    valor.isEmpty()){
                mensagem = "Campos obrigatórios devem ser preenchidos";
            }else{
                
                if(c.gravar()){
                    mensagem = "Gravado com sucesso";
                }else{
                    mensagem = "Erro ao gravar no banco";
                }
            }
        
        }catch(Exception e){
            out.print(e);
            mensagem = "Erro ao gravar no banco ";
        }
        out.println("<script type='text/javascript'>");
        out.println("alert('"+mensagem+"');");
        out.println("location.href='listar_compra.jsp';");
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
