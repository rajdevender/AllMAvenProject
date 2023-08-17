package ARRYASPROGR2D;

import java.util.Scanner;

public class DimensionalArray2D {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Entre the no of rows");
	int row=sc.nextInt();
	
	System.out.println("Entre the no of columns");
	int col=sc.nextInt();
	
	int arr[][]=new int[row][col];
	
	System.out.print("Entre"+row*col+"element");
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	System.out.println("After the loading");
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			System.out.print(arr[i][j]+" ");
		}
	}
	System.out.println();
}
}
