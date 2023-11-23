import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;


        for(int i = 0; i < input; i++){
            int grade = scanner.nextInt();
            if(grade == 5){
                A ++;
            }
            if(grade == 4){
                B ++;
            }
            if(grade == 3){
                C ++;
            }
            if(grade == 2){
                D ++;
            }
        }
        System.out.println(D + " " + C + " " + B + " " + A);
    }
}