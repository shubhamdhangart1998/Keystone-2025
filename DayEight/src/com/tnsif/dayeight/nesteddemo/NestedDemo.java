package com.tnsif.dayeight.nesteddemo;

public class NestedDemo implements OuterInterface, OuterInterface.InnerInterface{

	@Override
	public void calArea() {
		// TODO Auto-generated method stub
		System.out.println("OuterInterface");
		
	}

	@Override
	public void print() {
		System.out.println("inner Interface");
		
	}
	

}
