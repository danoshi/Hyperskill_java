import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int erg = 0;
        while (scanner.hasNext()){
            int input = scanner.nextInt();
            if(input > erg){
                erg = input;
            }
            if(input == 0){
                break;
            }
        }
        System.out.println(erg);
    }
}