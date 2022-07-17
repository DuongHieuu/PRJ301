/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package Controller;

import DAL.CartDAO;
import DAL.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import model.Account;
import model.Cart;
import model.Product;

/**
 *
 * @author dthie
 */
public class cartController extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet cartController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet cartController at " + request.getContextPath() + "</h1>");
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

        String pidString = request.getParameter("pid");
        int pid = Integer.parseInt(pidString);
        ProductDAO pd = new ProductDAO();
        Product p = pd.getProductById(pid);
        int amount = 1;
        CartDAO cartDAO = new CartDAO();
        int cartId = cartDAO.getIdOfLastCart() + 1;
        Cart c = new Cart();
        //if user login
        if (session.getAttribute("acc") != null) {
            Account a = (Account) session.getAttribute("acc");

            c.setCartid(cartId);
            c.setAmount(amount);
            c.setProduct(p);
            c.setAccountid(a.getAid());
        } // if not login set account id =0
        else {
            c.setCartid(cartId);
            c.setAmount(amount);
            c.setProduct(p);
            c.setAccountid(0);
        }

        // check listcart on session null or not 
        if (session.getAttribute("listcart") != null) {
            ArrayList<Cart> listCart = (ArrayList<Cart>) session.getAttribute("listcart");
            boolean sameProduct = false;
            for (Cart cart : listCart) {
                //check new product exist in listcart or not
                if (cart.getProduct().getPid() == pid) {
                    cart.setAmount(cart.getAmount() + 1);
                    sameProduct = true;
                }
            }
            if (!sameProduct) {
                listCart.add(c);
            }
            session.setAttribute("listcart", listCart);
            session.setAttribute("number", listCart.size());
            response.sendRedirect("showCartController");
        } else {

            ArrayList<Cart> listCart = new ArrayList<>();
            listCart.add(c);
            session.setAttribute("listcart", listCart);
            session.setAttribute("number", listCart.size());

            response.sendRedirect("showCartController");

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
        HttpSession session = request.getSession();
        String pidString = request.getParameter("pid");
        int pid = Integer.parseInt(pidString);
        ProductDAO pd = new ProductDAO();
        Product p = pd.getProductById(pid);
        String amountString = request.getParameter("quantity");
        int amount = Integer.parseInt(amountString);
        CartDAO cartDAO = new CartDAO();
        int cartId = cartDAO.getIdOfLastCart() + 1;
        Cart c = new Cart();
        //if user login
        if (session.getAttribute("acc") != null) {
            Account a = (Account) session.getAttribute("acc");

            c.setCartid(cartId);
            c.setAmount(amount);
            c.setProduct(p);
            c.setAccountid(a.getAid());
        } // if not login set account id =0
        else {
            c.setCartid(cartId);
            c.setAmount(amount);
            c.setProduct(p);
            c.setAccountid(0);
        }
        // check listcart on session null or not 
        if (session.getAttribute("listcart") != null) {
            ArrayList<Cart> listCart = (ArrayList<Cart>) session.getAttribute("listcart");
            boolean sameProduct = false;
            for (Cart cart : listCart) {
                //check new product exist in listcart or not
                if (cart.getProduct().getPid() == pid) {
                    cart.setAmount(cart.getAmount() + amount);
                    sameProduct = true;
                }
            }
            //if not the same product add new product to list
            if (!sameProduct) {
                listCart.add(c);
            }
            session.setAttribute("listcart", listCart);
            session.setAttribute("number", listCart.size());
            response.sendRedirect("showCartController");
        } else {

            ArrayList<Cart> listCart = new ArrayList<>();
            listCart.add(c);
            session.setAttribute("listcart", listCart);
            session.setAttribute("number", listCart.size());

            response.sendRedirect("showCartController");

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
