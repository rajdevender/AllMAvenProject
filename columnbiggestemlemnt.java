package ARRYASPROGR2D;

public class columnbiggestemlemnt {
public static void main(String[] args) {
	int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int big;
	for (int i = 0; i < arr.length; i++) {
		big=arr[0][i];
		for (int j = 0; j < arr[i].length; j++) {
			if(big<arr[j][i])
				big=arr[j][i];
		}
		System.out.println(big+" ");
	}	
}
}
