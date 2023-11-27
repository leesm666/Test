package Sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {

        int[] A = new int[] {30, 60, 90, 10, 40, 80, 40, 20, 10, 60, 50, 30, 40, 90, 80};
        int[] gap = new int[] {5, 4, 3, 2, 1}; // 간격

        for (int h : gap) {
            for (int i = h; i <= A.length-1; i++) {
                int CurrentElement = A[i];
                int j = i;

                while (j>=h && A[j-h]> CurrentElement) {
                    A[j] = A[j-h];
                    j = j-h;
                }

                A[j] = CurrentElement;
            }
        }
        // 배열출력
        System.out.println(Arrays.toString(A));

    }
}
