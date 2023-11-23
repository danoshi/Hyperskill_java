import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int erg = 0;
        int sum = 0;
        do {
            erg++;
            sum = erg * erg;
            if(sum <= input) {
                System.out.println(sum);
            }
        }
        while (sum <= input);
    }
}