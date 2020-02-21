package com.human.ex;
public class homework {
	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//문제 1 야구경기장 입장률
		
		System.out.print("야구 경기장의 좌석 수 : ");
		String str1 = sc.nextLine();
		double d1 = Double.parseDouble(str1);
		System.out.print("입장 관중 수 : ");
		str1 = sc.nextLine();
		double d2 = Double.parseDouble(str1);
		System.out.println(String.format("입장률 : %.1f%%", (100*d2/d1)));
		
		sc.close();
		

	}

}
