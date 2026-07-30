package be.intecbrussel.les4;

public class LoopWhile3 {
    public static void main(String[] args) {
       boolean hungry = true;
       int count = 0;

        System.out.println("Take flour");
        System.out.println("Add milk");
        System.out.println("Add eggs");
        System.out.println("Mix ingredients");

        while (hungry){
            ++count;

            System.out.println("Bake pancake "+count);
            System.out.println("Eat pancake "+count);

            if(count == 4) {
                hungry = false;
            }
        }
    }
}
