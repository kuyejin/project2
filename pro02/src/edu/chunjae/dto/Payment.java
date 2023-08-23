package edu.chunjae.dto;

public class Payment {
    private int sno; //결제번호(auto)
    private String cid; //고객아이디
    private int pno; //상품번호
    private int amount; //구매수량
    private String pmethod; //결제수단
    private String pcome; //카드 대행사
    private String cnum; //결제카드(계좌)번호
    private int payprice; //결제금액
    private String dno; //배송코드

    public Payment(){};

    public Payment(int sno, String cid, int pno, int amount, String pmethod, String pcome, String cnum, int payprice, String dno) {
        this.sno = sno;
        this.cid = cid;
        this.pno = pno;
        this.amount = amount;
        this.pmethod = pmethod;
        this.pcome = pcome;
        this.cnum = cnum;
        this.payprice = payprice;
        this.dno = dno;
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public int getPno() {
        return pno;
    }

    public void setPno(int pno) {
        this.pno = pno;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getPmethod() {
        return pmethod;
    }

    public void setPmethod(String pmethod) {
        this.pmethod = pmethod;
    }

    public String getPcome() {
        return pcome;
    }

    public void setPcome(String pcome) {
        this.pcome = pcome;
    }

    public String getCnum() {
        return cnum;
    }

    public void setCnum(String cnum) {
        this.cnum = cnum;
    }

    public int getPayprice() {
        return payprice;
    }

    public void setPayprice(int payprice) {
        this.payprice = payprice;
    }

    public String getDno() {
        return dno;
    }

    public void setDno(String dno) {
        this.dno = dno;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "sno=" + sno +
                ", cid='" + cid + '\'' +
                ", pno=" + pno +
                ", amount=" + amount +
                ", pmethod='" + pmethod + '\'' +
                ", pcome='" + pcome + '\'' +
                ", cnum=" + cnum +
                ", payprice=" + payprice +
                ", dno='" + dno + '\'' +
                '}';
    }
}
