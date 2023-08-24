package edu.chunjae.model;

import edu.chunjae.dto.*;

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

        return cnt;
    }

    //출고 처리(PaymentDAO.addServe(serv))
    public int addServe(Serve serv){
        int cnt = 0;

        return cnt;
    }

    public int getSno(){
        int sno = 0;

        return sno;
    }

    public Payment getPayment(int sno){
        Payment pay = new Payment();
        DBConnect con = new PostgreCon();
        conn = con.connect();

        try{
            pstmt = conn.prepareStatement(DBConnect.PAYMENT_SELECT_ONE);
            pstmt.setInt(1,sno);
            rs = pstmt.executeQuery();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return pay;
    }


   /* public List<PaymentVO> getCidPayment(String cid){

        List<PaymentVO> payList = new ArrayList<>();
        DBConnect con = new PostgreCon();
        conn = con.connect();

        try{
            pstmt = conn.prepareStatement(DBConnect.PAYMENT_SELECT_CID);
            pstmt.setString(1,"cid");
            rs = pstmt.executeQuery();

            while(rs.next()){
                PaymentVO pay = new PaymentVO();
                pay.setSno(rs.getInt("sno"));
                pay.setCid(rs.getString("cid"));
                pay.setPno(rs.getInt("no"));
                pay.setAmount(rs.getInt("amount"));
                pay.setPmethod(rs.getString("pmethod"));
                pay.setPcom(rs.getString("pcom"));
                pay.setCnum(rs.getString("cnum"));
                pay.setPayprice(rs.getInt("payprice"));
                pay.setPname(getVOPname(pay.getPno()));
                //pay.setPstate(getVOState(pay.getSno()));
                payList.add(pay);
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);

        }

        return payList;
    }*/


    public int returnPayment(int sno, int pno, int amount, String cid) {
        int cnt = 0;
        return 0;
    }

    public String getVOPname(int pno){

        ProductDAO dao = new ProductDAO();
        Product pro = dao.getProduct(pno);

        return pro.getPname();
    }

   /* public int getVOState(int pno){

        DeliveryDAO dao = new DeliveryDAO();
        Delivery del = dao.getBySnoDelivery();

        return del.getPstate();
    }*/
}
