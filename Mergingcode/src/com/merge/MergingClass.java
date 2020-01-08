package com.merge;

public class MergingClass {
	int a=10,b=20,sum=0;
	
	//addition
	public void add() {
		sum=a+b;
		System.out.println("addition is  "+sum);
	}

	public static void main(String[] args) {
		MergingClass obj=new MergingClass();
		obj.add();
		

	}

}
