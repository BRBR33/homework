package com.human.ex;
public class homework {
	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//���� 1 �߱������ �����
		
		System.out.print("�߱� ������� �¼� �� : ");
		String str1 = sc.nextLine();
		double d1 = Double.parseDouble(str1);
		System.out.print("���� ���� �� : ");
		str1 = sc.nextLine();
		double d2 = Double.parseDouble(str1);
		System.out.println(String.format("����� : %.1f%%", (100*d2/d1)));
		
		sc.close();
		

	}

}
