package com.human.ex;
public class homework3 {
	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//���� 3 ĳ�� ���α׷�
	
		System.out.print("�� ���� ���� ���� �Է��ϼ��� : ");
		String str1 = sc.next();
		String str2 = sc.next();
		String str3 = sc.next();
		
		int i1 = Integer.parseInt(str1);
		int i2 = Integer.parseInt(str2);
		int i3 = Integer.parseInt(str3);
		int change = 10000-(i1+i2+i3);
		
		System.out.println(String.format("�Ž������� %d�� �Դϴ�.", change));
		
		
		sc.close();
		

	}

}
