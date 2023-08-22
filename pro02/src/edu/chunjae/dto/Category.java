package edu.chunjae.dto;

public class Category {
    private String cno; //A:초등교과사. B:초등참고서, C:초등문제점, D:초등기타
                        //E:증등교과사. F:중등참고서, G:중등문제점, H:중등기타
                        //I:증고등교과사. J:고등참고서, K:고등문제점, L:고등기타
                        //M:일반교과사. N:일반참고서, O:일반문제점, P:일반기타
                        //Q:유아콘텐츠. R:중등참고서, S:중등문제점, P:중등기타
                        //T:해외서적, U:해외컨텐츠
    private String cname; //카테고리명


    public Category(){};

    public Category(String cno, String cname) {
        this.cno = cno;
        this.cname = cname;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    @Override
    public String toString() {
        return "Category{" +
                "cno='" + cno + '\'' +
                ", cname='" + cname + '\'' +
                '}';
    }
}
