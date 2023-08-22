package edu.chunjae.dto;

public class Product {
    private int pno; //상품번호(auto);
    private String cate; //카테고리
    private int prono; //카테고리 번호 + 상품번호
    private String pname; //상품명
    private String pcomment; //상품설명
    private String plist; //상품목차
    private int price; //상품단가
    private String imgSrc1; //상품이미지1
    private String imgSrc2; //상품이미지2
    private String imgSrc3; //상품이미지3
    private String resdate; //등록일

    public Product(){};

    public Product(int pno, String cate, int prono, String pname, String pcomment, String plist, int price, String imgSrc1, String imgSrc2, String imgSrc3, String resdate) {
        this.pno = pno;
        this.cate = cate;
        this.prono = prono;
        this.pname = pname;
        this.pcomment = pcomment;
        this.plist = plist;
        this.price = price;
        this.imgSrc1 = imgSrc1;
        this.imgSrc2 = imgSrc2;
        this.imgSrc3 = imgSrc3;
        this.resdate = resdate;
    }

    public int getPno() {
        return pno;
    }

    public void setPno(int pno) {
        this.pno = pno;
    }

    public String getCate() {
        return cate;
    }

    public void setCate(String cate) {
        this.cate = cate;
    }

    public int getProno() {
        return prono;
    }

    public void setProno(int prono) {
        this.prono = prono;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPcomment() {
        return pcomment;
    }

    public void setPcomment(String pcomment) {
        this.pcomment = pcomment;
    }

    public String getPlist() {
        return plist;
    }

    public void setPlist(String plist) {
        this.plist = plist;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImgSrc1() {
        return imgSrc1;
    }

    public void setImgSrc1(String imgSrc1) {
        this.imgSrc1 = imgSrc1;
    }

    public String getImgSrc2() {
        return imgSrc2;
    }

    public void setImgSrc2(String imgSrc2) {
        this.imgSrc2 = imgSrc2;
    }

    public String getImgSrc3() {
        return imgSrc3;
    }

    public void setImgSrc3(String imgSrc3) {
        this.imgSrc3 = imgSrc3;
    }

    public String getResdate() {
        return resdate;
    }

    public void setResdate(String resdate) {
        this.resdate = resdate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pno=" + pno +
                ", cate='" + cate + '\'' +
                ", prono=" + prono +
                ", pname='" + pname + '\'' +
                ", pcomment='" + pcomment + '\'' +
                ", plist='" + plist + '\'' +
                ", price=" + price +
                ", imgSrc1='" + imgSrc1 + '\'' +
                ", imgSrc2='" + imgSrc2 + '\'' +
                ", imgSrc3='" + imgSrc3 + '\'' +
                ", resdate='" + resdate + '\'' +
                '}';
    }
}
