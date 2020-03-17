package com.songyinghui.month_B.bean;

public class PeiJian {
	private Integer id;
	private String name;
	private String bh;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBh() {
		return bh;
	}

	public void setBh(String bh) {
		this.bh = bh;
	}

	public PeiJian(Integer id, String name, String bh) {
		super();
		this.id = id;
		this.name = name;
		this.bh = bh;
	}

	public PeiJian() {
		super();
	}

	@Override
	public String toString() {
		return "PeiJian [id=" + id + ", name=" + name + ", bh=" + bh + "]";
	}

}
