package ��������ϰ_3;

public class text3 {
	
	public static void main(String[] args) {
		int s=520;
		Integer x=new Integer(99);
		
		Integer x1=new Integer(s);
		System.out.println(x1);
		//������������ת��Ϊ��װ��
		
		int s1=x.intValue();
		System.out.println(s1);
		//��װ��ת��������������
		
		String str="123";
		Integer strx=new Integer(str);
		System.out.println(strx);
		//�ַ���ת����װ��
		
		String strxs=strx.toString();
		System.out.println(strxs);
		//��װ��ת���ַ���
		
		String str1=Integer.toString(s);
		System.out.println(str1);//��һ
		String str2=String.valueOf(s);
		System.out.println(str2);//����
		String str3=s+"";
		System.out.println(str3);//����
		//������������ת���ַ���
		
		String str4="777";
		int s2=Integer.parseInt(str4);
		System.out.println(str4);//��һ
		
		int s3=Integer.valueOf(str4);
		System.out.println(str4);//����
		//�ַ���ת��������������
	}

}
