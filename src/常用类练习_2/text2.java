package ��������ϰ_2;

public class text2 {

	public static void main(String[] args) {
		String s="�ú�ѧϰ��������";
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb);
		//Stringת��StringBuffer
		
		StringBuffer sb1=new StringBuffer();
		sb1.append(s);
		System.out.println(sb1);
		//StringBuffer�����ͨ�����Stringʵ��Stringת��StringBuffer
		
		String s1=new String(sb);
		System.out.println(sb);
		//����һ���µ�String��StringBufferת��String
		
		String s2=sb.toString();
		System.out.println(s2);
		//ͨ��toString��StringBufferת��String
		
		sb.append(",�Ұ�ѧϰ");
		System.out.println(sb);
		//StringBuffer�����
		
		sb.delete(4, sb.length());
		System.out.println(sb);
		//StringBuffer��ɾ��
		
		sb.insert(4, ",�Ұ�ѧϰ");
		System.out.println(sb);
		//StringBuffer�Ĳ���
		
		sb.reverse();
		System.out.println(sb);
		//StringBuffer�ķ�ת
	}
	
}
