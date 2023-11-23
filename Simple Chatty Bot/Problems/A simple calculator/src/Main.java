import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        long  number = scanner.nextLong();
        String operator = scanner.next();
        long number2 = scanner.nextLong();

        switch (operator){
            case "+":
                long resultadd = number + number2;
                System.out.println(resultadd);
                break;
            case "-":
                long resultminus = number - number2;
                System.out.println(resultminus);
                break;
            case "*":
                long resultmal = number * number2;
                System.out.println(resultmal);
                break;
            case "/":
                if(number == 0 || number2 == 0){
                    System.out.println("Division by 0!");
                }
                else {
                    long resultdiv = number / number2;
                    System.out.println(resultdiv);
                }
                break;
            case "!":
                System.out.println("Unknown operator");
        }

    }
}