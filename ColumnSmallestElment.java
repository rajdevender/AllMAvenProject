package ARRYASPROGR2D;

public class ColumnSmallestElment {
public static void main(String[] args) {
	int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int small;
	for (int i = 0; i < arr.length; i++) {
		small=arr[0][i];
		for (int j = 0; j < arr[i].length; j++) {
			if(small>arr[j][i])
				small=arr[j][i];
		}
		System.out.println(small+" ");
	}
}
}
