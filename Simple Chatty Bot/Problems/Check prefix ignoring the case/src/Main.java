import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        String letter = "J";

        word = word.toUpperCase();

        if(word.startsWith(letter)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}