package ��������ϰ_5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class text5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		LocalDate s1 = LocalDate.parse(s);
		LocalDate s2 = s1.plus(7,ChronoUnit.DAYS);
		System.out.println(s2);
		//����̨����һ�����ڼ�����������
		
		LocalDateTime nowdate=LocalDateTime.now();
		System.out.println(nowdate);

	}

}
