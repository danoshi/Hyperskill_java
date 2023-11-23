import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int element = scanner.nextInt();
        int erg = 0;
        for(int i = 0; i < element; i++){
            int element2 = scanner.nextInt();
            if(element2 % 6 == 0){
                erg += element2;
            }
        }
        System.out.println(erg);

    }
}