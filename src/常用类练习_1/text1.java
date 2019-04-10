package 常用类练习_1;

import java.io.IOException;
import java.io.InputStreamReader;

public class text1 {
	
	public static void main(String[] args) throws IOException{
		
		String s="this is a test of java";
		char[] s1=s.toCharArray();
		int number=0;
		
		char[] str=s.toCharArray();
		System.out.print("存到字符数组str:  ");
		
		for(int i=0;i<s.length();i++) {
			System.out.print(str[i]);
		}
		
		/*for(int i=0;i<s.length();i++) {
			if(s1[i]=='s') {
				number++;
			}
		}
		
		System.out.print("'s'的个数: "+number+"个")
		//第1题的第（1）小题
		
		for(int i=0;i<s.length();i++) {
			if(s1[i]=='t'&&s1[i+1]=='e'&&s1[i+2]=='s'&&s1[i+3]=='t') {
				System.out.print("找到的'test':  "+s1[i]+s1[i+1]+s1[i+2]+s1[i+3]);
			}
		}
		//第1题的第（2）小题
		;*/	
				
	}

}
