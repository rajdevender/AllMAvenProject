package ARRYASPROGR2D;

import java.util.Scanner;

public class TranposeMatrix {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Entre the rows");
	int row=sc.nextInt();
	System.out.println("Enter the column");
	int col=sc.nextInt();
	
	System.out.println("entre"+row*col+"eleemnt");
	int arr[][]=new int[row][col];
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	int ans[][]=new int[col][row];
	for (int i = 0; i < ans.length; i++) {
		for (int j = 0; j < ans[i].length; j++) {
			arr[i][j]=arr[j][i];
		}
	}
	System.out.println("transpose matrix");
	for (int i = 0; i < ans.length; i++) {
		for (int j = 0; j < ans[i].length; j++) {
			System.out.print(arr[j][i]+" ");
		}
		System.out.println();
	}
}
}
