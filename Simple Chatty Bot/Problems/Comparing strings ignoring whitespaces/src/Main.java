import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String newstr1 = str1.replaceAll(" ", "").trim();
        String newstr2 = str2.replaceAll(" ", "").trim();
        if(newstr1.equals(newstr2)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}