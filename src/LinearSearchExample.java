public class LinearSearchExample{
    public static void main(String[] args) {
        int[] numbers = {3, 8, 15, 23, 42, 56, 70, 81, 99};
        int target = 42;

        int result = linearSearch(numbers, target);

        if (result != -1) {
            System.out.println("Número encontrado no índice: " + result);
        } else {
            System.out.println("Número não encontrado.");
        }
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Comparando com: " + arr[i]);
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}