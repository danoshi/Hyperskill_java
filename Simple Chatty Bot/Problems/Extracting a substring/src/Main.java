import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String scan = scanner.next();
        int scan2 = scanner.nextInt();
        int scan3 = scanner.nextInt();

        String result = scan.substring(scan2, scan3 +1);
        System.out.println(result);

    }
}