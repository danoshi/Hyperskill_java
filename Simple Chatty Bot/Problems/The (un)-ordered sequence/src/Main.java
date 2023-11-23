import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int previous = sc.nextInt();
        boolean asc = false;
        boolean des = false;
        while (true) {
            int value = sc.nextInt();
            if (value ==0) {
                break;
            }
            if (value < previous) {
                des = true;
            } else if (value > previous) {
                asc = true;
            }
            previous = value;
        }
        System.out.println(!(asc && des));
    }
}
