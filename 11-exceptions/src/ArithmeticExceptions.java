public class ArithmeticExceptions {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int c;

        try {
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Het getal kan niet nul zijn!");
        }
        finally {
            System.out.println("Finally code werkt!");
        }
        System.out.println("Finally code werkt!");
    }
}
