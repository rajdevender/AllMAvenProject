package ARRYASPROGR2D;

import java.util.Scanner;

public class AntiClockWiseRotation {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the row");
	int row=sc.nextInt();
	System.out.println("Enter the column");
	int col=sc.nextInt();
	
	System.out.println("Entre"+row*col+"Element");
	int arr[][]=new int[row][col];
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	System.out.println("AntiClockWiseRotation ");
	for (int i = arr.length-1;i>=0;i--) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[j][i]+" ");
		}
		System.out.println();
	}
}
}
