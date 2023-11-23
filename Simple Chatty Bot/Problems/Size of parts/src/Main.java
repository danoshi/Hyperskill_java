import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;

        for(int i = 0; i < input; i++){
            int input2 = scanner.nextInt();
            if (input2 == 0){
                perfect ++;
            }

            if(input2 == 1){
                larger ++;
            }

            if (input2 == -1){
                smaller ++;
            }
        }
        System.out.println(perfect + " " + larger + " " + smaller);
    }
}