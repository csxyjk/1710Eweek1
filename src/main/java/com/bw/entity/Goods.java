package com.bw.entity;

public class Goods {
	private Integer id;
	private String name;
	private String ename;
	private Double price;
	private Integer num;
	private String pic;

	private Integer bid;
	private Integer tid;
	private String bname;
	private String tname;

	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", ename=" + ename + ", price=" + price + ", num=" + num
				+ ", pic=" + pic + ", bid=" + bid + ", tid=" + tid + ", bname=" + bname + ", tname=" + tname + "]";
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Goods(Integer id, String name, String ename, Double price, Integer num, String pic, Integer bid, Integer tid,
			String bname, String tname) {
		super();
		this.id = id;
		this.name = name;
		this.ename = ename;
		this.price = price;
		this.num = num;
		this.pic = pic;
		this.bid = bid;
		this.tid = tid;
		this.bname = bname;
		this.tname = tname;
	}

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

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}

}
