package Selection0518;

public class SelectionSort {

	public static void main(String[] args) {
		
		// 선택정렬 : 가장작은것을 선택해 맨 앞으로 보낸다
		// 선택정렬의 시간 복잡도 : O(N^2)이다 => 별로 안좋다
		int i, j, min, index, temp;
		int arr[] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9}; 
		for(i = 0; i < 10; i++ ) {
			min = 9999;
			for(j = i; j < 10; j++) {
				if(min > arr[j]) {
					min = arr[j];
					index = j;
					
				temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
				}
			}
			
		}
		for (i =0; i < 10; i++ ) {
			System.out.printf("%d " , arr[i]);
		}
	}

}
