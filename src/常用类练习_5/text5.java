package 常用类练习_5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

public class text5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		LocalDate s1 = LocalDate.parse(s);
		LocalDate s2 = s1.plus(7,ChronoUnit.DAYS);
		System.out.println(s2.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
		//控制台输入一个日期加上七天后输出MEDIUM格式的日期
		
		LocalDateTime nowdate=LocalDateTime.now();
		System.out.println(nowdate.format(DateTimeFormatter
				.ofLocalizedDateTime(FormatStyle.SHORT,FormatStyle.SHORT)));
		//短格式
		System.out.println(nowdate.format(DateTimeFormatter
				.ofLocalizedDateTime(FormatStyle.MEDIUM,FormatStyle.MEDIUM)));
	    //中等格式
		System.out.println(nowdate.format(DateTimeFormatter
				.ofLocalizedDateTime(FormatStyle.FULL,FormatStyle.MEDIUM)));
		/*System.out.println(nowdate.format(DateTimeFormatter
				.ofLocalizedDateTime(FormatStyle.LONG,FormatStyle.LONG)));
		*///无法从时间2019-04-12t23:02中提取区域ID:21.473540400，报错了
		
		

	}

}
