package ARRYASPROGR2D;

public class ARRAY2D {
public static void main(String[] args) {
//	int arr[][]= {{1,2,3},{4,5,6}};  //2D ARRAYS
//	System.out.print(arr[1][2]);
	
//	FETCH THE VALUE FROM THE MATRIX
	int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};
	for (int i = 0; i < arr1.length; i++) {
		for (int j = 0; j < arr1.length; j++) {
			System.out.print(arr1[i][j]+" ");
		}
		System.out.println();
	}
	
 }
}
