package 常用类练习_2;

public class text2 {

	public static void main(String[] args) {
		String s="好好学习天天向上";
		StringBuffer sb=new StringBuffer(s);
		System.out.println(sb);
		//String转化StringBuffer
		
		StringBuffer sb1=new StringBuffer();
		sb1.append(s);
		System.out.println(sb1);
		//StringBuffer构造后通过添加String实现String转化StringBuffer
		
		String s1=new String(sb);
		System.out.println(sb);
		//构造一个新的String将StringBuffer转化String
		
		String s2=sb.toString();
		System.out.println(s2);
		//通过toString将StringBuffer转化String
		
		sb.append(",我爱学习");
		System.out.println(sb);
		//StringBuffer的添加
		
		sb.delete(4, sb.length());
		System.out.println(sb);
		//StringBuffer的删除
		
		sb.insert(4, ",我爱学习");
		System.out.println(sb);
		//StringBuffer的插入
		
		sb.reverse();
		System.out.println(sb);
		//StringBuffer的反转
	}
	
}
