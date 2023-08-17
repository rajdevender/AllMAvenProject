package ARRYASPROGR2D;

public class TransposeMatrix {
public static void main(String[] args) {
	int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int ans[][]=transpose(arr);
	for (int i = 0; i < ans.length; i++) {
		for (int j = 0; j < ans[i].length; j++) {
			System.out.println(ans[i][j]+" ");
		}
		System.out.println();
	}
}

private static int[][] transpose(int[][] arr) {
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			arr[j][i]=arr[i][j]*arr[i][j];
		}
	}
	return arr;
}
}
