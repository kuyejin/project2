package edu.chunjae.model;

import edu.chunjae.dto.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

    static Connection conn = null;
    static PreparedStatement pstmt = null;
    static ResultSet rs = null;

    String sql="";

    public List<Product> getProductList(){
        List<Product> proList = new ArrayList<>();
        return proList;
    }

    public Product getProduct(int pno){
        Product pro = new Product();
        return pro;
    }

    public int addProduct(Product pro){
        int cnt = 0;
        return cnt;
    }

    public int updateProduct(Product pro){
        int cnt = 0;
        return cnt;
    }

    public int delProduct(int pno){
        int cnt = 0;
        return cnt;
    }

}
