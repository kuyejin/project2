package edu.chunjae.controller.payment;

import edu.chunjae.dto.Payment;
import edu.chunjae.model.PaymentDAO;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/ReturnPayment.do")
public class ReturnPaymentCtrl extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int sno = Integer.parseInt(request.getParameter("sno"));

        PaymentDAO payDAO = new PaymentDAO();
        Payment pay = payDAO.getPayment(sno);
        int cnt = payDAO.returnPayment(sno, pay.getPno(), pay.getAmount(), pay.getCid());

        if(sno >0){
            response.sendRedirect(request.getContextPath() + "/PaymentList.do");
        }

    }


}
