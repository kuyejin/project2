package edu.chunjae.model;

import edu.chunjae.dto.Custom;
import edu.chunjae.dto.Payment;
import edu.chunjae.dto.Serve;
import edu.chunjae.util.AES256;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PaymentDAO {
    static Connection conn = null;
    static PreparedStatement pstmt = null;
    static ResultSet rs = null;
    String sql = "";


    //결제 처리(PaymentDAO.addPayment(pay))
    public int addPayment(Payment pay){
        int cnt = 0;
        return  cnt;
    }



    //출고처리 (PaymentDAO.addSerce(Serv))
    public int addServe(Serve serv) {
        int cnt = 0;
        return  cnt;


    }

    //배송등록(DeliveryDAO.addDelivery(del))
    public int getSno() {
        int sno = 0;
        return  sno;


    }

    //쇼핑카트에서 결제한 정보라면 (CartDAO.delCart(cartno));




}
