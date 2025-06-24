public class Main {
    public static void main(String[] args) {
        int[] numbers = {3, 8, 15, 23, 42, 56, 70, 81, 99};
        int target = 15;

        int result = binarySearch(numbers, target);

        if (result != -1) {
            System.out.println("Número encontrado no índice: " + result);
        } else {
            System.out.println("Número não encontrado.");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            System.out.println("Comparando com: " + arr[middle]);

            if (arr[middle] == target) {
                return middle;
            } else if (arr[middle] < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }
}