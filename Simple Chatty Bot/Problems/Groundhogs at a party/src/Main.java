import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rez = scanner.nextInt();
        boolean rez2 = scanner.nextBoolean();

        boolean wekk = (rez >= 10 && rez <= 20 && rez2 == false|| rez >= 15 && rez <= 25 && rez2 == true);
        System.out.println(wekk);

    }
}