package no45;

import java.util.Scanner;

public class Sum_of_2DArray {

	public static void main(String[] args) {
		int arr2d[][] = new int[301][301];
		int a,b,num;
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		
		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= b; j++) {
				num = scan.nextInt();
				arr2d[i][j] = arr2d[i-1][j] + num - arr2d[i-1][j-1];
			}
		}
		
		int cnt, i, j, p, q;
		cnt = scan.nextInt();
		for (int c = 1; 1 <= cnt; c++) {
			i = scan.nextInt();
			j = scan.nextInt();
			p = scan.nextInt();
			q = scan.nextInt();
			
			System.out.println(arr2d[p][q] - arr2d[i-1][q] - arr2d[p][j-1] + arr2d[i-1][j-1]);
		}

	}

}
