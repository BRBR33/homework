package com.human.ex;
public class homework2 {
	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//���� 2  3.76�ð���?? 
		
		System.out.print("�ð��� �Է��ϼ��� : ");
		String str1 = sc.nextLine();
		double d1 = Double.parseDouble(str1);
		int i1 = (int) d1;
		int i2 = (int) (((d1*3600)-(i1*3600))/60);
		double i3 = (((d1*3600)-(i1*3600))%60);
		/*
		 * ��Ȯ�� �ð���� ���� ��
		 * System.out.println(i1);
		System.out.println(i2);
		System.out.println(((d1*3600)-(i1*3600)));*/
		
		String time = String.format("%d �ð�  %d �� %d ��", i1, i2,(int) i3);
		System.out.println(time);
		
		sc.close();
		

	}

}
