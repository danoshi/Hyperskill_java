import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        while (input != 1){
            System.out.print(input+ " ");
            if(input % 2 == 0){
                input = input /2;
            }
            else if(input %2 != 0){
                input = (input*3) +1;
            }
        }
        System.out.print(1);
    }
}