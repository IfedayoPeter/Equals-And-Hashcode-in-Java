package com.project.equalsandhashcode;

public class EqualsAndHashcodeDemo {

	public static void main(String[] args) {

		StudentOne john1 = new StudentOne(1, "john", "2 allen");
		StudentOne john2 = new StudentOne(1, "john", "2 allen");
		StudentOne john3 = new StudentOne(3, "john", "2 allen");

		System.out.println(john1.equals(john2));
		System.out.println(john1.equals(john3));
	}

}
