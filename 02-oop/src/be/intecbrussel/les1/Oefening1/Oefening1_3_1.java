package be.intecbrussel.les1.Oefening1;

// nog een manier om Oefening3 op te lossen
class Oefening1_3_1 {
    public static void main(String[] args) {
        String str = "hello world";
        String result = "";
        String symbol;

        int length = str.length();

        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                symbol = str.toUpperCase().substring(i, i + 1);
                result += symbol;
            } else {
                symbol = str.toLowerCase().substring(i, i + 1);
                result += symbol;
            }
        }
        System.out.println(result);
    }
}