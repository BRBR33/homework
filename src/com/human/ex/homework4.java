package com.human.ex;
public class homework4 {
	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//���� 4 �ڵ��� ����ð� ���� ���α׷�
		
		System.out.print("�Ÿ�(km)�� �ӷ�(km/h) �Է� : ");
		String str = sc.next();
		int s = Integer.parseInt(str);
		str = sc.next();
		int v = Integer.parseInt(str);
		double t1 = (double) s/v;
		
		int hour = (int) t1;
		int minute = (int) (((t1*3600)-(hour*3600))/60);
		double second = (((t1*3600)-(hour*3600))%60);
		String re = String.format("�ҿ� �ð��� %d�ð� %d�� %.3f���Դϴ�. ", hour, minute, second);
		System.out.println(re);
		
		
		sc.close();
		

	}

}
