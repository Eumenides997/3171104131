package 常用类联系_4;

import java.awt.Frame;
import java.awt.Rectangle;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class text4 implements ActionListener {
	
	private Frame myframe;
	private JPanel p1;
	private JPanel p2;
	private JTextField t;
	private JButton b;
	public void view() {
		myframe=new Frame("随便取个名字");
		myframe.setBounds(100,100, 800, 100);
		t=new JTextField(20);
		t.setBounds(new Rectangle(400,80,250,25));
		b=new JButton("开始验证");
		b.setBounds(new Rectangle(500,80,25,25));
		b.addActionListener(this);
		p1=new JPanel();
		p1.add(t);
		p1.add(b);
		myframe.add(p1);
        myframe.setVisible(true);
		}//简单的做一个界面，有输入框和按钮
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b) {
			String s3=t.getText();
			System.out.println(s3.matches("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*"));
		}
	}//按钮按下后进行判断,结果输出到控制台
	
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
	/*	
		 Scanner sc = new Scanner(System.in);
		 String s3=sc.next();
		 System.out.println(s3.matches("\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*"));
		 //控制台输入    
		 new text4().view();
		 //GUI界面调用 PS:只做了输入，没有把结果显示在界面直接把结果输出在控制台了
		 //第(5)题
	*/	 
		
		 String s4="asdasdasdawdasdsadabc";
		 System.out.println(s4.matches("(.*)(abc)"));
		 //第(6)题
		 
		 //第(7)题 这个选做我不会做，我选择不做
		 
		 String s5="256as-348as-d6";
		 int[] arr=new int[20];
		 Pattern p1=Pattern.compile("(\\d{1,4})");
		 Matcher m1=p1.matcher(s5);
		 int i=0;
		 while(m1.find()) {
			 int j=0;
			 j=Integer.parseInt(m1.group());
			 arr[i]=j;
			 i++;
		 }
		 for(int k=0;k<i;k++) {
			 System.out.println("数组["+k+"]:"+arr[k]);
		 }
		 //第(8)题
		 
		 String s6="asdasdpupelassdasdpupelasdasdpupelasdpupel";
		 Pattern p11=Pattern.compile("(pupel)");
		 Matcher m11=p11.matcher(s6);
		 StringBuffer s7=new StringBuffer();
		 while(m11.find()) {
				 m11.appendReplacement(s7, "pupil");
		 }
		 System.out.println(s7);
		 //第(9)题
		 
		 String s8="%...%CXLL=add1,31,123.12%CXLL=add2,32,124%CXLL=,33,125.12%LL=-121.11";
		 Pattern p3=Pattern.compile("(%CXLL=)(.*)(%)");
		 Matcher m3=p3.matcher(s8);
		 StringBuffer s9=new StringBuffer();
		 while(m3.find()) {
				 s9.append(m3.group());
		 }
		 System.out.println("提取的字符串:"+s9);
		 //第(10)题
		 
	}




}
