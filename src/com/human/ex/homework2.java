package com.human.ex;
public class homework2 {
	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//문제 2  3.76시간은?? 
		
		System.out.print("시간을 입력하세요 : ");
		String str1 = sc.nextLine();
		double d1 = Double.parseDouble(str1);
		int i1 = (int) d1;
		int i2 = (int) (((d1*3600)-(i1*3600))/60);
		double i3 = (((d1*3600)-(i1*3600))%60);
		/*
		 * 정확한 시간계산 검증 식
		 * System.out.println(i1);
		System.out.println(i2);
		System.out.println(((d1*3600)-(i1*3600)));*/
		
		String time = String.format("%d 시간  %d 분 %d 초", i1, i2,(int) i3);
		System.out.println(time);
		
		sc.close();
		

	}

}
