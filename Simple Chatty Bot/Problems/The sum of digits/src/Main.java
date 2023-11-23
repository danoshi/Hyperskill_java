import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num1 = scanner.nextInt();

        int erg1 = num1 / 100;
        int erg2 = num1 % 100;
        int erg3 = erg2 / 10;
        int erg4 = erg2 % 10;

        int erg = erg1 + erg3 + erg4;
        System.out.println(erg);
    }
}