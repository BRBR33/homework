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
		
		int ft = change/5000;
		int t = (change%5000)/1000;
		int fh = (change%5000%1000)/500;
		int h = (change%5000%1000%500)/100;
		int fte = (change%5000%1000%500%100)/50;
		int te = (change%5000%1000%500%100%50)/10;
		
		String re = String.format("��õ���� : %d��\nõ���� : %d��\n�����¥�� ���� : %d��\n"
				+ "���¥�� ���� : %d��\n���ʿ�¥�� ���� : %d��\n�ʿ�¥�� ���� : %d��", ft, t, fh, h, fte, te);
		
		System.out.println(re);
		
		
		sc.close();
		

	}

}
