package robots;

public class MainApp {
    public static void main(String[] args) {
        BendingRobot br = new BendingRobot("Bender", 90);
        br.bend(45);
        br.bend(180);
        System.out.println(br);

        System.out.println("");

        LiftingRobot lr = new LiftingRobot("Lifter", 100);
        lr.lift(50);
        lr.lift(150);
        System.out.println(lr);

        System.out.println("");

        CrazyRobot cr = new CrazyRobot("GEK");
        System.out.println(cr);
    }
}
