public class Arrays {
    public static void  main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};
        printArray(numbers);
        System.out.println(sumArray(numbers));
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
