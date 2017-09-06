/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tadsb.devsisweb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author roger
 */
@WebServlet(name="produtos", urlPatterns="/produtos")
public class ProdutoServlet extends HttpServlet {

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
        
        response.setContentType("text/html;charset=UTF-8");
        
        List<Produto> produtos = new ArrayList<>();
        
        produtos.add(new Produto(1, "Notebook Dell Inspiron i15-5567-D30C", "Intel Core i5 8GB (AMD Radeon R7 M445 de 2GB) 1TB Tela LED 15,6\" Linux - Cinza", 2899.00));
        produtos.add(new Produto(1, "IPhone 7", "32GB Dourado Desbloqueado IOS 10 Wi-fi + 4G Câmera 12MP - Apple", 3499.00));
        produtos.add(new Produto(1, "Smartphone Moto G 5", "Dual Chip Android 7.0 Tela 5\" 32GB 4G Câmera 13MP", 1135.23));
        produtos.add(new Produto(1, "Notebook Acer F5-573G-519X", "Intel Core I5 8GB (GeForce 940MX com 2GB) 2TB LED 15.6\" Windows 10 - Prata", 3339.00));
        produtos.add(new Produto(1, "Computador do Milhão", "Um computador zoado", 1000.00));
        produtos.add(new Produto(1, "Computador do Milhão", "Um computador zoado", 1000.00));
        produtos.add(new Produto(1, "Computador do Milhão", "Um computador zoado", 1000.00));
        produtos.add(new Produto(1, "Computador do Milhão", "Um computador zoado", 1000.00));
        produtos.add(new Produto(1, "Computador do Milhão", "Um computador zoado", 1000.00));
        produtos.add(new Produto(1, "Computador do Milhão", "Um computador zoado", 1000.00));
        produtos.add(new Produto(1, "Computador do Milhão", "Um computador zoado", 1000.00));
        produtos.add(new Produto(1, "Computador do Milhão", "Um computador zoado", 1000.00));
        produtos.add(new Produto(1, "Computador do Milhão", "Um computador zoado", 1000.00));
        produtos.add(new Produto(1, "Computador do Milhão", "Um computador zoado", 1000.00));
        produtos.add(new Produto(1, "Computador do Milhão", "Um computador zoado", 1000.00));
        produtos.add(new Produto(1, "Computador do Milhão", "Um computador zoado", 1000.00));
        produtos.add(new Produto(1, "Computador do Milhão", "Um computador zoado", 1000.00));
        produtos.add(new Produto(1, "Computador do Milhão", "Um computador zoado", 1000.00));        
        produtos.add(new Produto(1, "Computador do Milhão", "Um computador zoado", 1000.00));
        produtos.add(new Produto(1, "Computador do Milhão", "Um computador zoado", 1000.00));
        
        
        request.setAttribute("produtos", produtos);
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/produtos.jsp");
        dispatcher.forward(request, response);
        
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
