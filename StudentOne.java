package com.project.equalsandhashcode;

import java.util.Objects;

public class StudentOne {

	private int num;
	private String name;
	private String address;

	public StudentOne(int num, String name, String address) {
		this.num = num;
		this.name = name;
		this.address = address;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int hashCode() {// hashcode is a memory bucket for objects
		return num;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentOne other = (StudentOne) obj;
		return (num == other.num);
	}

}
