package bj_1152;


import java.util.Scanner;

public class bj_1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		String arr[] = sc.nextLine().split(" ");
		

		for (int i = 0; i < arr.length; i++) {
			if(arr[i].equals("")) {
				continue;
			}
			else {
				sum++;
			}

			
		}
		System.out.print(sum);

	}

}
