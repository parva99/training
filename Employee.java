package com.core.demo;

public class Employee {
	
	public int add() {
	int a=10,b=20;
	int c=a+b;
	
	System.out.println("addition is "+c);
	return c;
	}
	public int subtract() {
		int a=25,b=3;
		System.out.println("subtracted value is "+(a-b));
		return a-b;
	}
	public int multiply() {
		int a=25,b=3;
		System.out.println("multiplied value is "+(a*b));
		return a*b;
	}
	public float devide() {
		float a=25,b=3;
		System.out.println("devided value is "+(a/b));
		return a/b;
	}
	public int modulo() {
		int a=25,b=9;
		System.out.println("modulo value is "+(a/b));
		return a%b;
	}
	
	public static void main(String args[]) {
		Employee emp = new Employee();
		emp.add();
		emp.subtract();
		emp.multiply();
		emp.devide();
		emp.modulo();
		
	}
}