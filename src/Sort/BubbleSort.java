package Sort;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] A = new int[]{40, 10, 50, 90, 20, 80, 30, 60};
        int i, j, temp;

        for(i = 0; i < A.length; i++) {
            for (j = 0; j < A.length-i-1; j++) {
                if (A[j] > A[j+1]) {

                    temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;

                }
            }
        }

        // 배열출력
        System.out.println(Arrays.toString(A));

    }
}
