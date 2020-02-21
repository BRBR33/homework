package com.human.ex;
public class homework3 {
	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//문제 3 캐셔 프로그램
	
		System.out.print("세 개의 물건 값을 입력하세요 : ");
		String str1 = sc.next();
		String str2 = sc.next();
		String str3 = sc.next();
		
		int i1 = Integer.parseInt(str1);
		int i2 = Integer.parseInt(str2);
		int i3 = Integer.parseInt(str3);
		int change = 10000-(i1+i2+i3);
		
		System.out.println(String.format("거스름돈은 %d원 입니다.", change));
		
		int ft = change/5000;
		int t = (change%5000)/1000;
		int fh = (change%5000%1000)/500;
		int h = (change%5000%1000%500)/100;
		int fte = (change%5000%1000%500%100)/50;
		int te = (change%5000%1000%500%100%50)/10;
		
		String re = String.format("오천원권 : %d장\n천원권 : %d장\n오백원짜리 동전 : %d개\n"
				+ "백원짜리 동전 : %d개\n오십원짜리 동전 : %d개\n십원짜리 동전 : %d개", ft, t, fh, h, fte, te);
		
		System.out.println(re);
		
		
		sc.close();
		

	}

}
