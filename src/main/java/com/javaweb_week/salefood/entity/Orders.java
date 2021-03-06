package com.javaweb_week.salefood.entity;


import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Entity
@Table(name = "orders")
public class Orders {

    private String oid;
    private Integer sid;
    private Double omoney;
    private Integer oyear;
    private Integer omonth;
    private Integer oday;

    public Orders() {
        super();
    }

    public Orders(String oid, Integer sid, Double omoney, Integer oyear, Integer omonth, Integer oday) {
        this.oid = oid;
        this.sid = sid;
        this.omoney = omoney;
        this.oyear = oyear;
        this.omonth = omonth;
        this.oday = oday;
    }

    @Id
    public String getOid() {
        return this.oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    @Column
    public Integer getSid() {
        return this.sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    @Column
    public Double getOmoney() {
        return this.omoney;
    }

    public void setOmoney(Double omoney) {
        this.omoney = omoney;
    }

    @Column
    public Integer getOyear() {
        return this.oyear;
    }

    public void setOyear(Integer oyear) {
        this.oyear = oyear;
    }

    @Column
    public Integer getOmonth() {
        return this.omonth;
    }

    public void setOmonth(Integer omonth) {
        this.omonth = omonth;
    }

    @Column
    public Integer getOday() {
        return this.oday;
    }

    public void setOday(Integer oday) {
        this.oday = oday;
    }

}
