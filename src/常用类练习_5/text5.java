package 常用类练习_5;

import java.sql.Date;
import java.text.SimpleDateFormat;
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
		
		int year=nowdate.getYear();
		int month=nowdate.getMonthValue();
		int day=nowdate.getDayOfMonth();
		String year1=year+"";
		String month1=month+"";
		String day1=day+"";
		
		System.out.println("把年份修改为1999:");
		String date11="1999-";
		if(month<10) {
			String date12=date11+"0"+month1;
			if(day<10) {
				String date13=date12+"-0"+day1;
				LocalDate n1=LocalDate.parse(date13);
				System.out.println(n1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
			}else {
				String date13=date12+"-"+day1;
				LocalDate n1=LocalDate.parse(date13);
				System.out.println(n1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
			}
		}else {
			String date12=date11+""+month1;
			if(day<10) {
				String date13=date12+"-0"+day1;
				LocalDate n1=LocalDate.parse(date13);
				System.out.println(n1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
			}else {
				String date13=date12+"-"+day1;
				LocalDate n1=LocalDate.parse(date13);
				System.out.println(n1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
			}
		}
		
		System.out.println("把月份修改为09:");
		String date21=year1+"-";
		String date22=date21+"09-";
		if(day<10) {
			String date23=date22+"0"+day1;
			LocalDate n2=LocalDate.parse(date23);
			System.out.println(n2.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
		}else {
			String date23=date22+""+day1;
			LocalDate n2=LocalDate.parse(date23);
			System.out.println(n2.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
		}
		
		
		System.out.println("把日期修改为09:");
		String date31=year1+"-";
		if(month<10) {
			String date32=date31+"0"+month1;
			String date33=date32+"-09";
			LocalDate n3=LocalDate.parse(date33);
			System.out.println(n3.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
		}else {
			String date32=date31+""+month1;
			String date33=date32+"-09";
			LocalDate n3=LocalDate.parse(date33);
			System.out.println(n3.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
		}
	}
}
