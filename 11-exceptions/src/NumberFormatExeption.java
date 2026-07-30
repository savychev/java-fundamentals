public class NumberFormatExeption {
    public static void main(String[] args) {
        int a;
        try {
            a = Integer.parseInt("HILAL");
            System.out.println("A is: " + a);
        } catch (NumberFormatException e) {
            e.printStackTrace();
//            System.out.println("Message: " + e.getMessage());
//            System.out.println("Message: " + e.toString());
            System.out.println("Code werkt!");
        }
    }
}
