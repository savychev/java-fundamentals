package be.intecbrussel.les3;

/** Les 3: if / else-if / else — de eerste ware voorwaarde wint, de rest wordt overgeslagen. */
public class IfElseIfCondition {
    public static void main(String[] args) {
        int time = 19;

        if (time < 10) {
            System.out.println("Good morning!");
        } else if (time < 20) {
            System.out.println("Good day!");
        } else {
            System.out.println("Good evening!");
        }
    }
}
