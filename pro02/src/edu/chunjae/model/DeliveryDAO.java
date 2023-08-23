package edu.chunjae.model;

import edu.chunjae.dto.Custom;
import edu.chunjae.dto.Delivery;
import edu.chunjae.util.AES256;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DeliveryDAO {
    static Connection conn = null;
    static PreparedStatement pstmt = null;
    static ResultSet rs = null;
    String key = "";

    // 배송등록
    public int addDelivery(Delivery del){
        int cnt = 0;

        return cnt;
    }

   
}
