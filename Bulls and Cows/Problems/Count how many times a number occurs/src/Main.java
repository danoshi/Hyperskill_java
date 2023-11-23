import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // input length of array
        int size = scanner.nextInt();

        // build empty array to fill
        int[] arr = new int[size];
        // create an array
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int num = scanner.nextInt();
        int help = 0;

        for (int i = 0; i < size; i++){
            if(num == arr[i]){
                help++;
            }
        }
        System.out.println(help);
    }

}