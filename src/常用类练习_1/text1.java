package ��������ϰ_1;

import java.io.IOException;

public class text1 {
	
	public static void main(String[] args) throws IOException{
		
		String s="this is a test of java";
		char[] s1=s.toCharArray();
		//��һ�ֵ������
		
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s1[i]);
		}
		System.out.print("\n");
		
		StringBuffer s2=new StringBuffer(s);
		System.out.print(s2.reverse());
		
		/*String[] split = s.split(" ");
		
		for(int i=0;i<split.length;i++) {
			String s1 = split[i].substring(0, 1).toUpperCase()+split[i].substring(1);
			System.out.print(s1+" ");
		}//��1��ĵڣ�4��С��
		
		int number=0;
		
		char[] str=s.toCharArray();
		System.out.print("�浽�ַ�����str:  ");
		
		for(int i=0;i<s.length();i++) {
			System.out.print(str[i]);
		}//��1��ĵڣ�3��С��
		
		for(int i=0;i<s.length();i++) {
			if(s1[i]=='s') {
				number++;
			}
		}
		
		System.out.print("'s'�ĸ���: "+number+"��")
		//��1��ĵڣ�1��С��
		
		for(int i=0;i<s.length();i++) {
			if(s1[i]=='t'&&s1[i+1]=='e'&&s1[i+2]=='s'&&s1[i+3]=='t') {
				System.out.print("�ҵ���'test':  "+s1[i]+s1[i+1]+s1[i+2]+s1[i+3]);
			}
		}
		//��1��ĵڣ�2��С��
		;*/	
				
	}

}
