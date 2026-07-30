package be.intecbrussel.les1;

public class Test {
    public static void main(String[] args) {
        StringBuilder word = new StringBuilder("adam");

        System.out.println(word);

        StringBuilder wordReverse = new StringBuilder(word.reverse());

        System.out.println(word);
        System.out.println(wordReverse);
    }
}
