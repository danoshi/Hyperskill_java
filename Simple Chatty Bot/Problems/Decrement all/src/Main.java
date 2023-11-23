import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h1 = scanner.nextInt();
        int h2 = scanner.nextInt();
        int h3 = scanner.nextInt();
        int h4 = scanner.nextInt();

        int a1 = --h1;
        int a2 = --h2;
        int a3 = --h3;
        int a4 = --h4;

        System.out.println(a1 + " " + a2 + " " + a3 + " " + a4 + " ");


    }
}