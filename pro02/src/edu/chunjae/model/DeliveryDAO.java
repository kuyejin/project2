package edu.chunjae.model;

import edu.chunjae.dto.Delivery;
import edu.chunjae.dto.PaymentVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeliveryDAO {
    static Connection conn = null;
    static PreparedStatement pstmt = null;
    static ResultSet rs = null;
    String sql = "";

    //배송 등록(DeliveryDAO.addDelivery(del))
    public int addDelivery(Delivery del) {
        int cnt = 0;

        return cnt;
    }

    public Delivery getBySnoDelivery(int sno) {
        Delivery del = new Delivery();
        DBConnect con = new PostgreCon();
        conn = con.connect();

        try {
            pstmt = conn.prepareStatement(DBConnect.DELIVERY_SELECT_SNO);
            pstmt.setInt(1, del.getSno());
            rs = pstmt.executeQuery();

            while (rs.next()) {
                del.setDno(rs.getInt("dno"));
                del.setSno(rs.getInt("sno"));
                del.setCid(rs.getString("cid"));
                del.setDaddr(rs.getString("daddr"));
                del.setCustel(rs.getString("custel"));
                del.setPcom(rs.getString("pcom"));
                del.setPtel(rs.getString("ptel"));
                del.setPstate(rs.getInt("pstate"));
                del.setSdate(rs.getString("sdate"));
                del.setRdate(rs.getString("rdate"));
                del.setBcode(rs.getString("bcode"));


            }


        } catch (SQLException e) {
            throw new RuntimeException(e);

        } finally {
            con.close(rs, pstmt, conn);
        }


        return del;
    }
}
