package com.javaweb_week.salefood.entity;
public class Foods {
    private Integer fid;
    private Integer apk;
    private String fname;
    private Integer fnum;
    public Foods() {
        super();
    }
    public Foods(Integer fid,Integer apk,String fname,Integer fnum) {
        super();
        this.fid = fid;
        this.apk = apk;
        this.fname = fname;
        this.fnum = fnum;
    }
    public Integer getFid() {
        return this.fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getApk() {
        return this.apk;
    }

    public void setApk(Integer apk) {
        this.apk = apk;
    }

    public String getFname() {
        return this.fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public Integer getFnum() {
        return this.fnum;
    }

    public void setFnum(Integer fnum) {
        this.fnum = fnum;
    }

}
