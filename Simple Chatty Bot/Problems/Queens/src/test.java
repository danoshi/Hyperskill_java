public class test {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = false;
        boolean result = (b1 && b2) ? b1 : (b2 || b3) ? b2 : b3;

        System.out.println(result);
    }
}
