package programmers;

import java.util.Scanner;

public class Star0518 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        int a = sc.nextInt();
	        int b = sc.nextInt();

	        for(int i =0; i<b; i++) {
	        	System.out.print("*");
	        	for(int j =1; j<a;j++) {
	        		System.out.print("*");
	        	}System.out.println();
	        }
	        // �����ϴ� ���� Ǯ��
	        /*for (int i = 0; i < b; i++) {
	            for (int j = 0; j < a; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }*/
	}

}
