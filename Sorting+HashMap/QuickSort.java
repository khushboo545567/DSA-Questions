public class QuickSort {
    public void QS(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = fun(arr, low, high);
            QS(arr, low, partitionIndex - 1);  // Sort left subarray
            QS(arr, partitionIndex + 1, high); // Sort right subarray
        }
    }

    public int fun(int[] arr, int low, int high) {
        int pivot = arr[low];  // Choose pivot as the first element
        int i = low + 1;
        int j = high;

        while (i <= j) {
            while (i <= high && arr[i] <= pivot) {
                i++;
            }
            while (j >= low && arr[j] > pivot) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        
        swap(arr, low, j);  // Swap pivot with correct position
        return j;  // Return pivot index
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 1, 8, 3, 7, 10};
        QuickSort q = new QuickSort();
        q.QS(arr, 0, arr.length - 1);

        // Print sorted array after sorting
        System.out.println("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
