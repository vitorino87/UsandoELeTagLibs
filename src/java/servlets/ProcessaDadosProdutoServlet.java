/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import entidades.Produto;
import javax.servlet.RequestDispatcher;
/**
 *
 * @author tiago.lucas
 */
public class ProcessaDadosProdutoServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int codigo=0;
        int quantidade=0;
        String descricao = request.getParameter("descricao");
        String unidadeMedida = request.getParameter("unidade");
        try{
            codigo = Integer.parseInt(request.getParameter("codigo"));
        }catch(NumberFormatException exc){
            System.out.println("Erro ao converter o código");
        }
        try{
            quantidade=Integer.parseInt(request.getParameter("quantidade"));
        }catch(NumberFormatException exc){
            System.out.println("Erro ao converter a quantidade");
        }
        Produto prod = new Produto();
        prod.setCodigo(codigo);
        prod.setDescricao(descricao);
        prod.setUnidadeMedida(unidadeMedida);
        prod.setQuantidade(quantidade);
        
        request.setAttribute("produtoObtido", prod);
        RequestDispatcher disp = request.getRequestDispatcher("exibeDados.jsp");
        disp.forward(request, response);
    }   

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
