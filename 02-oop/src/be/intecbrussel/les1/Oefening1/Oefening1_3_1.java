package be.intecbrussel.les1.Oefening1;

/**
 * Oefening 1.3 (alternatief) - dezelfde opgave opgelost met
 * toUpperCase()/toLowerCase() + substring() in plaats van charAt().
 */
class Oefening1_3_1 {
    public static void main(String[] args) {
        String str = "hello world";
        String result = "";
        String symbol;

        int length = str.length();

        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                // substring(i, i + 1) haalt exact 1 karakter op als String
                symbol = str.toUpperCase().substring(i, i + 1);
            } else {
                symbol = str.toLowerCase().substring(i, i + 1);
            }
            result += symbol;
        }
        System.out.println(result);
    }
}
