package bj_2577;

import java.util.Scanner;

public class bj_2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int sum = a*b*c;
		String s = Integer.toString(sum);
		for(int i=0; i<s.length(); i++) {
			String temp = s.substring(i,i+1);	//�ѱ��ھ� �̱�
			int numInt = Integer.parseInt(temp);	//string -> int ��ȯ
			arr[numInt] += 1;
		}
	
		
		for(int i =0; i<10; i++) {
			System.out.println(arr[i]);
		}
	
				
		
	}
	

}
