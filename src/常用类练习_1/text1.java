package ��������ϰ_1;

import java.io.IOException;
import java.io.InputStreamReader;

public class text1 {
	
	public static void main(String[] args) throws IOException{
		
		String s="this is a test of java";
		char[] s1=s.toCharArray();
		int number=0;
		
		for(int i=0;i<s.length();i++) {
			if(s1[i]=='s') {
				number++;
			}
		}
		
		System.out.print("'s'�ĸ���: "+number+"��");
		
	}//��1��ĵڣ�1��С��

}
