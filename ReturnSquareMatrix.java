package ARRYASPROGR2D;

public class ReturnSquareMatrix {
public static void main(String[] args) {
	int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int[][] ans=square(arr);
	for (int i = 0; i < ans.length; i++) {
		for (int j = 0; j < ans[i].length; j++) {
			System.out.print(ans[i][j]+" ");
		}
		System.out.println();
	}
   }
static int[][] square(int arr[][])
{
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr.length; j++) {
			arr[i][j]=arr[i][j]*arr[i][j];
		}
	}
	return arr;
}
}
