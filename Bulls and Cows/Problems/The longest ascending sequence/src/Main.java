import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // input length of array
        int size = scanner.nextInt();

        // build empty array to fill
        int[] arr = new int[size];

        // declare record and current counter
        int record = 1;
        int current = 1;

        // create an array
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        // find max length in sequence
        for (int i = 1; i < size; i++) {
            if (arr[i] > arr[i - 1]) {
                current += 1;
                record = current;
            } else if (arr[i] < arr[i - 1]) {
                current = 1;
            }
        }

        System.out.print(record);
    }
}