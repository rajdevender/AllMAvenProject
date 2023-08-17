package ARRYASPROGR2D;

public class Biggestelementrows {
public static void main(String[] args) {
	int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int big;
	for (int i = 0; i < arr.length; i++) {
		big=arr[i][0];
		for (int j = 0; j < arr[i].length; j++) {
			if(big<arr[i][j])
				big=arr[i][j];
		}
		System.out.print(big+" ");
	}
}
}
