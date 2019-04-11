package 常用类练习_3;

public class text3 {
	
	public static void main(String[] args) {
		int s=520;
		Integer x=new Integer(99);
		
		Integer x1=new Integer(s);
		System.out.println(x1);
		//基本数据类型转化为包装类
		
		int s1=x.intValue();
		System.out.println(s1);
		//包装类转化基本数据类型
		
		String str="123";
		Integer strx=new Integer(str);
		System.out.println(strx);
		//字符串转化包装类
		
		String strxs=strx.toString();
		System.out.println(strxs);
		//包装类转化字符串
		
		String str1=Integer.toString(s);
		System.out.println(str1);//法一
		String str2=String.valueOf(s);
		System.out.println(str2);//法二
		String str3=s+"";
		System.out.println(str3);//法三
		//基本数据类型转化字符串
		
		String str4="777";
		int s2=Integer.parseInt(str4);
		System.out.println(str4);//法一
		
		int s3=Integer.valueOf(str4);
		System.out.println(str4);//法二
		//字符串转化基本数据类型
	}

}
