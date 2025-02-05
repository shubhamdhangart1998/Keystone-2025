package com.tnsif.dayone;

public class TypeCasting {

	public static void main(String[] args) {
		
		//widening / implicit type casting 
		
		
		byte b=10;
		
		int l=b;
		
		System.out.println(l);
		
		float f=100/3f;
		
		double d=f;
		System.out.println(d);

		char ch='A';
		int i=ch;
		
		System.out.println(i);
		
		//narrowing /explicit type casting 
		
		double f1=10.52f;  // 8 byte in deciaml 
		
		long  ll=(long) f1;     // 8 byte in whole no
		System.out.println(ll);
		
		long abc=9876543210L;
		
		int i12=(int) abc;
		System.out.println(i12);
		
		
		int xyz=130;
		byte qwe=(byte) xyz;
		
		System.out.println(qwe);
		
		// byte range -128 to 0 to 127
		
		
		
	}

}
