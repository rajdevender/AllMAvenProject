package ARRYASPROGR2D;

import java.util.Scanner;

public class RotateClockWise {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the row");
	int row=sc.nextInt();
	System.out.println("Entre the column");
	int col=sc.nextInt();
	
	System.out.println("Entre"+row*col+"element");
	int arr[][]=new int[row][col];
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	System.out.println("RotateClockWise");
	for (int i = 0; i < arr.length; i++) {
		for (int j =arr[i].length-1;j>=0;j--) {
			System.out.print(arr[j][i]+" ");
		}
		System.out.println();
	}
}
}
