package 常用类练习_6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class text6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[10];
		Random r=new Random(100);
		for(int i=0;i<10;i++) {			
			arr[i]=r.nextInt(100);
			System.out.println(arr[i]);//给arr[i]随机赋值
		}
		
		System.out.println("-------------------------------------");
		int arr1[]=new int[10];
		System.arraycopy(arr, 0, arr1, 0, 10);//将arr复制到arr1中
		for(int i=0;i<10;i++) {			
			System.out.println(arr1[i]);
		}
		
		System.out.println("-------------------------------------");
		Arrays.parallelSort(arr1);//将arr1进行排序
		for(int i=0;i<10;i++) {			
			System.out.println(arr1[i]);
		}

		System.out.println("-------------------------------------");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int find=-1;
		if((find=Arrays.binarySearch(arr1, s))>-1) {//寻找元素
			System.out.println("元素位置在:"+find);
		}else {
			System.out.println("arr1数组没有该元素");
		}

	}

}
