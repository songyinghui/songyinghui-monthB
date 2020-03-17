package com.songyinghui.month_B.bean;

import java.util.Date;
import java.util.List;

public class JiaGong {
	private Integer id;// id
	private String dh;// 联络单号
	private Date baoTime;// 报送日期
	private String makeDept;// 制造部名称
	private Integer makeDeptNo;// 制造部编号
	private Integer pid;// 外键
	private Double oneprice;// 参考单价
	private Integer num;// 数量
	private Double price;// 金额
	private String yaoqiu;
	private String matchineBh;// 设备部编号
	private String matchineDept;// 设备部
	private Double shOnePrice;// 审核单价
	private Double shPrice;// 审核金额
	private String people;// 发获确认人
	private String dw;// 加工单位
	private String dwdj;// 单位单价
	private Date returnTime;// 配件送回时间
	private String picture;// 图片
	private String telePeople;// 联系人
	private Double dwPrice;// 加工单位金额
	private String okPeople;// 收获确认人
	private String bxPeople;// 报销人
	private String beizhu;// 备注
	private Date waisong;
	PeiJian peijian;

	public Integer getId() {
		return id;
	}
	

	public Date getWaisong() {
		return waisong;
	}


	public void setWaisong(Date waisong) {
		this.waisong = waisong;
	}


	public void setMakeDeptNo(Integer makeDeptNo) {
		this.makeDeptNo = makeDeptNo;
	}


	public void setId(Integer id) {
		this.id = id;
	}

	public String getDh() {
		return dh;
	}

	public void setDh(String dh) {
		this.dh = dh;
	}

	public Date getBaoTime() {
		return baoTime;
	}

	public void setBaoTime(Date baoTime) {
		this.baoTime = baoTime;
	}

	public String getMakeDept() {
		return makeDept;
	}

	public void setMakeDept(String makeDept) {
		this.makeDept = makeDept;
	}

	public Integer getMakeDeptNo() {
		return makeDeptNo;
	}

	public void setMakeDepteNo(Integer makeDepteNo) {
		this.makeDeptNo = makeDepteNo;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Double getOneprice() {
		return oneprice;
	}

	public void setOneprice(Double oneprice) {
		this.oneprice = oneprice;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getYaoqiu() {
		return yaoqiu;
	}

	public void setYaoqiu(String yaoqiu) {
		this.yaoqiu = yaoqiu;
	}

	public String getMatchineBh() {
		return matchineBh;
	}

	public void setMatchineBh(String matchineBh) {
		this.matchineBh = matchineBh;
	}

	public String getMatchineDept() {
		return matchineDept;
	}

	public void setMatchineDept(String matchineDept) {
		this.matchineDept = matchineDept;
	}

	public Double getShOnePrice() {
		return shOnePrice;
	}

	public void setShOnePrice(Double shOnePrice) {
		this.shOnePrice = shOnePrice;
	}

	public Double getShPrice() {
		return shPrice;
	}

	public void setShPrice(Double shPrice) {
		this.shPrice = shPrice;
	}

	public String getPeople() {
		return people;
	}

	public void setPeople(String people) {
		this.people = people;
	}

	public String getDw() {
		return dw;
	}

	public void setDw(String dw) {
		this.dw = dw;
	}

	public String getDwdj() {
		return dwdj;
	}

	public void setDwdj(String dwdj) {
		this.dwdj = dwdj;
	}

	public Date getReturnTime() {
		return returnTime;
	}

	public void setReturnTime(Date returnTime) {
		this.returnTime = returnTime;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getTelePeople() {
		return telePeople;
	}

	public void setTelePeople(String telePeople) {
		this.telePeople = telePeople;
	}

	public Double getDwPrice() {
		return dwPrice;
	}

	public void setDwPrice(Double dwPrice) {
		this.dwPrice = dwPrice;
	}

	public String getOkPeople() {
		return okPeople;
	}

	public void setOkPeople(String okPeople) {
		this.okPeople = okPeople;
	}

	public String getBxPeople() {
		return bxPeople;
	}

	public void setBxPeople(String bxPeople) {
		this.bxPeople = bxPeople;
	}

	public String getBeizhu() {
		return beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

	public PeiJian getPeijian() {
		return peijian;
	}

	public void setPeijian(PeiJian peijian) {
		this.peijian = peijian;
	}

	public JiaGong(Integer id, String dh, Date baoTime, String makeDept, Integer makeDepteNo, Integer pid,
			Double oneprice, Integer num, Double price, String yaoqiu, String matchineBh, String matchineDept,
			Double shOnePrice, Double shPrice, String people, String dw, String dwdj, Date returnTime, String picture,
			String telePeople, Double dwPrice, String okPeople, String bxPeople, String beizhu, PeiJian peijian) {
		super();
		this.id = id;
		this.dh = dh;
		this.baoTime = baoTime;
		this.makeDept = makeDept;
		this.makeDeptNo = makeDepteNo;
		this.pid = pid;
		this.oneprice = oneprice;
		this.num = num;
		this.price = price;
		this.yaoqiu = yaoqiu;
		this.matchineBh = matchineBh;
		this.matchineDept = matchineDept;
		this.shOnePrice = shOnePrice;
		this.shPrice = shPrice;
		this.people = people;
		this.dw = dw;
		this.dwdj = dwdj;
		this.returnTime = returnTime;
		this.picture = picture;
		this.telePeople = telePeople;
		this.dwPrice = dwPrice;
		this.okPeople = okPeople;
		this.bxPeople = bxPeople;
		this.beizhu = beizhu;
		this.peijian = peijian;
	}

	public JiaGong() {
		super();
	}

	@Override
	public String toString() {
		return "JiaGong [id=" + id + ", dh=" + dh + ", baoTime=" + baoTime + ", makeDept=" + makeDept + ", makeDepteNo="
				+ makeDeptNo + ", pid=" + pid + ", oneprice=" + oneprice + ", num=" + num + ", price=" + price
				+ ", yaoqiu=" + yaoqiu + ", matchineBh=" + matchineBh + ", matchineDept=" + matchineDept
				+ ", shOnePrice=" + shOnePrice + ", shPrice=" + shPrice + ", people=" + people + ", dw=" + dw
				+ ", dwdj=" + dwdj + ", returnTime=" + returnTime + ", picture=" + picture + ", telePeople="
				+ telePeople + ", dwPrice=" + dwPrice + ", okPeople=" + okPeople + ", bxPeople=" + bxPeople
				+ ", beizhu=" + beizhu + ", peijian=" + peijian + "]";
	}

}
