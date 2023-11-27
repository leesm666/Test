package Sort;
import java.util.Arrays;

public class InsertinoSort {
    public static void main(String[] args) {

        // int[] A = new int[] { 40, 10, 50, 90, 20, 80, 30, 60};

        int[] A = new int[] {9,6,7,3,5};
        int i, j, CurrentElement;

        for (i = 1; i <= A.length-1; i++) {
            CurrentElement = A[i];
            j = i - 1;

            while (j>=0 && A[j] > CurrentElement) { //조건만족시(불만족이면 삽입)
                A[j+1] = A[j]; // 자리이동
                j--;
            }

            A[j+1] = CurrentElement;
        }
        // 배열출력
        System.out.println(Arrays.toString(A));
        
    }
}
