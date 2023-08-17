package ARRYASPROGR2D;

import java.util.Iterator;
import java.util.Scanner;

public class transposematrixreverseorderRow {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the row");
	int row=sc.nextInt();
	System.out.println("Entre the coloumn");
	int col=sc.nextInt();
	
	System.out.println("Enter"+row*col);
	int arr[][]=new int[row][col];
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[i].length; j++) {
			arr[i][j]=sc.nextInt();
		}
	}
		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i].length-1;j>=1;j--) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
}
}
