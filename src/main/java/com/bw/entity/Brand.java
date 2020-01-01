package com.bw.entity;

public class Brand {
	private Integer id;
	private String name;

	@Override
	public String toString() {
		return "Brand [id=" + id + ", name=" + name + "]";
	}

	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Brand(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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

}
