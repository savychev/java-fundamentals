public class OrderDriver {
    public static void main(String[] args) {
        System.out.println(Order.result + "_");   // (3)
        System.out.println(Order.result + "_");   // (4)
        new Order();                            // (5)
        new Order();                            // (6)
        System.out.println(Order.result + "_");   // (7)
    }
}
