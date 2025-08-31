public class QuickSort {
    public static void SortArray(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            SortArray(arr, low, pi - 1);
            SortArray(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i + 1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] num = {2, 5, 9, 4, 1, 3};
        SortArray(num, 0, num.length - 1);

        // Output the sorted array
        for (int n : num) {
            System.out.print(n + " ");
        }
    }
}
