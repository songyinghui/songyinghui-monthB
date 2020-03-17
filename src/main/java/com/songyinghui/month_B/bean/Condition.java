package com.songyinghui.month_B.bean;

public class Condition {
	private String dh;
	private String beizhu;
	private String time1;
	private String time2;
	private String selectTj;// 查询条件
	private String selectMe;// 查询内容

	public String getDh() {
		return dh;
	}

	public void setDh(String dh) {
		this.dh = dh;
	}

	public String getBeizhu() {
		return beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

	public String getTime1() {
		return time1;
	}

	public void setTime1(String time1) {
		this.time1 = time1;
	}

	public String getTime2() {
		return time2;
	}

	public void setTime2(String time2) {
		this.time2 = time2;
	}

	public String getSelectTj() {
		return selectTj;
	}

	public void setSelectTj(String selectTj) {
		this.selectTj = selectTj;
	}

	public String getSelectMe() {
		return selectMe;
	}

	public void setSelectMe(String selectMe) {
		this.selectMe = selectMe;
	}

	public Condition(String dh, String beizhu, String time1, String time2, String selectTj, String selectMe) {
		super();
		this.dh = dh;
		this.beizhu = beizhu;
		this.time1 = time1;
		this.time2 = time2;
		this.selectTj = selectTj;
		this.selectMe = selectMe;
	}

	public Condition() {
		super();
	}

	@Override
	public String toString() {
		return "Condition [dh=" + dh + ", beizhu=" + beizhu + ", time1=" + time1 + ", time2=" + time2 + ", selectTj="
				+ selectTj + ", selectMe=" + selectMe + "]";
	}

}
