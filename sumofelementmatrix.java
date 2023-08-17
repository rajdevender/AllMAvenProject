package ARRYASPROGR2D;

public class sumofelementmatrix {
public static void main(String[] args) {
//	int arr[][]= {{1,2,3},{4,5,6}}; //SUM OF THE ALL ELEMENT OF MARTIX
//	int sum=0;
//	for (int i = 0; i < arr.length; i++) {
//		for (int j = 0; j < arr[i].length; j++) {
//			sum+=arr[i][j];
//		}
//		System.out.println(sum);
//	}
//	System.out.println();
	
	int arr1[][]= {{1,2,3},{4,5,6},{7,8,9}};//SUM OF THE ROWS WISE MARTIX 
	int sum;
	for (int i = 0; i < arr1.length; i++) {
		int sum1=0;
		for (int j = 0; j < arr1[i].length; j++) {
			sum1+=arr1[i][j];
		}
		System.out.print(sum1);
	}
	System.out.println();
	
	int arr2[][]= {{1,2,3},{4,5,6},{7,8,9}};//SUM OF THE COLUMNS WISE MARTIX 
	int sum1;
	for (int i = 0; i < arr2.length; i++) {
		int sum2=0;
		for (int j = 0; j < arr2[j].length-1; j++) {
			sum2+=arr2[i][j];
		}
		System.out.print(sum2);
	}
	System.out.println();
}
}
