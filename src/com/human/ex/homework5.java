package com.human.ex;
public class homework5 {
	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		//���� 2  3.76�ð���?? 
		
		System.out.println("�ð��� �Է��ϼ���");
		String st2=sc.nextLine();
		double d4=Double.parseDouble(st2);
		int i1=(int)d4;
		int i2=(int)((((d4*100)%100)/100)*60);
		d4=((((d4*100)%100)/100)*60);
		int i3=(int)((((d4*100)%100)/100)*60);
		System.out.println(String.format("���� �ð��� %d�ð� %d�� %d�� �Դϴ�.",i1 ,i2 ,i3));
		sc.close();
		

	}

}
