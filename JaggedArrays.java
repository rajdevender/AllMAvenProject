package ARRYASPROGR2D;

public class JaggedArrays {
public static void main(String[] args) {
     int arr[]= {1,2,3,4};
     int brr[]= {5,6,7,8};
     int crr[]= {9,1,8,3};
     int drr[]= {6,9};
     
     int ans[][]= {arr,brr,crr,drr};
     for (int i = 0; i < ans.length; i++) {
		for (int j = 0; j < ans[i].length; j++) {
			System.out.print(ans[i][j]+" ");
		}
		System.out.println();
	}
 }
}
