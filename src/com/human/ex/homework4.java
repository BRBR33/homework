package com.human.ex;
public class homework4 {
	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//문제 4 자동차 주행시간 측정 프로그램
		
		System.out.print("거리(km)와 속력(km/h) 입력 : ");
		String str = sc.next();
		int s = Integer.parseInt(str);
		str = sc.next();
		int v = Integer.parseInt(str);
		double t1 = (double) s/v;
		
		int hour = (int) t1;
		int minute = (int) (((t1*3600)-(hour*3600))/60);
		double second = (((t1*3600)-(hour*3600))%60);
		String re = String.format("소요 시간은 %d시간 %d분 %.3f초입니다. ", hour, minute, second);
		System.out.println(re);
		
		
		sc.close();
		

	}

}
