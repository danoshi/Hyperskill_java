import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        boolean erg = (test < 10)  && (test > 0);
        System.out.println(erg);
    }
}