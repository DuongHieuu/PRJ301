/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controller;

import DAL.CustomerDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import model.Cart;
import model.Customer;

/**
 *
 * @author dthie
 */
public class checkOutController extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet checkoutController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet checkoutController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        HttpSession session = request.getSession();
        if (session.getAttribute("listcart") == null) {
            response.sendRedirect("showCartController");
        } else {
            ArrayList<Cart> listCart = (ArrayList<Cart>) session.getAttribute("listcart");
            double discount = 0;
            double total = 0;
            for (Cart cart : listCart) {
                total = total + cart.getAmount() * cart.getProduct().getProductPrice();
            }
            discount = Math.ceil(total * 0.1 * 10.0) / 10.0;
            double subtotal = total - discount;
            request.setAttribute("discount", discount + "$");
            request.setAttribute("subtotal", subtotal + "$");
            request.setAttribute("listB", listCart);
            request.getRequestDispatcher("checkout.jsp").forward(request, response);
        }
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

        String firstname = request.getParameter("checkoutFName");
        String lastname = request.getParameter("checkoutFName");
        String address = request.getParameter("checkoutAddress");
        String city = request.getParameter("checkoutCity");
        String phone = request.getParameter("checkoutPhone");
        Customer cust = new Customer();
        cust.setFirstname(firstname);
        cust.setLastname(lastname);
        cust.setAddress(address);
        cust.setCity(city);
        cust.setPhone(phone);

        CustomerDAO custdao = new CustomerDAO();
        Customer custcheck = custdao.getCustomer(cust);
        //check new customer has been saved in database before or not
        if (custcheck == null) {
            custdao.insertCustomer(cust);

        }

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
