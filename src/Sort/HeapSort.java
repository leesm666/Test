package Sort;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {

        int[] A = new int[] {90, 30, 50, 20, 40, 10, 80, 60, 70};
        int heapSize = A.length;

        heapSort(A, heapSize);

        System.out.println(Arrays.toString(A));


    }

    static void heapSort(int[] A, int heapSize){
        // 힙구성
        heapify(A, heapSize);

        for (int i = heapSize-1; i >= 0; i--) {
            swap(A, 0, i); // 마지막 요소를 루트로 옮김

            heapify(A, i); //heapdown
        }

    }

    // 최대힙 정렬 만드는 메소드
    static void heapify(int[] A, int last){
        for (int i = 1; i < last; i++) {
            int child = i;

            while (child > 0) {
                int parent = (child - 1)/2;

                if(A[child] > A[parent]) {
                    swap(A, child, parent);
                }
                child = parent;
            }
        }
    }

    // 요소 위치 바꿈
    static void swap(int[] A, int idx1, int idx2){
        int temp = A[idx1];
        A[idx1] = A[idx2];
        A[idx2] = temp;
    }
}
