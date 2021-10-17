package controller.AdminServlet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dal.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;
import model.Booking;
import dal.roomDAO;
import model.Room;

/**
 *
 * @author Admin 88
 */
@WebServlet(urlPatterns = {"/bookdetail"})
public class bookingDetailServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BookingServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BookingServlet at " + request.getContextPath() + "</h1>");
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
        Account ac = (Account) session.getAttribute("account");

        DAO db = new DAO();
        roomDAO rm = new roomDAO();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();

        int cusid = ac.getId();
        int id = Integer.parseInt(request.getParameter("id"));
        String date = fmt.format(now);
        String checkin = request.getParameter("datefrom");
        String checkout = request.getParameter("dateto");
        double total = Double.parseDouble(request.getParameter("total"));

        Booking book = new Booking(cusid, rm.getRoomByID(id), date, checkin, checkout, total);
        response.sendRedirect("discovery");
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
        Account ac = (Account) session.getAttribute("account");

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();

        if (ac != null) {
            DAO db = new DAO();
            roomDAO rm = new roomDAO();
            int cusid = ac.getId();
            int id = Integer.parseInt(request.getParameter("id"));
            String date = fmt.format(now);
            String checkin = request.getParameter("checkin");
            String checkout = request.getParameter("checkout");

            Room r = rm.getRoomByID(id);

            LocalDate start = LocalDate.parse(checkin);
            LocalDate end = LocalDate.parse(checkout);
            Period age = Period.between(start, end);
            int diff = age.getDays();

            Booking book = new Booking(cusid, rm.getRoomByID(id), date, checkin, checkout);

            request.setAttribute("booking", book);
            request.setAttribute("numberDate", diff);
            request.setAttribute("room", r);

            request.getRequestDispatcher("payment.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("login").forward(request, response);
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