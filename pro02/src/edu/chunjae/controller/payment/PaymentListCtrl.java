package edu.chunjae.controller.payment;

import edu.chunjae.dto.Payment;
import edu.chunjae.model.PaymentDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/PaymentList.do")
public class PaymentListCtrl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String cid = (String) session.getAttribute("sid");

        PaymentDAO payDAO = new PaymentDAO();
        //List<Payment> payList = payDAO.getCidPayment(cid);



        //request.setAttribute("payList",payList);
        RequestDispatcher view = request.getRequestDispatcher("/Payment/paymentList.jsp");
        view.forward(request,response);
    }


}
