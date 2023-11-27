package Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        
        int[] A = new int[] { 40, 10, 50, 90, 20, 80, 30, 60 };
        int i, j, min, temp;

        for (i = 0; i <= A.length-2; i++) {
            min = i; 
            for (j = i+1; j<= A.length-1; j++) {
                if (A[j]<A[min]) { // j번째 원소가 min원소보다 작다면 min인덱스값 갱신
                    min = j;
                }
            }

            temp = A[i];
            A[i] = A[min];
            A[min] = temp;
        }

        // 배열출력
        System.out.println(Arrays.toString(A));
        
    }
}
