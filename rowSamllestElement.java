package ARRYASPROGR2D;

public class rowSamllestElement {
public static void main(String[] args) {
	int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int small;
	for (int i = 0; i < arr.length; i++) {
		small=arr[i][0];
		for (int j = 0; j < arr[i].length; j++) {
			if(small>arr[i][j])
				small=arr[i][j];
		}
		System.out.print(small+" ");
	}
}
}
