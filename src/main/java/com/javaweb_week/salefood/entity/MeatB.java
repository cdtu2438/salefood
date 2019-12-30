package com.javaweb_week.salefood.entity;

import org.springframework.stereotype.Service;

import javax.persistence.*;

@Service
@Entity
@Table(name = "meat")
public class MeatB {
    private Integer mid;
    private Integer meatid;
    private String mname;
    private String mstyle;
    private Double mprice;
    private String mpicture;

    public MeatB() {
        super();
    }

    public MeatB(Integer mid, Integer meatid, String mname, String mstyle, Double mprice, String mpicture) {
        super();
        this.mid = mid;
        this.meatid = meatid;
        this.mname = mname;
        this.mstyle = mstyle;
        this.mprice = mprice;
        this.mpicture = mpicture;
    }

    @Id
    public Integer getMid() {
        return this.mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    @Column
    public Integer getMeatid() {
        return this.meatid;
    }

    public void setMeatid(Integer meatid) {
        this.meatid = meatid;
    }
    @Column
    public String getMname() {
        return this.mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }
    @Column
    public String getMstyle() {
        return this.mstyle;
    }

    public void setMstyle(String mstyle) {
        this.mstyle = mstyle;
    }
    @Column
    public Double getMprice() {
        return this.mprice;
    }

    public void setMprice(Double mprice) {
        this.mprice = mprice;
    }
    @Column
    public String getMpicture() {
        return this.mpicture;
    }

    public void setMpicture(String mpicture) {
        this.mpicture = mpicture;
    }

}
