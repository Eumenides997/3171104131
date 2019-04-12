package 常用类联系_4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class text4 {
	
	public static void main(String[] args) {
		
		String s="(0000)0000-0000";
		
		System.out.println(s.matches("\\(\\d{4}\\)\\d{4}\\-\\d{4}"));
		//第(1)题
		
		String ipadress="5465as4d200.33.1.85aw4d5200.33.1.8a4s65d4a";
		Pattern p=Pattern.compile("(\\d{1,3}\\.){3}\\d{1,3}");
		Matcher m=p.matcher(ipadress);

		while(m.find()) {
			System.out.println(m.group());
		}
		//第(2)题  PS:照书上的ip地址表达式写的，可能有几率出错
		
		String s1="aaaabbbbccccddd";
		
		String s12=s1.replaceAll("(.)(\\1)*","$1");
		System.out.println(s12);
		//第(3)题
		
        String s2="abcabcabc";
		
		String s22=s2.replaceAll("(abc)(\\1)*","$1");
		System.out.println(s22);
		//第(4)题
		
		
	}

}
